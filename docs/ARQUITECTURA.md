# Arquitectura de TaskFlow

Este documento es una guía rápida para un desarrollador nuevo sobre la estructura del proyecto, el recorrido de una petición y dónde están las reglas de negocio, la seguridad y los tests.

## Resumen rápido
- Paquete raíz: `com.taskflow`.
- Capas: HTTP (controladores) → Service (casos de uso) → Repository (persistencia) → Model (dominio).
- DTOs y mappers sirven de frontera entre HTTP y dominio.

## Capas y paquetes (con ejemplos)
- Controladores (puerta HTTP): `com.taskflow.controller`.
  - Ej.: `src/main/java/com/taskflow/controller/TaskController.java` (`TaskController`), `src/main/java/com/taskflow/controller/ProjectController.java` (`ProjectController`).
- Servicio (orquestación y casos de uso): `com.taskflow.service`.
  - Ej.: `src/main/java/com/taskflow/service/TaskService.java` (`TaskService`), `src/main/java/com/taskflow/service/ProjectService.java` (`ProjectService`).
- Repositorio (Spring Data JPA): `com.taskflow.repository`.
  - Ej.: `src/main/java/com/taskflow/repository/TaskRepository.java` (`TaskRepository`).
- Modelo / Dominio (reglas y comportamiento): `com.taskflow.model`.
  - Ej.: `src/main/java/com/taskflow/model/Task.java` (`Task`).
- DTOs y mappers: `com.taskflow.dto` y `com.taskflow.mapper`.
  - Ej.: `src/main/java/com/taskflow/dto/TaskRequest.java` (`TaskRequest`), `src/main/java/com/taskflow/dto/TaskResponse.java` (`TaskResponse`), `src/main/java/com/taskflow/mapper/TaskMapper.java` (`TaskMapper`).
- Seguridad: `com.taskflow.security` y `com.taskflow.config`.
  - Ej.: `src/main/java/com/taskflow/config/SecurityConfig.java` (`SecurityConfig`), `src/main/java/com/taskflow/security/JwtService.java` (`JwtService`), `src/main/java/com/taskflow/security/JwtAuthenticationFilter.java` (`JwtAuthenticationFilter`), `src/main/java/com/taskflow/security/ProjectSecurity.java` (`ProjectSecurity`).
- Config y utilidades: `src/main/java/com/taskflow/config/DataSeeder.java` (`DataSeeder`).
- Manejo de errores/advice: `src/main/java/com/taskflow/advice/GlobalExceptionHandler.java` (`GlobalExceptionHandler`).

## Recorrido de POST /projects/{projectId}/tasks (detalle)
1. El cliente hace POST a `/projects/{projectId}/tasks` con un JSON que corresponde a `TaskRequest`.
   - Controlador: `src/main/java/com/taskflow/controller/TaskController.java` → método `createTask`.
   - El cuerpo está anotado `@Valid` y usa `src/main/java/com/taskflow/dto/TaskRequest.java` (`TaskRequest`).
2. Validaciones de contrato (Bean Validation) se ejecutan automáticamente; fallan -> 400 (manejado por `GlobalExceptionHandler`).
3. `TaskController.createTask` comprueba que el proyecto existe llamando a `ProjectService.buscarPorId(projectId)` (`src/main/java/com/taskflow/service/ProjectService.java`); si no existe lanza `ProjectNotFoundException` → 404.
4. Tras validar el proyecto, el controlador llama a `TaskService.crear(request, projectId)` (`src/main/java/com/taskflow/service/TaskService.java`).
5. Dentro de `TaskService.crear`:
   - Se convierte el DTO a entidad con `TaskMapper.aEntidadNueva(request, projectId)` (`src/main/java/com/taskflow/mapper/TaskMapper.java`), que a su vez invoca la fábrica de dominio `Task.crear(...)` (`src/main/java/com/taskflow/model/Task.java`).
   - La entidad resultante se persiste con `TaskRepository.save(nueva)` (`src/main/java/com/taskflow/repository/TaskRepository.java`) y se devuelve la entidad guardada (con `id`).
6. El controlador recibe la tarea creada, construye la URI de `Location` a `/tasks/{id}` y responde `201 Created` con el cuerpo mapeado por `TaskMapper.aResponse(creada)` (`src/main/java/com/taskflow/mapper/TaskMapper.java`).

## Dónde viven las reglas de negocio
- Reglas de integridad y comportamiento pertenecen al dominio (`Task`): `src/main/java/com/taskflow/model/Task.java`.
  - Ejemplos: la factory `Task.crear(...)` aplica restricciones temporales; `Task.setStatus(...)` valida transiciones (p.ej. no pasar a `DONE` sin responsable).
- `TaskService` orquesta y traduce excepciones de dominio a errores de aplicación (p.ej. convertir una validación de estado en `TaskStateException` para mapear a 422).
- Validaciones de entrada y contractos (tamaños, notblank) se aplican en los DTOs (`TaskRequest`) con Bean Validation.
- No duplicar lógica de dominio en controladores ni servicios: invocar y confiar en las reglas del modelo.

## Seguridad (JWT)
- Configuración: `src/main/java/com/taskflow/config/SecurityConfig.java` (`SecurityConfig`) define rutas públicas y bloqueadas.
  - Rutas públicas: `/auth/**`, `/info`, Swagger, consola H2 y archivos estáticos.
  - Todo lo demás requiere autenticación JWT.
- Emisión y verificación de tokens: `src/main/java/com/taskflow/security/JwtService.java` (`JwtService`).
- Filtrado de requests: `src/main/java/com/taskflow/security/JwtAuthenticationFilter.java` (`JwtAuthenticationFilter`) extrae el token, lo valida con `JwtService` y construye la `Authentication` en el `SecurityContext`.
- Carga de usuarios: `src/main/java/com/taskflow/service/JpaUserDetailsService.java` (`JpaUserDetailsService`) implementa `UserDetailsService` para Spring Security.
- Autenticación (login): `src/main/java/com/taskflow/controller/AuthController.java` (`AuthController`) expone `/auth/login` que devuelve el JWT.
- Autorización basada en roles y reglas de proyecto: `ProjectSecurity` (`src/main/java/com/taskflow/security/ProjectSecurity.java`) se usa desde `@PreAuthorize` en controladores para comprobaciones finas (p.ej. borrar proyecto solo owner o ADMIN).

## Organización de tests
- Tests unitarios: `src/test/java` — JUnit5 + Mockito; pruebas de servicios y mappers sin Spring.
- Slice tests: `@WebMvcTest` o `@DataJpaTest` para controladores y repositorios.
- Integration tests: `@SpringBootTest` con perfil `test`. Tests de integración con Testcontainers (`*IT.java`) están aislados y NO se ejecutan por defecto con `mvn test` a menos que se active `-Ddocker.tests=true`.
- Comandos habituales:
  - Ejecutar la suite normal: `mvn -q test`.
  - Ejecutar una sola clase: `mvn -q test "-Dtest=TaskServiceTest"`.
  - Levantar la app con H2 (datos de ejemplo): `mvn spring-boot:run "-Dspring-boot.run.profiles=h2"`.

## Notas prácticas
- Nunca duplicar reglas del `Task` en los servicios o controladores: reusar `Task.crear()` y `Task.setStatus()`.
- Los controladores trabajan con DTOs; la entidad NO debe salir directamente por la API. Usa `TaskMapper` para convertir.
- Errores y códigos HTTP consistentes: ver `GlobalExceptionHandler` (`src/main/java/com/taskflow/advice/GlobalExceptionHandler.java`).

---
Archivo creado por Copilot CLI: `docs/ARQUITECTURA.md`. Si quieres que cambie el énfasis o que añada diagramas de secuencia, indícalo.Las fechas límite se validan en `Task` (`src/main/java/com/taskflow/model/Task.java`).

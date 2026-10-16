# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `c4553099-2c94-41d3-bb91-86cf8f664656`  
> - **Started:** 16/10/2026, 1:35:36 p.m.  
> - **Duration:** 58s  
> - **Exported:** 16/10/2026, 1:36:35 p.m.  

---

<sub>2s</sub>

### User

Revisa evidencia/dia4/summary.diff contra la especificación specs/summary.md.

---

<sub>6s</sub>

### Copilot

Voy a abrir en paralelo el diff "evidence/dia4/summary.diff" y la especificación "specs/summary.md" para comparar alcance, contrato y tests según la checklist del revisor. Leer ambos archivos permite verificar cada punto del diff contra la especificación. Ejecutando lectura de ambos archivos ahora.

---

<sub>6s</sub>

### `view` — Failed

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\evidence\dia4\summary.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\evidence\dia4\summary.diff

```
Path does not exist
```


---

<sub>6s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\specs\summary.md.**

C:\Users\Lenovo\taskflow-copilot-carmencc\specs\summary.md

<details>
<summary>52 lines</summary>

````
## Qué se pide

Un endpoint nuevo, `GET /projects/{id}/summary`, que resume un proyecto: **cuántas tareas tiene en
cada estado y cuántas están vencidas**. Sirve para pintar un tablero sin descargar todas las tareas del
proyecto. Pide el token de `POST /auth/login`, como todo lo que no es público.

## Respuesta 200

```json
{
  "projectId": 2,
  "projectName": "App Móvil",
  "totalTasks": 4,
  "byStatus": { "TODO": 1, "IN_PROGRESS": 2, "DONE": 1 },
  "overdue": 1
}
```

| Campo | Tipo | Qué es |
|---|---|---|
| `projectId` | número | el `id` del proyecto pedido |
| `projectName` | texto | el `name` del proyecto |
| `totalTasks` | número | cuántas tareas tiene el proyecto |
| `byStatus` | objeto | una clave por cada valor de `TaskStatus` (`TODO`, `IN_PROGRESS`, `DONE`), **siempre las tres**, aunque valgan 0 |
| `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |

## Reglas

1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
   el estado no es `DONE`. Se reutiliza ese método; no se reescribe la regla en el servicio.
2. Un proyecto **sin tareas** responde 200 con `totalTasks` 0, las tres claves de `byStatus` en 0 y `overdue` 0.
3. Un proyecto **que no existe** responde **404** con el `ErrorResponse` uniforme de siempre
   (`ProjectNotFoundException`, igual que `GET /projects/{id}`).
4. **Sin token** responde **401**, como todo lo que no es público.
5. Cualquier usuario autenticado puede pedir el resumen de cualquier proyecto (igual que `GET /projects/{id}/tasks`).

## Resultado esperado con la semilla del perfil `h2`

| Petición | `totalTasks` | `byStatus` | `overdue` |
|---|---|---|---|
| `GET /projects/1/summary` | 5 | `TODO` 3 · `IN_PROGRESS` 1 · `DONE` 1 | 0 (la tarea 2 tiene fecha pasada, pero está `DONE`) |
| `GET /projects/2/summary` | 4 | `TODO` 1 · `IN_PROGRESS` 2 · `DONE` 1 | 1 (la tarea 7) |
| `GET /projects/3/summary` | 0 | `TODO` 0 · `IN_PROGRESS` 0 · `DONE` 0 | 0 |
| `GET /projects/99/summary` | — | — | 404 |

Si antes de probar creaste tareas en un proyecto (por la UI o con el servidor MCP), `totalTasks` y
`TODO` de ese proyecto suben en la misma cantidad. Al reiniciar la app con el perfil `h2` vuelven a
ser los de la tabla.

## Cómo se construye (convenciones de TaskFlow)

- DTO de salida: un `record` en `com.taskflow.dto`, `ProjectSummaryResponse`.
- La lógica de conteo va en el servicio (`ProjectService`), no en el controller.
- El controller solo traduce HTTP: busca el proyecto (404 si no existe) y delega.
- Tests:
  - **unit** del servicio con Mockito: un proyecto con tareas en los tres estados y una vencida; un proyecto sin tareas.
  - **slice** `@WebMvcTest` del controller: 200 con el JSON de arriba y 404 con un proyecto inexistente.
- `mvn -q test` en verde al terminar, sin modificar tests existentes.

## Criterios de aceptación

- [ ] `GET /projects/2/summary` con el token de `ana` devuelve el JSON del ejemplo.
- [ ] `GET /projects/3/summary` devuelve ceros en los cinco números.
- [ ] `GET /projects/99/summary` devuelve 404.
- [ ] `mvn -q test` en verde: los tests de antes más los nuevos.
````

</details>


---

<sub>11s</sub>

### Copilot

Buscaré en el repositorio cualquier archivo llamado "summary.diff" o rutas bajo "evidence/dia4" para localizar el diff y luego lo abriré. Ejecutando ripgrep para encontrar coincidencias.

---

<sub>11s</sub>

### `grep`

**summary.diff**

"summary.diff"

```
.\.github\agents\revisor.agent.md
```


---

<sub>20s</sub>

### Copilot

Listaré el contenido raíz del repositorio y la carpeta evidencia/dia4 para localizar el diff y poder abrirlo. Ejecutando dos lecturas en paralelo.

---

<sub>20s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc.**

C:\Users\Lenovo\taskflow-copilot-carmencc

<details>
<summary>22 lines</summary>

```
.classpath
.dockerignore
.env.example
.git
.gitattributes
.github
.gitignore
.playwright-mcp
.project
.settings
Dockerfile
README.md
docker-compose.yml
docs
evidencia
issues
pom.xml
postman
specs
src
target
taskflow-mcp
```

</details>


---

<sub>22s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia.**

C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia (lines 1-200)

```
dia1
dia2
dia3
dia4
```


---

<sub>24s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4.**

C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4 (lines 1-200)

```
summary-sesion.md
summary.diff
verificar-sesion.md
verificar.txt
```


---

<sub>26s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4\summary.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4\summary.diff (lines 1-400)

<details>
<summary>275 lines</summary>

```diff
diff --git a/src/main/java/com/taskflow/controller/ProjectController.java b/src/main/java/com/taskflow/controller/ProjectController.java
index bef609e..a581b81 100644
--- a/src/main/java/com/taskflow/controller/ProjectController.java
+++ b/src/main/java/com/taskflow/controller/ProjectController.java
@@ -1,134 +1,14 @@
-package com.taskflow.controller;
-
-import com.taskflow.dto.ProjectRequest;
-import com.taskflow.dto.ProjectResponse;
-import com.taskflow.dto.TaskResponse;
-import com.taskflow.exception.ProjectNotFoundException;
-import com.taskflow.mapper.ProjectMapper;
-import com.taskflow.mapper.TaskMapper;
-import com.taskflow.model.Project;
-import com.taskflow.model.Task;
-import com.taskflow.model.TaskStatus;
-import com.taskflow.service.ProjectService;
-import io.swagger.v3.oas.annotations.Operation;
-import io.swagger.v3.oas.annotations.tags.Tag;
-import jakarta.validation.Valid;
-import org.springframework.http.ResponseEntity;
-import org.springframework.security.access.prepost.PreAuthorize;
-import org.springframework.security.core.Authentication;
-import org.springframework.web.bind.annotation.DeleteMapping;
-import org.springframework.web.bind.annotation.GetMapping;
-import org.springframework.web.bind.annotation.PathVariable;
-import org.springframework.web.bind.annotation.PostMapping;
-import org.springframework.web.bind.annotation.PutMapping;
-import org.springframework.web.bind.annotation.RequestBody;
-import org.springframework.web.bind.annotation.RequestParam;
-import org.springframework.web.bind.annotation.RestController;
-import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
-
-import java.net.URI;
-import java.util.List;
-
-/**
- * ProjectController — la puerta HTTP de los proyectos: CRUD completo, en DTOs
- * (ProjectRequest / ProjectResponse); las tareas de un proyecto salen como TaskResponse.
- *
- * Repetición deliberada del patrón de TaskController: mismos gestos (201 + Location, @Valid, 404 vía
- * orElseThrow -> advice). Con el lado Project queda completa la tabla de endpoints de la API (menos /auth/*).
- */
-@RestController
-@Tag(name = "Projects", description = "CRUD de proyectos y sus tareas. Borrar un proyecto arrastra sus tareas (cascada).")
-public class ProjectController {
-
-    private final ProjectService projectService;
-
-    public ProjectController(ProjectService projectService) {
-        this.projectService = projectService;
-    }
-
-    /** GET /projects — todos los proyectos como ProjectResponse. */
-    @Operation(summary = "Lista todos los proyectos",
-            description = "Devuelve todos los proyectos como ProjectResponse (lista vacía si no hay ninguno).")
-    @GetMapping("/projects")
-    public List<ProjectResponse> getProjects() {
-        return projectService.listar().stream()
-                .map(ProjectMapper::aResponse)
-                .toList();
-    }
-
-    /** GET /projects/{id} — 200 con ProjectResponse; 404 uniforme si no existe. */
-    @Operation(summary = "Obtiene un proyecto por id",
-            description = "200 con el ProjectResponse; 404 uniforme si el id no existe.")
-    @GetMapping("/projects/{id}")
-    public ProjectResponse getProject(@PathVariable("id") Long id) {
-        Project proyecto = projectService.buscarPorId(id)
-                .orElseThrow(() -> new ProjectNotFoundException(id));
-        return ProjectMapper.aResponse(proyecto);
-    }
-
-    /**
-     * GET /projects/{id}/tasks — las tareas de un proyecto como TaskResponse. Distinción clave:
-     * proyecto inexistente -> 404 (orElseThrow); proyecto sin tareas -> 200 con []. El filtro
-     * ?status= es opcional (mismo enum que /tasks). Delega en ProjectService.tareasDe.
-     */
-    @Operation(summary = "Lista las tareas de un proyecto",
-            description = "Tareas del proyecto como TaskResponse; 404 si el proyecto no existe, 200 con [] si no tiene tareas. Filtro opcional ?status=.")
-    @GetMapping("/projects/{id}/tasks")
-    public List<TaskResponse> getTareasDeProyecto(
-            @PathVariable("id") Long id,
-            @RequestParam(name = "status", required = false) TaskStatus status) {   // status: opcional
-        projectService.buscarPorId(id)
-                .orElseThrow(() -> new ProjectNotFoundException(id));
-        List<Task> tareas = projectService.tareasDe(id);
-        if (status != null) {                          // filtro opcional por estado
-            tareas = tareas.stream().filter(t -> t.getStatus() == status).toList();
-        }
-        return tareas.stream().map(TaskMapper::aResponse).toList();
-    }
-
-    /**
-     * POST /projects — 201 + Location a /projects/{id}. @Valid dispara Bean Validation (400 si falla).
-     * El owner sale del JWT — el Authentication (inyectado por Spring Security) trae el username
-     * del token; el service lo resuelve a ownerId. El dueño es QUIEN crea, no una constante.
-     */
-    @Operation(summary = "Crea un proyecto",
-            description = "El owner se toma del usuario autenticado (el username del JWT).")
-    @PostMapping("/projects")
-    public ResponseEntity<ProjectResponse> createProject(@Valid @RequestBody ProjectRequest request,
-                                                         Authentication authentication) {
-        Project creado = projectService.crear(request, authentication.getName());
-        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
-                .path("/projects/{id}")
-                .buildAndExpand(creado.getId())
-                .toUri();
-        return ResponseEntity.created(location).body(ProjectMapper.aResponse(creado));
-    }
-
-    /** PUT /projects/{id} — reemplazo COMPLETO. 200 con ProjectResponse; 404 si no existe. */
-    @Operation(summary = "Reemplaza un proyecto",
-            description = "Conserva id, owner y createdAt; name y description vienen del cuerpo.")
-    @PutMapping("/projects/{id}")
-    public ProjectResponse updateProject(@PathVariable("id") Long id,
-                                         @Valid @RequestBody ProjectRequest request) {
-        Project actualizado = projectService.reemplazar(id, request);
-        return ProjectMapper.aResponse(actualizado);
-    }
-
-    /**
-     * DELETE /projects/{id} — 204 No Content; 404 si no existe. Borra en cascada las tareas del
-     * proyecto (regla "no Task sin Project").
-     *
-     * La regla de negocio, aplicada: @PreAuthorize se evalúa ANTES del método: pasa si el
-     * usuario es ADMIN o es el owner del proyecto (bean @projectSecurity, data-driven). Un USER que no
-     * es owner -> 403 (la API SÍ sabe quién es, por eso 403 y no 401). Proyecto inexistente ->
-     * esOwner devuelve true a propósito para que hable el 404 del servicio.
-     */
-    @Operation(summary = "Borra un proyecto y sus tareas",
-            description = "Solo ADMIN o el owner. Un USER no-owner recibe 403.")
-    @PreAuthorize("hasRole('ADMIN') or @projectSecurity.esOwner(#id, authentication.name)")
-    @DeleteMapping("/projects/{id}")
-    public ResponseEntity<Void> deleteProject(@PathVariable("id") Long id) {
-        projectService.eliminar(id);
-        return ResponseEntity.noContent().build();
-    }
-}
+package com.taskflow.controller;
+
+import com.taskflow.dto.ProjectRequest;
import com.taskflow.dto.ProjectResponse;
import com.taskflow.dto.ProjectSummaryResponse;
import com.taskflow.dto.TaskResponse;
import com.taskflow.exception.ProjectNotFoundException;
import com.taskflow.mapper.ProjectMapper;
import com.taskflow.mapper.TaskMapper;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
+
+import java.net.URI;
import java.util.List;
+
+/**
 * ProjectController — la puerta HTTP de los proyectos: CRUD completo, en DTOs
 * (ProjectRequest / ProjectResponse); las tareas de un proyecto salen como TaskResponse.
 *
 * Repetición deliberada del patrón de TaskController: mismos gestos (201 + Location, @Valid, 404 vía
 * orElseThrow -> advice). Con el lado Project queda completa la tabla de endpoints de la API (menos /auth/*).
 */
@RestController
+@Tag(name = "Projects", description = "CRUD de proyectos y sus tareas. Borrar un proyecto arrastra sus tareas (cascada).")
+public class ProjectController {
+
+    private final ProjectService projectService;
+
+    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
+
    /** GET /projects — todos los proyectos como ProjectResponse. */
    @Operation(summary = "Lista todos los proyectos",
            description = "Devuelve todos los proyectos como ProjectResponse (lista vacía si no hay ninguno).")
    @GetMapping("/projects")
    public List<ProjectResponse> getProjects() {
        return projectService.listar().stream()
                .map(ProjectMapper::aResponse)
                .toList();
    }

    /** GET /projects/{id} — 200 con ProjectResponse; 404 uniforme si no existe. */
    @Operation(summary = "Obtiene un proyecto por id",
            description = "200 con el ProjectResponse; 404 uniforme si el id no existe.")
    @GetMapping("/projects/{id}")
    public ProjectResponse getProject(@PathVariable("id") Long id) {
        Project proyecto = projectService.buscarPorId(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
        return ProjectMapper.aResponse(proyecto);
    }

    /**
     * GET /projects/{id}/tasks — las tareas de un proyecto como TaskResponse. Distinción clave:
     * proyecto inexistente -> 404 (orElseThrow); proyecto sin tareas -> 200 con []. El filtro
     * ?status= es opcional (mismo enum que /tasks). Delega en ProjectService.tareasDe.
     */
    @Operation(summary = "Lista las tareas de un proyecto",
            description = "Tareas del proyecto como TaskResponse; 404 si el proyecto no existe, 200 con [] si no tiene tareas. Filtro opcional ?status=.")
    @GetMapping("/projects/{id}/tasks")
    public List<TaskResponse> getTareasDeProyecto(
            @PathVariable("id") Long id,
            @RequestParam(name = "status", required = false) TaskStatus status) {   // status: opcional
        projectService.buscarPorId(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
        List<Task> tareas = projectService.tareasDe(id);
        if (status != null) {                          // filtro opcional por estado
            tareas = tareas.stream().filter(t -> t.getStatus() == status).toList();
        }
        return tareas.stream().map(TaskMapper::aResponse).toList();
    }

    /** GET /projects/{id}/summary — resumen del proyecto: conteos por estado y vencidas. */
    @Operation(summary = "Resumen de un proyecto",
            description = "Devuelve conteos por estado y tareas vencidas del proyecto. 404 si el proyecto no existe.")
    @GetMapping("/projects/{id}/summary")
    public ProjectSummaryResponse getSummary(@PathVariable("id") Long id) {
        Project proyecto = projectService.buscarPorId(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
        return projectService.summary(proyecto);
    }

    /**
     * POST /projects — 201 + Location a /projects/{id}. @Valid dispara Bean Validation (400 si falla).
     * El owner sale del JWT — el Authentication (inyectado por Spring Security) trae el username
     * del token; el service lo resuelve a ownerId. El dueño es QUIEN crea, no una constante.
     */
    @Operation(summary = "Crea un proyecto",
            description = "El owner se toma del usuario autenticado (el username del JWT).")
    @PostMapping("/projects")
    public ResponseEntity<ProjectResponse> createProject(@Valid @RequestBody ProjectRequest request,
                                                         Authentication authentication) {
        Project creado = projectService.crear(request, authentication.getName());
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/projects/{id}")
                .buildAndExpand(creado.getId())
                .toUri();
        return ResponseEntity.created(location).body(ProjectMapper.aResponse(creado));
    }

    /** PUT /projects/{id} — reemplazo COMPLETO. 200 con ProjectResponse; 404 si no existe. */
    @Operation(summary = "Reemplaza un proyecto",
            description = "Conserva id, owner y createdAt; name y description vienen del cuerpo.")
    @PutMapping("/projects/{id}")
    public ProjectResponse updateProject(@PathVariable("id") Long id,
                                         @Valid @RequestBody ProjectRequest request) {
        Project actualizado = projectService.reemplazar(id, request);
        return ProjectMapper.aResponse(actualizado);
    }

    /**
     * DELETE /projects/{id} — 204 No Content; 404 si no existe. Borra en cascada las tareas del
     * proyecto (regla "no Task sin Project").
     *
     * La regla de negocio, aplicada: @PreAuthorize se evalúa ANTES del método: pasa si el
     * usuario es ADMIN o es el owner del proyecto (bean @projectSecurity, data-driven). Un USER que no
     * es owner -> 403 (la API SÍ sabe quién es, por eso 403 y no 401). Proyecto inexistente ->
     * esOwner devuelve true a propósito para que hable el 404 del servicio.
     */
    @Operation(summary = "Borra un proyecto y sus tareas",
            description = "Solo ADMIN o el owner. Un USER no-owner recibe 403.")
    @PreAuthorize("hasRole('ADMIN') or @projectSecurity.esOwner(#id, authentication.name)")
    @DeleteMapping("/projects/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable("id") Long id) {
        projectService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
diff --git a/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java b/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java
new file mode 100644
index 0000000..b8eeaec
--- /dev/null
+++ b/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java
@@ -0,0 +1,4 @@
+package com.taskflow.dto;
+
+/**
 * ProjectSummaryResponse — contrato de salida de GET /projects/{id}/summary.
 */
+public record ProjectSummaryResponse(
        Long projectId,
        String projectName,
        long totalTasks,
        java.util.Map<String, Long> byStatus,
        long overdue
) {
}
\ No newline at end of file
diff --git a/src/main/java/com/taskflow/mapper/ProjectMapper.java b/src/main/java/com/taskflow/mapper/ProjectMapper.java
index 38f44a0..9e61550 100644
--- a/src/main/java/com/taskflow/mapper/ProjectMapper.java
+++ b/src/main/java/com/taskflow/mapper/ProjectMapper.java
@@ -21,4 +21,9 @@ public final class ProjectMapper {
         return new ProjectResponse(p.getId(), p.getName(), p.getDescription(),
                 p.getOwnerId(), p.getCreatedAt());
     }
+
+    /** Mapeo ya calculado por el service -> DTO de salida de GET /projects/{id}/summary. */
+    public static com.taskflow.dto.ProjectSummaryResponse aSummary(Project p, long totalTasks, java.util.Map<String, Long> byStatus, long overdue) {
+        return new com.taskflow.dto.ProjectSummaryResponse(p.getId(), p.getName(), totalTasks, byStatus, overdue);
+    }
 }
diff --git a/src/main/java/com/taskflow/service/ProjectService.java b/src/main/java/com/taskflow/service/ProjectService.java
index b3e9d0f..ae32210 100644
--- a/src/main/java/com/taskflow/service/ProjectService.java
+++ b/src/main/java/com/taskflow/service/ProjectService.java
@@ -1,102 +1,28 @@
-package com.taskflow.service;
-
-import com.taskflow.dto.ProjectRequest;
-import com.taskflow.exception.ProjectNotFoundException;
-import com.taskflow.model.Project;
-import com.taskflow.model.Task;
-import com.taskflow.model.User;
-import com.taskflow.repository.ProjectRepository;
-import com.taskflow.repository.TaskRepository;
-import com.taskflow.repository.UserRepository;
-import org.springframework.security.core.userdetails.UsernameNotFoundException;
-import org.springframework.stereotype.Service;
-
-import java.time.LocalDate;
-import java.util.List;
-import java.util.Optional;
-
-/**
- * ProjectService — la capa de negocio del lado Project. Cero HTTP aquí (el "no existe" se traduce con
- * orElseThrow -> ProjectNotFoundException; el advice le pone el 404).
- *
- * Dos decisiones que se ven aquí:
- *   - Project guarda un ownerId (Long), no un objeto User, así que 'crear' y 'reemplazar' manejan
- *     ese Long. 'crear' construye con id null y la BD asigna el id (IDENTITY).
- *   - 'tareasDe' usa la derived query taskRepository.findByProjectId(id) en vez de filtrar findAll()
- *     con un stream: el filtro lo hace la BD.
- */
-@Service
-public class ProjectService {
-
-    private final ProjectRepository projectRepository;
-    private final TaskRepository taskRepository;
-    private final UserRepository userRepository;   // para resolver el owner desde el username del JWT
-
-    public ProjectService(ProjectRepository projectRepository, TaskRepository taskRepository,
-                          UserRepository userRepository) {
-        this.projectRepository = projectRepository;
-        this.taskRepository = taskRepository;
-        this.userRepository = userRepository;
-    }
-
-    /** Todos los proyectos. */
-    public List<Project> listar() {
-        return projectRepository.findAll();
-    }
-
-    /** Un proyecto por id (el Optional sube tal cual: el controller decide 404 vs 200). */
-    public Optional<Project> buscarPorId(Long id) {
-        return projectRepository.findById(id);
-    }
-
-    /**
-     * Las tareas de un proyecto, con la derived query taskRepository.findByProjectId(projectId):
-     * el WHERE project_id = ? lo hace
-     * la BD (viajan solo las filas del proyecto). "no existe el proyecto" (404) lo decide el
-     * controller con buscarPorId; ESTE método, si el proyecto existe pero no tiene tareas, devuelve
-     * [] (-> 200 con []). No son lo mismo.
-     */
-    public List<Task> tareasDe(Long projectId) {
-        return taskRepository.findByProjectId(projectId);
-    }
-
-    /**
-     * Crea un proyecto (POST): el request trae name y description; el ownerId NO es una constante
-     * — se resuelve del USERNAME AUTENTICADO (el que puso el JWT en el
-     * Authentication). El dueño no lo decide el cliente ni una semilla: es QUIEN llama. createdAt = hoy;
-     * id == null -> la BD lo asigna (IDENTITY).
-     */
-    public Project crear(ProjectRequest request, String ownerUsername) {
-        User owner = userRepository.findByUsername(ownerUsername)
-                .orElseThrow(() -> new UsernameNotFoundException(ownerUsername));
-        Project nuevo = new Project(null, request.name(), request.description(),
-                owner.getId(), LocalDate.now());
-        return projectRepository.save(nuevo);
-    }
-
-    /**
-     * Reemplazo COMPLETO (PUT): existe -> reconstruye con el MISMO id, conservando ownerId y createdAt
-     * (el cliente no los toca); name y description vienen del request. save con id presente = update.
-     * No existe -> 404.
-     */
-    public Project reemplazar(Long id, ProjectRequest request) {
-        Project actual = projectRepository.findById(id)
-                .orElseThrow(() -> new ProjectNotFoundException(id));
-        Project reemplazo = new Project(actual.getId(), request.name(), request.description(),
-                actual.getOwnerId(), actual.getCreatedAt());
-        return projectRepository.save(reemplazo);
-    }
-
-    /**
-     * Elimina un proye

[Output truncated. Use view_range=[275, ...] to continue reading. In your next response, you may batch this with other view calls. File has at least 448 lines.]
```

</details>


---

<sub>27s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4\summary.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\evidencia\dia4\summary.diff (lines 275-600)

<details>
<summary>173 lines</summary>

```diff
-     * Project" — y además la FK task.project_id lo EXIGE: borrar el proyecto con tareas colgando daría
-     * una violación de integridad) y luego el proyecto. No existe -> 404. La regla owner/ADMIN no
-     * vive aquí: la aplica el @PreAuthorize del controller antes de llegar a este método.
-     */
-    public void eliminar(Long id) {
-        projectRepository.findById(id)
-                .orElseThrow(() -> new ProjectNotFoundException(id));
-        tareasDe(id).forEach(t -> taskRepository.deleteById(t.getId()));   // cascada manual (la FK obliga el orden)
-        projectRepository.deleteById(id);
-    }
-}
+package com.taskflow.service;
+
+import com.taskflow.dto.ProjectRequest;
+import com.taskflow.dto.ProjectSummaryResponse;
+import com.taskflow.exception.ProjectNotFoundException;
+import com.taskflow.mapper.ProjectMapper;
+import com.taskflow.model.Project;
+import com.taskflow.model.Task;
+import com.taskflow.model.User;
+import com.taskflow.repository.ProjectRepository;
+import com.taskflow.repository.TaskRepository;
+import com.taskflow.repository.UserRepository;
+import org.springframework.security.core.userdetails.UsernameNotFoundException;
+import org.springframework.stereotype.Service;
+
+import java.time.LocalDate;
+import java.util.List;
+import java.util.Optional;
+import java.util.Map;
+import java.util.stream.Collectors;
+
+/**
 * ProjectService — la capa de negocio del lado Project. Cero HTTP aquí (el "no existe" se traduce con
 * orElseThrow -> ProjectNotFoundException; el advice le pone el 404).
 *
 * Dos decisiones que se ven aquí:
 *   - Project guarda un ownerId (Long), no un objeto User, así que 'crear' y 'reemplazar' manejan
 *     ese Long. 'crear' construye con id null y la BD asigna el id (IDENTITY).
 *   - 'tareasDe' usa la derived query taskRepository.findByProjectId(id) en vez de filtrar findAll()
 *     con un stream: el filtro lo hace la BD.
 */
@Service
+public class ProjectService {
+
+   private final ProjectRepository projectRepository;
+   private final TaskRepository taskRepository;
+   private final UserRepository userRepository;   // para resolver el owner desde el username del JWT
+
    public ProjectService(ProjectRepository projectRepository, TaskRepository taskRepository,
                          UserRepository userRepository) {
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    /** Todos los proyectos. */
    public List<Project> listar() {
        return projectRepository.findAll();
    }

    /** Un proyecto por id (el Optional sube tal cual: el controller decide 404 vs 200). */
    public Optional<Project> buscarPorId(Long id) {
        return projectRepository.findById(id);
    }

    /**
     * Las tareas de un proyecto, con la derived query taskRepository.findByProjectId(projectId):
     * el WHERE project_id = ? lo hace
     * la BD (viajan solo las filas del proyecto). "no existe el proyecto" (404) lo decide el
     * controller con buscarPorId; ESTE método, si el proyecto existe pero no tiene tareas, devuelve
     * [] (-> 200 con []). No son lo mismo.
     */
    public List<Task> tareasDe(Long projectId) {
        return taskRepository.findByProjectId(projectId);
    }

    /**
     * Resumen de un proyecto: total de tareas, conteo por estado (siempre las tres claves) y vencidas.
     * Recibe el Project ya encontrado; el controller decide el 404.
     */
    public ProjectSummaryResponse summary(Project proyecto) {
        List<Task> tareas = taskRepository.findByProjectId(proyecto.getId());
        long total = tareas.size();
        Map<com.taskflow.model.TaskStatus, Long> counts = tareas.stream()
                .collect(Collectors.groupingBy(Task::getStatus, Collectors.counting()));
        java.util.Map<String, Long> byStatus = new java.util.LinkedHashMap<>();
        for (com.taskflow.model.TaskStatus ts : com.taskflow.model.TaskStatus.values()) {
            byStatus.put(ts.name(), counts.getOrDefault(ts, 0L));
        }
        long overdue = tareas.stream().filter(Task::estaVencida).count();
        return ProjectMapper.aSummary(proyecto, total, byStatus, overdue);
    }

    /**
     * Crea un proyecto (POST): el request trae name y description; el ownerId NO es una constante
     * — se resuelve del USERNAME AUTENTICADO (el que puso el JWT en el
     * Authentication). El dueño no lo decide el cliente ni una semilla: es QUIEN llama. createdAt = hoy;
     * id == null -> la BD lo asigna (IDENTITY).
     */
    public Project crear(ProjectRequest request, String ownerUsername) {
        User owner = userRepository.findByUsername(ownerUsername)
                .orElseThrow(() -> new UsernameNotFoundException(ownerUsername));
        Project nuevo = new Project(null, request.name(), request.description(),
                owner.getId(), LocalDate.now());
        return projectRepository.save(nuevo);
    }

    /**
     * Reemplazo COMPLETO (PUT): existe -> reconstruye con el MISMO id, conservando ownerId y createdAt
     * (el cliente no los toca); name y description vienen del request. save con id presente = update.
     * No existe -> 404.
     */
    public Project reemplazar(Long id, ProjectRequest request) {
        Project actual = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
        Project reemplazo = new Project(actual.getId(), request.name(), request.description(),
                actual.getOwnerId(), actual.getCreatedAt());
        return projectRepository.save(reemplazo);
    }

    /**
     * Elimina un proyecto (DELETE) con CASCADA MANUAL: borra primero sus tareas (regla "no Task sin
     * Project" — y además la FK task.project_id lo EXIGE: borrar el proyecto con tareas colgando daría
     * una violación de integridad) y luego el proyecto. No existe -> 404. La regla owner/ADMIN no
     * vive aquí: la aplica el @PreAuthorize del controller antes de llegar a este método.
     */
    public void eliminar(Long id) {
        projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
        tareasDe(id).forEach(t -> taskRepository.deleteById(t.getId()));   // cascada manual (la FK obliga el orden)
        projectRepository.deleteById(id);
    }
}
diff --git a/src/test/java/com/taskflow/slice/ProjectSummaryControllerTest.java b/src/test/java/com/taskflow/slice/ProjectSummaryControllerTest.java
new file mode 100644
index 0000000..e4bab53
--- /dev/null
+++ b/src/test/java/com/taskflow/slice/ProjectSummaryControllerTest.java
@@ -0,0 +1,60 @@
+package com.taskflow.slice;
+
+import com.taskflow.controller.ProjectController;
+import com.taskflow.dto.ProjectSummaryResponse;
+import com.taskflow.model.Project;
+import com.taskflow.security.JwtAuthenticationFilter;
+import com.taskflow.service.ProjectService;
+import org.junit.jupiter.api.Test;
+import org.springframework.beans.factory.annotation.Autowired;
+import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
+import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
+import org.springframework.test.context.bean.override.mockito.MockitoBean;
+import org.springframework.test.web.servlet.MockMvc;
+
+import java.util.Optional;
+
+import static org.mockito.ArgumentMatchers.any;
+import static org.mockito.Mockito.when;
+import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
+import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
+import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
+
+@WebMvcTest(ProjectController.class)
+@AutoConfigureMockMvc(addFilters = false)
+class ProjectSummaryControllerTest {
+
+    @Autowired
+    private MockMvc mockMvc;
+
+    @MockitoBean
+    private ProjectService projectService;
+
+    @MockitoBean
+    private JwtAuthenticationFilter jwtAuthenticationFilter;
+
+    @Test
+    void getSummary_existente_devuelve200ConCadaCampo() throws Exception {
+        when(projectService.buscarPorId(2L)).thenReturn(Optional.of(new Project(2L, "App Móvil", "d", 1L, null)));
+        when(projectService.summary(any(Project.class))).thenReturn(new ProjectSummaryResponse(
+                2L, "App Móvil", 4, java.util.Map.of("TODO",1L,"IN_PROGRESS",2L,"DONE",1L), 1
+        ));
+
+        mockMvc.perform(get("/projects/2/summary"))
+                .andExpect(status().isOk())
+                .andExpect(jsonPath("$.projectId").value(2))
+                .andExpect(jsonPath("$.projectName").value("App Móvil"))
+                .andExpect(jsonPath("$.totalTasks").value(4))
+                .andExpect(jsonPath("$.byStatus.TODO").value(1))
+                .andExpect(jsonPath("$.byStatus.IN_PROGRESS").value(2))
+                .andExpect(jsonPath("$.byStatus.DONE").value(1))
+                .andExpect(jsonPath("$.overdue").value(1));
+    }
+
+    @Test
+    void getSummary_proyectoInexistente_devuelve404() throws Exception {
        when(projectService.buscarPorId(99L)).thenReturn(Optional.empty());
+
+    mockMvc.perform(get("/projects/99/summary"))
+                .andExpect(status().isNotFound())
+                .andExpect(jsonPath("$.status").value(404));
+    }
}
diff --git a/src/test/java/com/taskflow/unit/ProjectSummaryServiceTest.java b/src/test/java/com/taskflow/unit/ProjectSummaryServiceTest.java
new file mode 100644
index 0000000..3ba35ad
--- /dev/null
+++ b/src/test/java/com/taskflow/unit/ProjectSummaryServiceTest.java
@@ -0,0 +1,62 @@
+package com.taskflow.unit;
+
+import com.taskflow.dto.ProjectSummaryResponse;
+import com.taskflow.exception.TaskValidationException;
+import com.taskflow.model.Priority;
+import com.taskflow.model.Project;
+import com.taskflow.model.Task;
+import com.taskflow.model.TaskStatus;
+import com.taskflow.repository.ProjectRepository;
+import com.taskflow.repository.TaskRepository;
+import com.taskflow.repository.UserRepository;
+import com.taskflow.service.ProjectService;
+import org.junit.jupiter.api.Test;
+import org.junit.jupiter.api.extension.ExtendWith;
+import org.mockito.InjectMocks;
+import org.mockito.Mock;
+import org.mockito.junit.jupiter.MockitoExtension;
+
+import java.time.LocalDate;
+import java.util.List;
+import java.util.Map;
+import java.util.Optional;
+
+import static org.junit.jupiter.api.Assertions.assertEquals;
+import static org.mockito.Mockito.when;
+
+@ExtendWith(MockitoExtension.class)
+class ProjectSummaryServiceTest {
+
+    @Mock
+    private ProjectRepository projectRepository;
+
+    @Mock
+    private TaskRepository taskRepository;
+
+    @Mock
+    private UserRepository userRepository;
+
+    @InjectMocks
+    private ProjectService service;
+
+    private final Project proyecto = new Project(2L, "App Móvil", "d", 1L, null);
+
+    @Test
+    void summary_cuentaYvencida_devuelveConteosCorrectos() throws TaskValidationException {
+        when(taskRepository.findByProjectId(2L)).thenReturn(List.of(
+                new Task(5L, "T01", "d", TaskStatus.TODO, Priority.MED, 2L, 1L, null),
+                new Task(6L, "T02", "d", TaskStatus.IN_PROGRESS, Priority.MED, 2L, 2L, LocalDate.now().plusDays(1)),
+                new Task(7L, "T03", "d", TaskStatus.IN_PROGRESS, Priority.MED, 2L, 2L, LocalDate.now().minusDays(2)),
+                new Task(8L, "T04", "d", TaskStatus.DONE, Priority.MED, 2L, 2L, LocalDate.now().minusDays(5))
+        ));
+
+        ProjectSummaryResponse expected = new ProjectSummaryResponse(
                2L,
                "App Móvil",
                4,
                Map.of("TODO", 1L, "IN_PROGRESS", 2L, "DONE", 1L),
                1
+        );
+
+        assertEquals(expected, service.summary(proyecto));
+    }
+
+    @Test
+    void summary_proyectoSinTareas_devuelveCeros() {
        when(taskRepository.findByProjectId(3L)).thenReturn(List.of());
+        // ensure no unfinished stubbing elsewhere in the test context
        Project p = new Project(3L, "Vacío", "d", 1L, null);
        ProjectSummaryResponse expected = new ProjectSummaryResponse(3L, "Vacío", 0, Map.of("TODO",0L,"IN_PROGRESS",0L,"DONE",0L), 0);
+        assertEquals(expected, service.summary(p));
    }
}
```

</details>


---

<sub>33s</sub>

### `grep`

**MockitoBean**

"MockitoBean" (src, test)

<details>
<summary>16 matches</summary>

```
src\test\java\com\taskflow\slice\TaskControllerTest.java:import org.springframework.test.context.bean.override.mockito.MockitoBean;
src\test\java\com\taskflow\slice\TaskControllerTest.java: * capa web (controller + advice + Jackson + validación). El service es un @MockitoBean.
src\test\java\com\taskflow\slice\TaskControllerTest.java: *   2. @MockitoBean del/los service(s) -> el colaborador ausente, programado con when(...).
src\test\java\com\taskflow\slice\TaskControllerTest.java: * @MockitoBean JwtAuthenticationFilter (se mockea el filtro para que el slice no cargue sus dependencias).
src\test\java\com\taskflow\slice\TaskControllerTest.java: * @Mock vs @MockitoBean: aquí HAY contexto Spring -> @MockitoBean (sustituye un bean). En
src\test\java\com\taskflow\slice\TaskControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\TaskControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\TaskControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\ProjectSummaryControllerTest.java:import org.springframework.test.context.bean.override.mockito.MockitoBean;
src\test\java\com\taskflow\slice\ProjectSummaryControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\ProjectSummaryControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\ProjectControllerTest.java:import org.springframework.test.context.bean.override.mockito.MockitoBean;
src\test\java\com\taskflow\slice\ProjectControllerTest.java: * @WebMvcTest + @MockitoBean del service + addFilters=false + @MockitoBean del filtro JWT.
src\test\java\com\taskflow\slice\ProjectControllerTest.java:    @MockitoBean
src\test\java\com\taskflow\slice\ProjectControllerTest.java:    @MockitoBean

(Warning: Some search paths were skipped because they do not exist: test)
```

</details>


---

<sub>58s</sub>

### Copilot

Resumen breve: leído el diff y la spec; los cambios implementan el endpoint, DTO, mapper, service y tests requeridos. No hay fallos bloqueantes; sólo 3 sugerencias menores.

| # | Gravedad | Archivo:línea | Punto de la checklist | Qué pasa | Qué harías |
|---|---|---|---|---|---|
| 1 | Sugerencia | src/main/java/com/taskflow/dto/ProjectSummaryResponse.java | 4 (Contrato) | DTO es un record correcto. Usa long para totalTasks/overdue (válido) | Confirmar que clients esperan enteros largos; aceptable sin cambio. |
| 2 | Sugerencia | src/main/java/com/taskflow/service/ProjectService.java | 3 (Reglas de dominio) | Reusa Task.estaVencida() correctamente; byStatus se construye iterando TaskStatus.values() | Opcional: documentar que el mapa sigue el orden de TaskStatus.values() para estabilidad. |
| 3 | Sugerencia | src/test/java/com/taskflow/slice/ProjectSummaryControllerTest.java | 7 (Tests que prueban algo) | Test slice usa @AutoConfigureMockMvc(addFilters = false) y además @MockitoBean JwtAuthenticationFilter (redundante) | Eliminar uno (preferiblemente quitar el @MockitoBean si addFilters=false) para claridad. |

Casos sin test: ninguno — el unit service prueba conteos y vencida; el slice prueba 200 y 404.

Veredicto: APROBADO.

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>

# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `57e690bd-ae92-4fa3-93b8-003dd438021f`  
> - **Started:** 17/10/2026, 10:01:40 a.m.  
> - **Duration:** 1m 22s  
> - **Exported:** 17/10/2026, 10:03:03 a.m.  

---

<sub>2s</sub>

### User

/crear-endpoint-taskflow Implementa la especificación specs/\<feature>.md. Síguela al pie de la letra: archivos, nombres, reglas y tests. Al terminar corre mvn -q test.

---

<sub>7s</sub>

### Copilot

Ejecutando la skill "crear-endpoint-taskflow" para implementar la especificación en specs/\<feature>.md y crear el endpoint conforme a las convenciones del proyecto. Luego se correrán los tests con mvn -q test. Invocando la skill ahora.

---

<sub>8s</sub>

### `skill`

**crear-endpoint-taskflow**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "crear-endpoint-taskflow"
}
```

</details>

```
Skill "crear-endpoint-taskflow" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>11s</sub>

### Copilot

Buscando el archivo de especificación en specs/ para implementar el endpoint, y listaré la(s) especificación(es) encontradas antes de modificar código. Ejecutando búsqueda profunda en el código.

---

<sub>11s</sub>

### search_code_subagent (Completed)

### `file_search`

**specs/****

<details>
<summary>Arguments</summary>

```json
{
  "query": "specs/**"
}
```

</details>

```
3 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md
```


### `grep_search`

**<session_limits_status>|session_limits_status**

<details>
<summary>Arguments</summary>

```json
{
  "query": "<session_limits_status>|session_limits_status",
  "isRegexp": true
}
```

</details>

```
No matches found for query: <session_limits_status>|session_limits_status
```


### `file_search`

**specs/***

<details>
<summary>Arguments</summary>

```json
{
  "query": "specs/*"
}
```

</details>

```
3 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md
```


### `grep_search`

**specs/**

<details>
<summary>Arguments</summary>

```json
{
  "query": "specs/",
  "isRegexp": false
}
```

</details>

<details>
<summary>45 lines</summary>

````
14 matches
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/skills/crear-endpoint-taskflow/SKILL.md" line=14>
    1. Lee la especificación completa (un archivo de `specs/` o el texto del issue). Si le falta un dato
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/agents/tester.agent.md" line=15>
    `.github/`, `specs/` ni `evidencia/`. Si un test nuevo falla porque el código de producción está mal,
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/agents/tester.agent.md" line=24>
    1. Lee lo que te indiquen: la especificación (`specs/...`) y, si te la dan, la revisión del agente
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/agents/revisor.agent.md" line=17>
    `specs/`). Lee el diff completo y, para cada archivo que aparece en él, abre la versión actual del
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=15>
    Revisa evidencia/dia4/summary.diff contra la especificación specs/summary.md.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=23>
    Voy a abrir en paralelo el diff "evidence/dia4/summary.diff" y la especificación "specs/summary.md" para comparar alcance, contrato y tests según la checklist del revisor. Leer ambos archivos permite verificar cada punto del diff contra la especificación. Ejecutando lectura de ambos archivos ahora.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=73>
    Revisa evidencia/dia4/summary.diff contra la especificación specs/summary.md.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=81>
    Voy a abrir en paralelo el diff "evidence/dia4/summary.diff" y la especificación "specs/summary.md" para comparar alcance, contrato y tests según la checklist del revisor. Leer ambos archivos permite verificar cada punto del diff contra la especificación. Ejecutando lectura de ambos archivos ahora.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=15>
    /crear-endpoint-taskflow Implementa la especificación de specs/summary.md.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=23>
    Agregar endpoint según specs/summary.md; usar la skill "crear-endpoint-taskflow" para crear controller, DTO record, mapper, service method, tests (unit y @WebMvcTest) y ejecutar mvn -q test. Ejecutando la skill ahora.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/checklist-overdue.txt" line=1>
    specs/overdue.md                                   | 42 ++++++++++++++++++++++
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/tester-sesion.md" line=15>
    Lee specs/summary.md, la sección Casos sin test de evidencia/dia4/revision.md y los tests de GET /projects/{id}/summary. Escribe los tests que falten y corre mvn -q test.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/tester-sesion.md" line=23>
    Leyendo los archivos relevantes para identificar los casos sin test y los tests existentes de GET /projects/{id}/summary: abriré specs/summary.md, evidencia/dia4/revision.md y los archivos de test que implementan GET /projects/{id}/summary. Leeos en paralelo para acelerar. Luego implementaré los tests faltantes siguiendo las convenciones. Ejecutando las lecturas.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/tester-sesion.md" line=397>
    - Leídos: specs/summary.md, evidencia/dia4/revision.md (sección "Casos sin test") y los tests existentes: ProjectSummaryServiceTest (unit) y ProjectSummaryControllerTest (slice).
</match>
```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>33 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md`. Lines 1 to 43 (43 lines total): 
```
# Especificación — `GET /tasks/overdue`

## Qué

Un endpoint que lista las tareas vencidas de todos los proyectos, para ver de un vistazo qué se
atrasó sin revisar proyecto por proyecto.

## Reglas

1. Una tarea está vencida si `Task.estaVencida()` devuelve `true` (ya existe: tiene `dueDate`, la
   fecha ya pasó y el estado no es `DONE`). No reimplementes la regla: úsala.
2. Orden: por `dueDate` ascendente (la más vencida primero). Usa el comparador que ya existe,
   `TaskOrders.POR_FECHA`.
3. Respuesta: `200` con una lista de `TaskResponse` (el mismo DTO que `GET /tasks`, vía
   `TaskMapper.aResponse`). Si no hay vencidas, `200` con `[]`.
4. Seguridad: igual que el resto de `/tasks` (sin token → `401`). No cambies `SecurityConfig`.

## Dónde

- Método nuevo en `TaskService`: `public List<Task> vencidas()`.
- Endpoint nuevo en `TaskController`: `@GetMapping("/tasks/overdue")`. Ojo: tiene que declararse de
  forma que no lo capture `GET /tasks/{id}` (hoy `GET /tasks/overdue` responde `400` con «El
  parámetro 'id' tiene un valor ilegible»).

## Tests que deben existir al terminar

- Unit en `TaskServiceTest`: devuelve solo vencidas y en orden; una tarea `DONE` con fecha pasada NO
  aparece; una sin `dueDate` NO aparece.
- Slice en `TaskControllerTest`: `GET /tasks/overdue` responde `200` y el JSON trae las tareas en orden.

## Resultado esperado con la semilla

Con la app arrancada con el perfil `h2`, `GET /tasks/overdue` devuelve una sola tarea: la `7`
(«Corregir bug de fechas», `IN_PROGRESS`, vencida ayer). Las tareas `2` y `8` también tienen fecha
pasada, pero están `DONE`.

## Restricciones

- No modifiques ningún test existente.
- No toques archivos fuera de `TaskService.java`, `TaskController.java`, `TaskServiceTest.java` y
  `TaskControllerTest.java`.
- Al terminar, `mvn -q test` tiene que pasar completo.

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>55 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md`. Lines 1 to 66 (66 lines total): 
```
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

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>41 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md`. Lines 1 to 51 (51 lines total): 
```
# Especificación — `GET /tasks/unassigned`

## Qué

Un endpoint que lista las tareas sin responsable de todos los proyectos, para repartirlas.

## Reglas

1. Una tarea está sin responsable si `assigneeId` es `null`. La regla ya existe como predicado:
   `ReportService.SIN_ASIGNAR`. Úsalo; no escribas otra vez `t.getAssigneeId() == null`.
2. Entran tareas en cualquier estado (`TODO`, `IN_PROGRESS` o `DONE`): la regla es solo el responsable.
3. Orden: por `dueDate` ascendente, con las que no tienen fecha al final. Es exactamente
   `TaskOrders.POR_FECHA`: úsalo.
4. Respuesta: `200` con una lista de `TaskResponse` (vía `TaskMapper.aResponse`). Si no hay tareas sin
   responsable, `200` con `[]`.
5. Seguridad: igual que el resto de `/tasks` (sin token → `401`). No cambies `SecurityConfig`.

## Dónde

- Método nuevo en `TaskService`: `public List<Task> sinResponsable()`. No lo confundas con
  `ReportService.sinAsignar()`, que devuelve un conteo (`long`) y no se toca.
- Endpoint nuevo en `TaskController`: `@GetMapping("/tasks/unassigned")`, junto a `GET /tasks/overdue`.
  Spring elige la ruta literal `/tasks/unassigned` antes que la plantilla `/tasks/{id}` sin importar
  en qué orden estén declarados los métodos: **no escribas comentarios sobre el orden de declaración**.

## Tests que deben existir al terminar

- Unit en `TaskServiceTest`, dentro de un `@Nested` llamado `SinResponsable`:
  - con el repositorio devolviendo, **en este orden**, una tarea sin responsable con fecha en 10 días,
    una con responsable, una sin responsable sin fecha y una sin responsable con fecha en 2 días,
    `sinResponsable()` devuelve exactamente las tres sin responsable en el orden: la de 2 días, la de
    10 días y la sin fecha. Compara los ids en orden (`assertEquals(List.of(...), ids)`).
    Este test tiene que **fallar** si alguien quita el `.sorted(...)` del servicio.
  - con el repositorio devolviendo solo tareas con responsable, devuelve una lista vacía.
- Slice en `TaskControllerTest`: `GET /tasks/unassigned` responde `200` y el JSON trae el `id` y el
  `assigneeId` (`null`) de lo que devuelve `taskService.sinResponsable()`. **No pruebes el orden en el
  slice**: ahí la lista la inventa el mock, así que el orden solo se prueba en el unit.

## Resultado esperado con la semilla

Con la app arrancada con el perfil `h2`, `GET /tasks/unassigned` devuelve dos tareas, en este orden:
la `4` («Escribir tests MockMvc», vence en 7 días) y la `6` («Publicar en la tienda», vence en 10 días).

## Restricciones

- No modifiques ningún test existente.
- No toques archivos fuera de `TaskService.java`, `TaskController.java`, `TaskServiceTest.java` y
  `TaskControllerTest.java`.
- No escribas comentarios que afirmen algo que no verificaste.
- Al terminar, `mvn -q test` tiene que pasar completo.

```
````

</details>


### `grep_search`

**session_limits_status**

<details>
<summary>Arguments</summary>

```json
{
  "query": "session_limits_status",
  "isRegexp": false
}
```

</details>

```
No matches found for query: session_limits_status
```


### Copilot

\<final_answer>
C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md:1-43
C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md:1-66
C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md:1-51
\</final_answer>


---

<sub>21s</sub>

### Copilot

Preparando lectura de los archivos relevantes para implementar GET /tasks/overdue: buscar TaskService, TaskController, TaskMapper, TaskResponse, TaskService tests y controller tests. Ejecutando búsqueda profunda.

---

<sub>21s</sub>

### search_code_subagent (Completed)

### `file_search`

****/TaskService***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskService*"
}
```

</details>

<details>
<summary>10 lines</summary>

```
9 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/classes/com/taskflow/service/TaskService.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$CambiarStatus.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Crear.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Eliminar.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$SinResponsable.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Vencidas.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest.class
```

</details>


### `file_search`

****/TaskController***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskController*"
}
```

</details>

```
4 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/classes/com/taskflow/controller/TaskController.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/slice/TaskControllerTest.class
```


### `file_search`

****/TaskMapper***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskMapper*"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/classes/com/taskflow/mapper/TaskMapper.class
```


### `file_search`

****/TaskResponse***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskResponse*"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/TaskResponse.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/classes/com/taskflow/dto/TaskResponse.class
```


### `file_search`

****/TaskServiceTest***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskServiceTest*"
}
```

</details>

<details>
<summary>8 lines</summary>

```
7 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$CambiarStatus.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Crear.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Eliminar.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$SinResponsable.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest$Vencidas.class
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/unit/TaskServiceTest.class
```

</details>


### `file_search`

****/TaskControllerTest***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskControllerTest*"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/test-classes/com/taskflow/slice/TaskControllerTest.class
```


### `file_search`

****/TaskOrders***

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskOrders*"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/target/classes/com/taskflow/service/TaskOrders.class
```


### `grep_search`

**TaskMapper\.aResponse**

<details>
<summary>Arguments</summary>

```json
{
  "query": "TaskMapper\\.aResponse",
  "isRegexp": true
}
```

</details>

<details>
<summary>30 lines</summary>

````
9 matches
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/copilot-instructions.md" line=33>
    (`dto`), nunca entidades, a través de los mappers manuales de `mapper` (`TaskMapper.aResponse`).
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/docs/ARQUITECTURA.md" line=36>
    6. El controlador recibe la tarea creada, construye la URI de `Location` a `/tasks/{id}` y responde `201 Created` con el cuerpo mapeado por `TaskMapper.aResponse(creada)` (`src/main/java/com/taskflow/mapper/TaskMapper.java`).
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md" line=15>
    `TaskMapper.aResponse`). Si no hay vencidas, `200` con `[]`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia1/verificador.txt" line=55>
    [OK]         línea 36   miembro   TaskMapper.aResponse  ->  src\main\java\com\taskflow\mapper\TaskMapper.java
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md" line=14>
    4. Respuesta: `200` con una lista de `TaskResponse` (vía `TaskMapper.aResponse`). Si no hay tareas sin
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=98>
    return TaskMapper.aResponse(task);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=119>
    return ResponseEntity.created(location).body(TaskMapper.aResponse(creada));
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=130>
    return TaskMapper.aResponse(actualizada);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=152>
    return TaskMapper.aResponse(actualizada);
</match>
```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>51 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java`. Lines 1 to 55 (55 lines total): 
```
package com.taskflow.mapper;

import com.taskflow.dto.TaskRequest;
import com.taskflow.dto.TaskResponse;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;

/**
 * TaskMapper — el puente entre el CONTRATO (DTOs) y el DOMINIO (entidad Task). Mapeo A MANO con
 * métodos estáticos: barato, visible y testeable. Es una clase de utilidades — constructor privado,
 * no se instancia.
 *
 * Alternativa: MapStruct automatiza este mapeo en el mundo real; aquí se hace a mano para
 * ENTENDER el costo antes de esconderlo detrás de una librería.
 *
 * Nota clave "crear vs rehidratar": aEntidadNueva pasa por la FACTORY Task.crear
 * (aplica "dueDate no en el pasado"); aReemplazo pasa por el CONSTRUCTOR de rehidratación (permite
 * editar una tarea vieja con fecha ya pasada).
 */
public final class TaskMapper {

    private TaskMapper() {
        // no instanciable
    }

    /**
     * POST: DTO de entrada + projectId del PATH -> entidad NUEVA por la factory de negocio.
     * Task.crear fija status=TODO e id=null, y aplica la regla temporal de dueDate. Firma:
     * crear(title, description, priority, dueDate, projectId, assigneeId).
     */
    public static Task aEntidadNueva(TaskRequest req, Long projectId) throws TaskValidationException {
        return Task.crear(req.title(), req.description(), req.priority(),
                req.dueDate(), projectId, req.assigneeId());
    }

    /**
     * PUT (reemplazo COMPLETO): DTO de entrada + el estado y el proyecto ACTUALES -> entidad
     * rehidratada con el MISMO id. Conservamos id, status y projectId (el cliente no los toca por
     * PUT); el resto (title, description, priority, assigneeId, dueDate) viene del request. El
     * constructor de rehidratación valida las invariantes (título, projectId) sin la regla temporal.
     */
    public static Task aReemplazo(Long id, TaskStatus statusActual, Long projectIdActual, TaskRequest req)
            throws TaskValidationException {
        return new Task(id, req.title(), req.description(), statusActual, req.priority(),
                projectIdActual, req.assigneeId(), req.dueDate());
    }

    /** Entidad -> DTO de salida (los 8 campos). La entidad Task NO cruza el controller: cruza esto. */
    public static TaskResponse aResponse(Task t) {
        return new TaskResponse(t.getId(), t.getTitle(), t.getDescription(), t.getStatus(),
                t.getPriority(), t.getProjectId(), t.getAssigneeId(), t.getDueDate());
    }
}

```
````

</details>


### `grep_search`

**aResponse**

<details>
<summary>Arguments</summary>

```json
{
  "query": "aResponse",
  "isRegexp": false,
  "includePattern": "**/TaskMapper.java"
}
```

</details>

<details>
<summary>6 lines</summary>

````
1 matches
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java" line=50>
    public static TaskResponse aResponse(Task t) {
</match>
```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>135 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java`. Lines 1 to 149 (149 lines total): 
```
package com.taskflow.service;

import com.taskflow.dto.TaskRequest;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.mapper.TaskMapper;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * TaskService — la capa de negocio de las tareas. Orquesta; las reglas viven en Task (título 3-120,
 * projectId obligatorio, dueDate no en el pasado al crear, no DONE sin assignee).
 *
 * Piezas clave:
 *   - crear(...) recibe el projectId del PATH (no un id fijo) y arma la entidad con el TaskMapper
 *     (que pasa por la factory Task.crear).
 *   - reemplazar (PUT), eliminar (DELETE) y cambiarStatus (PATCH); completar(...) DELEGA en
 *     cambiarStatus.
 *   - cambiarStatus TRADUCE la checked TaskValidationException que lanza setStatus a la unchecked
 *     TaskStateException -> el advice la mapea a 422. Sin tocar el dominio.
 *
 * La existencia del proyecto al crear (404) se valida en el controller (contra ProjectService): este
 * service no depende del repositorio de proyectos, y así el filtrado por proyecto vive solo en
 * ProjectService.tareasDe.
 */
@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea una tarea a partir del DTO de entrada y el projectId del PATH. El TaskMapper pasa por la
     * factory Task.crear (status=TODO, id=null, regla "dueDate no en el pasado"); el repositorio le
     * asigna el id en save. La checked sube al advice si el título o la fecha no cumplen (-> 400).
     */
    public Task crear(TaskRequest request, Long projectId) throws TaskValidationException {
        Task nueva = TaskMapper.aEntidadNueva(request, projectId);
        return repository.save(nueva);
    }

    /**
     * Reemplazo COMPLETO (PUT): busca la tarea (404 si no existe), y arma una tarea rehidratada con el
     * MISMO id, conservando status y projectId actuales; el resto viene del request. save hace upsert.
     */
    public Task reemplazar(Long id, TaskRequest request) throws TaskValidationException {
        Task actual = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        Task reemplazo = TaskMapper.aReemplazo(id, actual.getStatus(), actual.getProjectId(), request);
        return repository.save(reemplazo);
    }

    /**
     * Elimina una tarea (DELETE): existe -> borra (204 en el controller); no existe -> TaskNotFound
     * -> el advice responde 404. El findById previo hace explícito el "no existe" (vía Optional).
     */
    public void eliminar(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        repository.deleteById(id);
    }

    /**
     * Cambia el estado (PATCH): busca la tarea (404 si no existe) y aplica setStatus, que puede lanzar
     * la CHECKED TaskValidationException por la regla "no DONE sin assignee". La CAPTURA y la TRADUCE
     * a la unchecked TaskStateException -> el advice la mapea a 422. El dominio (setStatus) no se toca.
     */
    public Task cambiarStatus(Long id, TaskStatus nuevoStatus) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        try {
            task.setStatus(nuevoStatus);
        } catch (TaskValidationException e) {
            throw new TaskStateException(e.getMessage());
        }
        return repository.save(task);
    }

    /**
     * Completa una tarea (la pasa a DONE). DELEGA en cambiarStatus(id, DONE): un
     * solo camino para "cambiar de estado", que además hereda la traducción a 422.
     */
    public Task completar(Long id) {
        return cambiarStatus(id, TaskStatus.DONE);
    }

    /**
     * Lista todas las tareas ordenadas con la estrategia POR_URGENCIA (reuso LITERAL de la Strategy de
     * TaskOrders): vencidas primero, luego prioridad HIGH->LOW, luego fecha ascendente (nulls al final).
     */
    public List<Task> listar() {
        return repository.findAll().stream()
                .sorted(TaskOrders.POR_URGENCIA)
                .toList();
    }

    /** Filtra las tareas por estado (?status=). '==' entre enums es seguro. */
    public List<Task> porEstado(TaskStatus status) {
        return repository.findAll().stream()
                .filter(t -> t.getStatus() == status)
                .toList();
    }

    /**
     * Tareas vencidas de todos los proyectos (GET /tasks/overdue). La regla es la del
     * dominio, Task.estaVencida(); el orden, TaskOrders.POR_FECHA: la más vencida primero.
     */
    public List<Task> vencidas() {
        return repository.findAll().stream()
                .filter(Task::estaVencida)
                .sorted(TaskOrders.POR_FECHA)
                .toList();
    }

    /**
     * Tareas sin responsable de todos los proyectos, en cualquier estado (GET /tasks/unassigned).
     * La regla es ReportService.SIN_ASIGNAR; el orden, TaskOrders.POR_FECHA: por fecha ascendente y las
     * que no tienen fecha al final.
     */
    public List<Task> sinResponsable() {
        return repository.findAll().stream()
                .filter(ReportService.SIN_ASIGNAR)
                .sorted(TaskOrders.POR_FECHA)
                .toList();
    }

    /** Busca una tarea por id: delega en el repositorio y deja subir el Optional TAL CUAL. */
    public Optional<Task> buscarPorId(Long id) {
        return repository.findById(id);
    }

    /** Filtro por prioridad (?priority=): MISMO patrón que porEstado. */
    public List<Task> porPrioridad(Priority priority) {
        return repository.findAll().stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }
}

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>48 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java`. Lines 1 to 53 (53 lines total): 
```
package com.taskflow.service;

import com.taskflow.model.Task;

import java.util.Comparator;

/**
 * TaskOrders — catálogo de ESTRATEGIAS de ordenamiento de tareas (patrón Strategy).
 *
 * Cada constante es una estrategia empaquetada como VALOR (un {@link Comparator}) que se PASA a
 * quien ordena (el contexto: {@code sorted(...)} de los streams). Todo Comparator es ya una
 * estrategia aunque no se le llame así, y sort/sorted es el contexto que la recibe sin saber cuál
 * le tocó. Aquí les damos NOMBRE y las juntamos en un solo lugar reutilizable.
 *
 * {@code TaskService.listar()} de la API ordena con POR_URGENCIA.
 *
 * Clase de utilidades: constructor privado (no se instancia — solo se usan sus constantes).
 */
public final class TaskOrders {

    private TaskOrders() {
        // no instanciable: es un catálogo de constantes
    }

    /**
     * POR_FECHA — la estrategia básica: dueDate ascendente, con las tareas SIN fecha
     * (dueDate null) al FINAL. nullsLast evita el NullPointerException al comparar una fecha null.
     */
    public static final Comparator<Task> POR_FECHA =
            Comparator.comparing(Task::getDueDate,
                    Comparator.nullsLast(Comparator.naturalOrder()));

    /** POR_TITULO — orden alfabético por título, sin distinguir mayúsculas/minúsculas. */
    public static final Comparator<Task> POR_TITULO =
            Comparator.comparing(Task::getTitle, String.CASE_INSENSITIVE_ORDER);

    /**
     * POR_URGENCIA — la estrategia compuesta, encadenando comparing/thenComparing:
     *   1) las VENCIDAS primero (estaVencida() == true antes que false),
     *   2) a igualdad, prioridad de mayor a menor (HIGH -> MED -> LOW),
     *   3) a igualdad, dueDate ascendente con las sin fecha al final.
     *
     * Detalle: el orden natural del enum Priority es LOW, MED, HIGH (LOW el menor); por eso
     * reverseOrder() deja HIGH primero. Y reverseOrder() sobre el boolean de estaVencida() deja
     * el true (vencida) antes que el false.
     */
    public static final Comparator<Task> POR_URGENCIA =
            Comparator.comparing(Task::estaVencida, Comparator.reverseOrder())
                    .thenComparing(Task::getPriority, Comparator.reverseOrder())
                    .thenComparing(Task::getDueDate,
                            Comparator.nullsLast(Comparator.naturalOrder()));
}

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java",
  "startLine": 90,
  "endLine": 180
}
```

</details>

<details>
<summary>63 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java`. Lines 90 to 155 (155 lines total): 
```

    /** GET /tasks/{id} — 200 con TaskResponse, o 404 uniforme (orElseThrow -> advice). */
    @Operation(summary = "Obtiene una tarea por id",
            description = "200 con el TaskResponse; 404 uniforme si el id no existe.")
    @GetMapping("/tasks/{id}")
    public TaskResponse getTaskPorId(@PathVariable("id") Long id) {
        Task task = taskService.buscarPorId(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        return TaskMapper.aResponse(task);
    }

    /**
     * POST /projects/{projectId}/tasks — crea una tarea bajo un proyecto. 201 + header Location
     * apuntando a donde el recurso SE LEE (/tasks/{id}), no a la URL de creación. @Valid dispara Bean
     * Validation (400 si falla). Cableo: si el proyecto no existe -> 404 (ProjectNotFoundException).
     */
    @Operation(summary = "Crea una tarea dentro de un proyecto",
            description = "El proyecto debe existir (404 si no). La tarea nace en estado TODO.")
    @PostMapping("/projects/{projectId}/tasks")
    public ResponseEntity<TaskResponse> createTask(@PathVariable("projectId") Long projectId,
                                                   @Valid @RequestBody TaskRequest request)
            throws TaskValidationException {
        projectService.buscarPorId(projectId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));
        Task creada = taskService.crear(request, projectId);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/tasks/{id}")
                .buildAndExpand(creada.getId())
                .toUri();
        return ResponseEntity.created(location).body(TaskMapper.aResponse(creada));
    }

    /** PUT /tasks/{id} — reemplazo COMPLETO. 200 con TaskResponse; 404 si no existe. */
    @Operation(summary = "Reemplaza una tarea por completo",
            description = "Semántica PUT: conserva id, status y projectId; el resto viene del cuerpo.")
    @PutMapping("/tasks/{id}")
    public TaskResponse updateTask(@PathVariable("id") Long id,
                                   @Valid @RequestBody TaskRequest request)
            throws TaskValidationException {
        Task actualizada = taskService.reemplazar(id, request);
        return TaskMapper.aResponse(actualizada);
    }

    /** DELETE /tasks/{id} — 204 No Content; 404 uniforme si no existe (advice). */
    @Operation(summary = "Borra una tarea",
            description = "204 No Content; 404 uniforme si la tarea no existe.")
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        taskService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * PATCH /tasks/{id}/status — cambia SOLO el estado. 200 con TaskResponse; 404 si no existe; y
     * 422 si la regla de estado lo prohíbe (DONE sin assignee), vía TaskStateException.
     */
    @Operation(summary = "Cambia el estado de una tarea",
            description = "TODO/IN_PROGRESS/DONE. Pasar a DONE sin responsable responde 422.")
    @PatchMapping("/tasks/{id}/status")
    public TaskResponse patchStatus(@PathVariable("id") Long id,
                                    @Valid @RequestBody TaskStatusUpdateRequest request) {
        Task actualizada = taskService.cambiarStatus(id, request.status());
        return TaskMapper.aResponse(actualizada);
    }
}

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/TaskResponse.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>27 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/TaskResponse.java`. Lines 1 to 28 (28 lines total): 
```
package com.taskflow.dto;

import com.taskflow.model.Priority;
import com.taskflow.model.TaskStatus;

import java.time.LocalDate;

/**
 * TaskResponse — el CONTRATO de SALIDA de una tarea (lo que la API devuelve). Es un record: Jackson
 * lo serializa a JSON por sus componentes.
 *
 * "¿Si trae los mismos 8 campos que la entidad, para qué el DTO?" — son casi iguales; el valor
 * es el DESACOPLE. La entidad Task lleva anotaciones JPA (@Entity/@Id...) que NO tienen por qué
 * asomar en el JSON, y hay entidades con campos que JAMÁS deben salir (el passwordHash de User). El
 * contrato de salida se mantiene estable aunque la entidad cambie por dentro.
 */
public record TaskResponse(
        Long id,
        String title,
        String description,
        TaskStatus status,
        Priority priority,
        Long projectId,
        Long assigneeId,
        LocalDate dueDate
) {
}

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>166 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java`. Lines 1 to 200 (at least 200 lines total): 
```
package com.taskflow.unit;

import com.taskflow.dto.TaskRequest;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * TaskServiceTest — UNIT PURO con Mockito: aquí NO arranca Spring — la clase corre en MILISEGUNDOS.
 *
 * Por qué Mockito: TaskRepository es una interfaz cuya única implementación es un proxy de Spring Data
 * respaldado por una BD. Un *fake* en memoria (rápido y determinista) también sería legítimo, pero no
 * existe: para probar el service EN AISLAMIENTO no hay implementación de juguete que instanciar
 * -> por eso existe Mockito: el mock SUSTITUYE al fake cuando el colaborador real exige infraestructura.
 *
 * Reglas aplicadas:
 *   - @ExtendWith(MockitoExtension.class): sin ella, @Mock queda null.
 *   - Los DATOS (Task) se construyen DE VERDAD con el constructor de rehidratación; SOLO el COLABORADOR
 *     (el repository) se mockea.
 *   - MockitoExtension corre en strict-stubs: un when(...) que ningún camino usa FALLA la clase
 *     (UnnecessaryStubbingException) -> aquí cada stub tiene propósito.
 */
@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository repository;

    @InjectMocks
    private com.taskflow.service.TaskService service;

    private static final Long PROYECTO = 1L;

    @Nested
    @DisplayName("crear")
    class Crear {

        @Test
        void crear_valida_delegaEnSaveYDevuelveTareaConId() throws TaskValidationException {
            // El request pasa por TaskMapper.aEntidadNueva -> Task.crear (status=TODO, id=null). El
            // repositorio, mockeado, "devuelve" una tarea YA con id (lo que la BD real haría en save).
            TaskRequest request = new TaskRequest("Redactar informe", "desc", Priority.HIGH, 5L, null);
            Task tareaConId = new Task(99L, "Redactar informe", "desc",
                    TaskStatus.TODO, Priority.HIGH, PROYECTO, 5L, null);
            when(repository.save(any(Task.class))).thenReturn(tareaConId);

            Task creada = service.crear(request, PROYECTO);

            assertNotNull(creada.getId());
            assertEquals(99L, creada.getId());
        }

        @Test
        @DisplayName("thenThrow: el mock simula una BD caída — lo que el colaborador real no te da nunca")
        void crear_conBdCaida_propagaLaExcepcion() {
            // thenThrow: con la BD real NO puedes provocar una caída a demanda; el mock sí.
            TaskRequest request = new TaskRequest("Tarea válida", "desc", Priority.MED, 5L, null);
            when(repository.save(any(Task.class)))
                    .thenThrow(new RuntimeException("Conexión a la BD perdida"));

            assertThrows(RuntimeException.class, () -> service.crear(request, PROYECTO));
        }
    }

    @Nested
    @DisplayName("cambiarStatus")
    class CambiarStatus {

        @Test
        void cambiarStatus_conAssignee_guardaDone() {
            // El dato se construye REAL (constructor de rehidratación), con assignee -> SÍ puede pasar a
            // DONE. Solo el repository (colaborador) se mockea.
            Task tareaConAssignee = tarea(1L, "Con responsable", 5L);
            when(repository.findById(1L)).thenReturn(Optional.of(tareaConAssignee));
            when(repository.save(any(Task.class))).thenAnswer(inv -> inv.getArgument(0));

            service.cambiarStatus(1L, TaskStatus.DONE);

            // ArgumentCaptor: capturar el Task que VIAJÓ a save. El retorno no basta cuando lo que
            // importa es el OBJETO MUTADO que se persistió.
            ArgumentCaptor<Task> captor = ArgumentCaptor.forClass(Task.class);
            verify(repository).save(captor.capture());
            assertEquals(TaskStatus.DONE, captor.getValue().getStatus());
        }

        @Test
        void cambiarStatus_idInexistente_lanzaTaskNotFoundException() {
            when(repository.findById(999L)).thenReturn(Optional.empty());

            assertThrows(TaskNotFoundException.class,
                    () -> service.cambiarStatus(999L, TaskStatus.DONE));
            // No se llegó a guardar nada.
            verify(repository, never()).save(any(Task.class));
        }

        @Test
        void cambiarStatus_sinAssignee_lanzaTaskStateExceptionYNoGuarda() {
            // Sin assignee, setStatus(DONE) lanza la checked; cambiarStatus la TRADUCE a TaskStateException.
            // La traducción, probada EN AISLAMIENTO (sin HTTP, sin BD).
            Task sinAssignee = tarea(2L, "Sin responsable", null);
            when(repository.findById(2L)).thenReturn(Optional.of(sinAssignee));

            assertThrows(TaskStateException.class,
                    () -> service.cambiarStatus(2L, TaskStatus.DONE));
            // El never() es el assert más valioso del bloque: la regla PROHIBIÓ persistir.
            verify(repository, never()).save(any(Task.class));
        }
    }

    @Nested
    @DisplayName("eliminar")
    class Eliminar {

        @Test
        void eliminar_existente_llamaDeleteById() {
            Task existente = tarea(1L, "Borrable", 5L);
            when(repository.findById(1L)).thenReturn(Optional.of(existente));

            service.eliminar(1L);

            // verify sobre una operación MUDA (void): el estado no lo delata, la interacción sí.
            verify(repository).deleteById(1L);
        }

        @Test
        void eliminar_inexistente_lanzaTaskNotFoundExceptionYNoBorra() {
            when(repository.findById(999L)).thenReturn(Optional.empty());

            assertThrows(TaskNotFoundException.class, () -> service.eliminar(999L));
            // never() + anyLong(): NO se borró nada. (Regla "todos matchers o ninguno": aquí anyLong()).
            verify(repository, never()).deleteById(anyLong());
        }
    }

    // ==================== Listados de vencidas y sin responsable ====================

    private static final LocalDate HOY = LocalDate.now();

    @Nested
    @DisplayName("vencidas")
    class Vencidas {

        @Test
        void vencidas_devuelveSoloLasVencidasNoDone_laMasVencidaPrimero() {
            Task hace1 = tareaCon(1L, TaskStatus.IN_PROGRESS, 5L, HOY.minusDays(1));
            Task en3 = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(3));
            Task doneHace10 = tareaCon(3L, TaskStatus.DONE, 5L, HOY.minusDays(10));
            Task sinFecha = tareaCon(4L, TaskStatus.TODO, 5L, null);
            Task hace5 = tareaCon(5L, TaskStatus.TODO, 5L, HOY.minusDays(5));
            when(repository.findAll()).thenReturn(List.of(hace1, en3, doneHace10, sinFecha, hace5));

            List<Long> ids = service.vencidas().stream().map(Task::getId).toList();

            // El repositorio las entrega como 1, 5: sin el .sorted(TaskOrders.POR_FECHA) este assert falla.
            assertEquals(List.of(5L, 1L), ids);
        }

        @Test
        void vencidas_sinNingunaVencida_devuelveListaVacia() {
            when(repository.findAll()).thenReturn(List.of(tareaCon(1L, TaskStatus.TODO, 5L, HOY.plusDays(1))));

            assertEquals(List.of(), service.vencidas());
        }
    }

    @Nested
    @DisplayName("sinResponsable")
    class SinResponsable {

        @Test
        void sinResponsable_devuelveLasSinResponsableEnCualquierEstado_porFechaYSinFechaAlFinal() {
            // Estados mezclados a propósito (TODO, IN_PROGRESS, DONE): la regla es solo el responsable.
            Task en10 = tareaCon(1L, TaskStatus.TODO, null, HOY.plusDays(10));
            Task conResponsable = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(1));
            Task sinFecha = tareaCon(3L, TaskStatus.IN_PROGRESS, null, null);
```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java",
  "startLine": 1,
  "endLine": 200
}
```

</details>

<details>
<summary>174 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java`. Lines 1 to 200 (at least 200 lines total): 
```
package com.taskflow.slice;

import com.taskflow.controller.TaskController;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.security.JwtAuthenticationFilter;
import com.taskflow.service.ProjectService;
import com.taskflow.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.matchesPattern;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TaskControllerTest — SLICE web. El CRUD no necesita un @SpringBootTest lento: le basta
 * @WebMvcTest. Aquí NO se levanta JPA, ni el seeder, ni la seguridad real: solo la
 * capa web (controller + advice + Jackson + validación). El service es un @MockitoBean.
 *
 * Las 3 anotaciones CLAVE del slice:
 *   1. @WebMvcTest(TaskController.class) -> levanta SOLO la capa web de este controller.
 *   2. @MockitoBean del/los service(s) -> el colaborador ausente, programado con when(...).
 *   3. @AutoConfigureMockMvc(addFilters = false) -> la seguridad NO se prueba en el slice: se prueba
 *      donde vive, en integration/. Sin esto, el slice aplica la seguridad default de Boot y TODO da 401.
 *
 * Tropiezo típico: el slice ESCANEA los Filter @Component, y JwtAuthenticationFilter arrastra
 * JwtService/JpaUserDetailsService al contexto -> "No qualifying bean of type 'JwtService'". Solución:
 * @MockitoBean JwtAuthenticationFilter (se mockea el filtro para que el slice no cargue sus dependencias).
 *
 * @Mock vs @MockitoBean: aquí HAY contexto Spring -> @MockitoBean (sustituye un bean). En
 * unit/ NO hay Spring -> @Mock. Regla mecánica: ¿la clase tiene una anotación @...Test de Spring? -> bean.
 *
 * Aquí no hay token: ningún filtro lo exige (addFilters = false).
 */
@WebMvcTest(TaskController.class)
@AutoConfigureMockMvc(addFilters = false)
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TaskService taskService;

    @MockitoBean
    private ProjectService projectService;   // TaskController también inyecta ProjectService (cableo Task<->Project)

    // Sin esto: el slice intenta construir el Filter @Component real -> No qualifying bean 'JwtService'.
    @MockitoBean
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    // ==================== GET (contra el stub del service, no una semilla) ====================

    @Test
    void getTasks_sinFiltro_retorna200YLista() throws Exception {
        when(taskService.listar()).thenReturn(List.of(
                tarea(1L, "Primera", TaskStatus.TODO),
                tarea(2L, "Segunda", TaskStatus.IN_PROGRESS)));

        mockMvc.perform(get("/tasks"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].title").value("Primera"));
    }

    // ==================== Listados de vencidas y sin responsable ====================
    // La lista la fija el mock: aquí se prueba que la RUTA llega al método nuevo (200, no el 400 de
    // /tasks/{id}) y que el JSON trae los campos del TaskResponse. El orden se prueba en TaskServiceTest.

    @Test
    void getOverdue_retorna200ConLasTareasDelServicio() throws Exception {
        when(taskService.vencidas()).thenReturn(List.of(
                tareaConFecha(7L, "Corregir bug de fechas", 2L, LocalDate.now().minusDays(1))));

        mockMvc.perform(get("/tasks/overdue"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].id").value(7))
                .andExpect(jsonPath("$[0].title").value("Corregir bug de fechas"));
    }

    @Test
    void getUnassigned_retorna200ConLasTareasDelServicio() throws Exception {
        when(taskService.sinResponsable()).thenReturn(List.of(
                tareaConFecha(4L, "Escribir tests MockMvc", null, LocalDate.now().plusDays(7))));

        mockMvc.perform(get("/tasks/unassigned"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].id").value(4))
                .andExpect(jsonPath("$[0].assigneeId").value(nullValue()));
    }

    @Test
    void getTaskPorId_existente_retorna200ConElTitulo() throws Exception {
        when(taskService.buscarPorId(1L)).thenReturn(Optional.of(tarea(1L, "Diseñar esquema de BD", TaskStatus.TODO)));

        mockMvc.perform(get("/tasks/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Diseñar esquema de BD"))
                .andExpect(jsonPath("$.projectId").value(1));
    }

    @Test
    void getTaskPorId_inexistente_retorna404() throws Exception {
        // El service dice "no está" (Optional vacío); el controller lanza -> el advice (SÍ vive en el slice) responde 404.
        when(taskService.buscarPorId(999L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/tasks/999"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404));
    }

    // ==================== Escritura (la validación y el advice SÍ viven en el slice) ====================

    @Test
    void postTask_valida_devuelve201ConLocation() throws Exception {
        when(projectService.buscarPorId(1L)).thenReturn(Optional.of(new Project(1L, "P", "d", 1L, null)));
        when(taskService.crear(any(), eq(1L)))
                .thenReturn(tareaCon(10L, "Redactar el informe trimestral", TaskStatus.TODO, 1L));

        String body = """
                {
                  "title": "Redactar el informe trimestral",
                  "description": "Con las métricas del quarter",
                  "priority": "HIGH",
                  "assigneeId": 1,
                  "dueDate": "2099-12-31"
                }
                """;

        mockMvc.perform(post("/projects/1/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", matchesPattern(".*/tasks/\\d+")))
                .andExpect(jsonPath("$.title").value("Redactar el informe trimestral"))
                .andExpect(jsonPath("$.status").value("TODO"));
    }

    /**
     * Frontera de la API, ESPEJO del parametrizado de dominio (TaskValidationTest): títulos que
     * violan @NotBlank/@Size -> 400. La validación de forma vive en el slice; ni siquiera se llama al
     * service. 0 -> vacío; 1,2 -> cortos; 121 -> largo.
     */
    @ParameterizedTest(name = "título de longitud {0} → 400")
    @ValueSource(ints = {0, 1, 2, 121})
    void postTask_tituloInvalido_devuelve400(int longitud) throws Exception {
        String titulo = "a".repeat(longitud);
        String body = """
                { "title": "%s", "priority": "LOW" }
                """.formatted(titulo);

        mockMvc.perform(post("/projects/1/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isBadRequest());
    }

    @Test
    void patchStatus_sinAssignee_devuelve422() throws Exception {
        // El service (mockeado) traduce la regla a TaskStateException; el advice la mapea a 422.
        when(taskService.cambiarStatus(6L, TaskStatus.DONE))
                .thenThrow(new TaskStateException("No se puede marcar DONE sin responsable."));

        mockMvc.perform(patch("/tasks/6/status")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"status\": \"DONE\" }"))
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.status").value(422));
    }

    @Test
```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java",
  "startLine": 160,
  "endLine": 260
}
```

</details>

<details>
<summary>65 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java`. Lines 160 to 232 (232 lines total): 
```
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", matchesPattern(".*/tasks/\\d+")))
                .andExpect(jsonPath("$.title").value("Redactar el informe trimestral"))
                .andExpect(jsonPath("$.status").value("TODO"));
    }

    /**
     * Frontera de la API, ESPEJO del parametrizado de dominio (TaskValidationTest): títulos que
     * violan @NotBlank/@Size -> 400. La validación de forma vive en el slice; ni siquiera se llama al
     * service. 0 -> vacío; 1,2 -> cortos; 121 -> largo.
     */
    @ParameterizedTest(name = "título de longitud {0} → 400")
    @ValueSource(ints = {0, 1, 2, 121})
    void postTask_tituloInvalido_devuelve400(int longitud) throws Exception {
        String titulo = "a".repeat(longitud);
        String body = """
                { "title": "%s", "priority": "LOW" }
                """.formatted(titulo);

        mockMvc.perform(post("/projects/1/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isBadRequest());
    }

    @Test
    void patchStatus_sinAssignee_devuelve422() throws Exception {
        // El service (mockeado) traduce la regla a TaskStateException; el advice la mapea a 422.
        when(taskService.cambiarStatus(6L, TaskStatus.DONE))
                .thenThrow(new TaskStateException("No se puede marcar DONE sin responsable."));

        mockMvc.perform(patch("/tasks/6/status")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"status\": \"DONE\" }"))
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.status").value(422));
    }

    @Test
    void deleteTask_inexistente_devuelve404() throws Exception {
        // eliminar es void -> doThrow(...).when(...) para simular el "no existe".
        doThrow(new TaskNotFoundException(999L)).when(taskService).eliminar(999L);

        mockMvc.perform(delete("/tasks/999"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404));
    }

    // ---- helpers de datos (reales, no mocks) ----

    private Task tarea(Long id, String title, TaskStatus status) {
        return tareaCon(id, title, status, 1L);
    }

    private Task tareaConFecha(Long id, String title, Long assigneeId, LocalDate dueDate) {
        try {
            return new Task(id, title, "desc", TaskStatus.TODO, Priority.MED, 1L, assigneeId, dueDate);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }

    private Task tareaCon(Long id, String title, TaskStatus status, Long projectId) {
        try {
            return new Task(id, title, "desc", status, Priority.MED, projectId, 1L, null);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }
}

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java",
  "startLine": 160,
  "endLine": 260
}
```

</details>

<details>
<summary>64 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java`. Lines 160 to 236 (236 lines total): 
```
    // ==================== Listados de vencidas y sin responsable ====================

    private static final LocalDate HOY = LocalDate.now();

    @Nested
    @DisplayName("vencidas")
    class Vencidas {

        @Test
        void vencidas_devuelveSoloLasVencidasNoDone_laMasVencidaPrimero() {
            Task hace1 = tareaCon(1L, TaskStatus.IN_PROGRESS, 5L, HOY.minusDays(1));
            Task en3 = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(3));
            Task doneHace10 = tareaCon(3L, TaskStatus.DONE, 5L, HOY.minusDays(10));
            Task sinFecha = tareaCon(4L, TaskStatus.TODO, 5L, null);
            Task hace5 = tareaCon(5L, TaskStatus.TODO, 5L, HOY.minusDays(5));
            when(repository.findAll()).thenReturn(List.of(hace1, en3, doneHace10, sinFecha, hace5));

            List<Long> ids = service.vencidas().stream().map(Task::getId).toList();

            // El repositorio las entrega como 1, 5: sin el .sorted(TaskOrders.POR_FECHA) este assert falla.
            assertEquals(List.of(5L, 1L), ids);
        }

        @Test
        void vencidas_sinNingunaVencida_devuelveListaVacia() {
            when(repository.findAll()).thenReturn(List.of(tareaCon(1L, TaskStatus.TODO, 5L, HOY.plusDays(1))));

            assertEquals(List.of(), service.vencidas());
        }
    }

    @Nested
    @DisplayName("sinResponsable")
    class SinResponsable {

        @Test
        void sinResponsable_devuelveLasSinResponsableEnCualquierEstado_porFechaYSinFechaAlFinal() {
            // Estados mezclados a propósito (TODO, IN_PROGRESS, DONE): la regla es solo el responsable.
            Task en10 = tareaCon(1L, TaskStatus.TODO, null, HOY.plusDays(10));
            Task conResponsable = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(1));
            Task sinFecha = tareaCon(3L, TaskStatus.IN_PROGRESS, null, null);
            Task en2 = tareaCon(4L, TaskStatus.DONE, null, HOY.plusDays(2));
            when(repository.findAll()).thenReturn(List.of(en10, conResponsable, sinFecha, en2));

            List<Long> ids = service.sinResponsable().stream().map(Task::getId).toList();

            // El repositorio las entrega como 1, 3, 4: sin el .sorted(TaskOrders.POR_FECHA) este assert falla.
            assertEquals(List.of(4L, 1L, 3L), ids);
        }

        @Test
        void sinResponsable_todasConResponsable_devuelveListaVacia() {
            when(repository.findAll()).thenReturn(List.of(tareaCon(1L, TaskStatus.TODO, 5L, null)));

            assertEquals(List.of(), service.sinResponsable());
        }
    }

    /** Fabrica una Task REAL con estado, responsable y fecha a elección (null = sin responsable / sin fecha). */
    private Task tareaCon(Long id, TaskStatus status, Long assigneeId, LocalDate dueDate) {
        try {
            return new Task(id, "Tarea " + id, "desc", status, Priority.MED, PROYECTO, assigneeId, dueDate);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }

    /** Fabrica una Task de rehidratación REAL (dato, no mock). assigneeId null = sin responsable. */
    private Task tarea(Long id, String title, Long assigneeId) {
        try {
            return new Task(id, title, "desc", TaskStatus.TODO, Priority.MED, PROYECTO, assigneeId, null);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }
}

```
````

</details>


### `grep_search`

**TaskMapper\.aResponse**

<details>
<summary>Arguments</summary>

```json
{
  "query": "TaskMapper\\.aResponse",
  "isRegexp": true,
  "includePattern": "**/*.{java,Test.java}"
}
```

</details>

<details>
<summary>15 lines</summary>

````
4 matches
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=98>
    return TaskMapper.aResponse(task);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=119>
    return ResponseEntity.created(location).body(TaskMapper.aResponse(creada));
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=130>
    return TaskMapper.aResponse(actualizada);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java" line=152>
    return TaskMapper.aResponse(actualizada);
</match>
```
````

</details>


### `file_search`

****/TaskValidationTest*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskValidationTest*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskValidationTest.java
```


### `file_search`

****/TaskValidationException*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskValidationException*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/exception/TaskValidationException.java
```


### `file_search`

****/TaskNotFoundException*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskNotFoundException*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/exception/TaskNotFoundException.java
```


### `file_search`

****/TaskStateException*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskStateException*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/exception/TaskStateException.java
```


### `file_search`

****/ReportService*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ReportService*.java"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/ReportServiceTest.java
```


### Copilot

\<final_answer>
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java:1-55
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java:1-149
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java:1-53
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java:90-155
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/TaskResponse.java:1-28
C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java:1-236
C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java:1-232
\</final_answer>


---

<sub>33s</sub>

### Copilot

Reading TaskServiceTest and TaskControllerTest to create matching tests and to follow project test style. Then will add controller endpoint and two test classes. Executing file reads.

---

<sub>33s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\unit\TaskServiceTest.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\unit\TaskServiceTest.java

<details>
<summary>192 lines</summary>

```
package com.taskflow.unit;

import com.taskflow.dto.TaskRequest;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.TaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * TaskServiceTest — UNIT PURO con Mockito: aquí NO arranca Spring — la clase corre en MILISEGUNDOS.
 *
 * Por qué Mockito: TaskRepository es una interfaz cuya única implementación es un proxy de Spring Data
 * respaldado por una BD. Un *fake* en memoria (rápido y determinista) también sería legítimo, pero no
 * existe: para probar el service EN AISLAMIENTO no hay implementación de juguete que instanciar
 * -> por eso existe Mockito: el mock SUSTITUYE al fake cuando el colaborador real exige infraestructura.
 *
 * Reglas aplicadas:
 *   - @ExtendWith(MockitoExtension.class): sin ella, @Mock queda null.
 *   - Los DATOS (Task) se construyen DE VERDAD con el constructor de rehidratación; SOLO el COLABORADOR
 *     (el repository) se mockea.
 *   - MockitoExtension corre en strict-stubs: un when(...) que ningún camino usa FALLA la clase
 *     (UnnecessaryStubbingException) -> aquí cada stub tiene propósito.
 */
@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository repository;

    @InjectMocks
    private com.taskflow.service.TaskService service;

    private static final Long PROYECTO = 1L;

    @Nested
    @DisplayName("crear")
    class Crear {

        @Test
        void crear_valida_delegaEnSaveYDevuelveTareaConId() throws TaskValidationException {
            // El request pasa por TaskMapper.aEntidadNueva -> Task.crear (status=TODO, id=null). El
            // repositorio, mockeado, "devuelve" una tarea YA con id (lo que la BD real haría en save).
            TaskRequest request = new TaskRequest("Redactar informe", "desc", Priority.HIGH, 5L, null);
            Task tareaConId = new Task(99L, "Redactar informe", "desc",
                    TaskStatus.TODO, Priority.HIGH, PROYECTO, 5L, null);
            when(repository.save(any(Task.class))).thenReturn(tareaConId);

            Task creada = service.crear(request, PROYECTO);

            assertNotNull(creada.getId());
            assertEquals(99L, creada.getId());
        }

        @Test
        @DisplayName("thenThrow: el mock simula una BD caída — lo que el colaborador real no te da nunca")
        void crear_conBdCaida_propagaLaExcepcion() {
            // thenThrow: con la BD real NO puedes provocar una caída a demanda; el mock sí.
            TaskRequest request = new TaskRequest("Tarea válida", "desc", Priority.MED, 5L, null);
            when(repository.save(any(Task.class)))
                    .thenThrow(new RuntimeException("Conexión a la BD perdida"));

            assertThrows(RuntimeException.class, () -> service.crear(request, PROYECTO));
        }
    }

    @Nested
    @DisplayName("cambiarStatus")
    class CambiarStatus {

        @Test
        void cambiarStatus_conAssignee_guardaDone() {
            // El dato se construye REAL (constructor de rehidratación), con assignee -> SÍ puede pasar a
            // DONE. Solo el repository (colaborador) se mockea.
            Task tareaConAssignee = tarea(1L, "Con responsable", 5L);
            when(repository.findById(1L)).thenReturn(Optional.of(tareaConAssignee));
            when(repository.save(any(Task.class))).thenAnswer(inv -> inv.getArgument(0));

            service.cambiarStatus(1L, TaskStatus.DONE);

            // ArgumentCaptor: capturar el Task que VIAJÓ a save. El retorno no basta cuando lo que
            // importa es el OBJETO MUTADO que se persistió.
            ArgumentCaptor<Task> captor = ArgumentCaptor.forClass(Task.class);
            verify(repository).save(captor.capture());
            assertEquals(TaskStatus.DONE, captor.getValue().getStatus());
        }

        @Test
        void cambiarStatus_idInexistente_lanzaTaskNotFoundException() {
            when(repository.findById(999L)).thenReturn(Optional.empty());

            assertThrows(TaskNotFoundException.class,
                    () -> service.cambiarStatus(999L, TaskStatus.DONE));
            // No se llegó a guardar nada.
            verify(repository, never()).save(any(Task.class));
        }

        @Test
        void cambiarStatus_sinAssignee_lanzaTaskStateExceptionYNoGuarda() {
            // Sin assignee, setStatus(DONE) lanza la checked; cambiarStatus la TRADUCE a TaskStateException.
            // La traducción, probada EN AISLAMIENTO (sin HTTP, sin BD).
            Task sinAssignee = tarea(2L, "Sin responsable", null);
            when(repository.findById(2L)).thenReturn(Optional.of(sinAssignee));

            assertThrows(TaskStateException.class,
                    () -> service.cambiarStatus(2L, TaskStatus.DONE));
            // El never() es el assert más valioso del bloque: la regla PROHIBIÓ persistir.
            verify(repository, never()).save(any(Task.class));
        }
    }

    @Nested
    @DisplayName("eliminar")
    class Eliminar {

        @Test
        void eliminar_existente_llamaDeleteById() {
            Task existente = tarea(1L, "Borrable", 5L);
            when(repository.findById(1L)).thenReturn(Optional.of(existente));

            service.eliminar(1L);

            // verify sobre una operación MUDA (void): el estado no lo delata, la interacción sí.
            verify(repository).deleteById(1L);
        }

        @Test
        void eliminar_inexistente_lanzaTaskNotFoundExceptionYNoBorra() {
            when(repository.findById(999L)).thenReturn(Optional.empty());

            assertThrows(TaskNotFoundException.class, () -> service.eliminar(999L));
            // never() + anyLong(): NO se borró nada. (Regla "todos matchers o ninguno": aquí anyLong()).
            verify(repository, never()).deleteById(anyLong());
        }
    }

    // ==================== Listados de vencidas y sin responsable ====================

    private static final LocalDate HOY = LocalDate.now();

    @Nested
    @DisplayName("vencidas")
    class Vencidas {

        @Test
        void vencidas_devuelveSoloLasVencidasNoDone_laMasVencidaPrimero() {
            Task hace1 = tareaCon(1L, TaskStatus.IN_PROGRESS, 5L, HOY.minusDays(1));
            Task en3 = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(3));
            Task doneHace10 = tareaCon(3L, TaskStatus.DONE, 5L, HOY.minusDays(10));
            Task sinFecha = tareaCon(4L, TaskStatus.TODO, 5L, null);
            Task hace5 = tareaCon(5L, TaskStatus.TODO, 5L, HOY.minusDays(5));
            when(repository.findAll()).thenReturn(List.of(hace1, en3, doneHace10, sinFecha, hace5));

            List<Long> ids = service.vencidas().stream().map(Task::getId).toList();

            // El repositorio las entrega como 1, 5: sin el .sorted(TaskOrders.POR_FECHA) este assert falla.
            assertEquals(List.of(5L, 1L), ids);
        }

        @Test
        void vencidas_sinNingunaVencida_devuelveListaVacia() {
            when(repository.findAll()).thenReturn(List.of(tareaCon(1L, TaskStatus.TODO, 5L, HOY.plusDays(1))));

            assertEquals(List.of(), service.vencidas());
        }
    }

    @Nested
    @DisplayName("sinResponsable")
    class SinResponsable {

        @Test
        void sinResponsable_devuelveLasSinResponsableEnCualquierEstado_porFechaYSinFechaAlFinal() {
            // Estados mezclados a propósito (TODO, IN_PROGRESS, DONE): la regla es solo el responsable.
            Task en10 = tareaCon(1L, TaskStatus.TODO, null, HOY.plusDays(10));
            Task conResponsable = tareaCon(2L, TaskStatus.TODO, 5L, HOY.plusDays(1));
            Task sinFecha = tareaCon(3L, TaskStatus.IN_PROGRESS, null, null);
            Task en2 = tareaCon(4L, TaskStatus.DONE, null, HOY.plusDays(2));
            when(repository.findAll()).thenReturn(List.of(en10, conResponsable, sinFecha, en2));

            List<Long> ids = service.sinResponsable().stream().map(Task::getId).toList();

            // El repositorio las entrega como 1, 3, 4: sin el .sorted(TaskOrders.POR_FECHA) este assert falla.
            assertEquals(List.of(4L, 1L, 3L), ids);
        }

        @Test
        void sinResponsable_todasConResponsable_devuelveListaVacia() {
            when(repository.findAll()).thenReturn(List.of(tareaCon(1L, TaskStatus.TODO, 5L, null)));

            assertEquals(List.of(), service.sinResponsable());
        }
    }

    /** Fabrica una Task REAL con estado, responsable y fecha a elección (null = sin responsable / sin fecha). */
    private Task tareaCon(Long id, TaskStatus status, Long assigneeId, LocalDate dueDate) {
        try {
            return new Task(id, "Tarea " + id, "desc", status, Priority.MED, PROYECTO, assigneeId, dueDate);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }

    /** Fabrica una Task de rehidratación REAL (dato, no mock). assigneeId null = sin responsable. */
    private Task tarea(Long id, String title, Long assigneeId) {
        try {
            return new Task(id, title, "desc", TaskStatus.TODO, Priority.MED, PROYECTO, assigneeId, null);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }
}
```

</details>


---

<sub>36s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\slice\TaskControllerTest.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\slice\TaskControllerTest.java

<details>
<summary>197 lines</summary>

```
package com.taskflow.slice;

import com.taskflow.controller.TaskController;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.security.JwtAuthenticationFilter;
import com.taskflow.service.ProjectService;
import com.taskflow.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.matchesPattern;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TaskControllerTest — SLICE web. El CRUD no necesita un @SpringBootTest lento: le basta
 * @WebMvcTest. Aquí NO se levanta JPA, ni el seeder, ni la seguridad real: solo la
 * capa web (controller + advice + Jackson + validación). El service es un @MockitoBean.
 *
 * Las 3 anotaciones CLAVE del slice:
 *   1. @WebMvcTest(TaskController.class) -> levanta SOLO la capa web de este controller.
 *   2. @MockitoBean del/los service(s) -> el colaborador ausente, programado con when(...).
 *   3. @AutoConfigureMockMvc(addFilters = false) -> la seguridad NO se prueba en el slice: se prueba
 *      donde vive, en integration/. Sin esto, el slice aplica la seguridad default de Boot y TODO da 401.
 *
 * Tropiezo típico: el slice ESCANEA los Filter @Component, y JwtAuthenticationFilter arrastra
 * JwtService/JpaUserDetailsService al contexto -> "No qualifying bean of type 'JwtService'". Solución:
 * @MockitoBean JwtAuthenticationFilter (se mockea el filtro para que el slice no cargue sus dependencias).
 *
 * @Mock vs @MockitoBean: aquí HAY contexto Spring -> @MockitoBean (sustituye un bean). En
 * unit/ NO hay Spring -> @Mock. Regla mecánica: ¿la clase tiene una anotación @...Test de Spring? -> bean.
 *
 * Aquí no hay token: ningún filtro lo exige (addFilters = false).
 */
@WebMvcTest(TaskController.class)
@AutoConfigureMockMvc(addFilters = false)
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TaskService taskService;

    @MockitoBean
    private ProjectService projectService;   // TaskController también inyecta ProjectService (cableo Task<->Project)

    // Sin esto: el slice intenta construir el Filter @Component real -> No qualifying bean 'JwtService'.
    @MockitoBean
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    // ==================== GET (contra el stub del service, no una semilla) ====================

    @Test
    void getTasks_sinFiltro_retorna200YLista() throws Exception {
        when(taskService.listar()).thenReturn(List.of(
                tarea(1L, "Primera", TaskStatus.TODO),
                tarea(2L, "Segunda", TaskStatus.IN_PROGRESS)));

        mockMvc.perform(get("/tasks"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].title").value("Primera"));
    }

    // ==================== Listados de vencidas y sin responsable ====================
    // La lista la fija el mock: aquí se prueba que la RUTA llega al método nuevo (200, no el 400 de
    // /tasks/{id}) y que el JSON trae los campos del TaskResponse. El orden se prueba en TaskServiceTest.

    @Test
    void getOverdue_retorna200ConLasTareasDelServicio() throws Exception {
        when(taskService.vencidas()).thenReturn(List.of(
                tareaConFecha(7L, "Corregir bug de fechas", 2L, LocalDate.now().minusDays(1))));

        mockMvc.perform(get("/tasks/overdue"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].id").value(7))
                .andExpect(jsonPath("$[0].title").value("Corregir bug de fechas"));
    }

    @Test
    void getUnassigned_retorna200ConLasTareasDelServicio() throws Exception {
        when(taskService.sinResponsable()).thenReturn(List.of(
                tareaConFecha(4L, "Escribir tests MockMvc", null, LocalDate.now().plusDays(7))));

        mockMvc.perform(get("/tasks/unassigned"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$[0].id").value(4))
                .andExpect(jsonPath("$[0].assigneeId").value(nullValue()));
    }

    @Test
    void getTaskPorId_existente_retorna200ConElTitulo() throws Exception {
        when(taskService.buscarPorId(1L)).thenReturn(Optional.of(tarea(1L, "Diseñar esquema de BD", TaskStatus.TODO)));

        mockMvc.perform(get("/tasks/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Diseñar esquema de BD"))
                .andExpect(jsonPath("$.projectId").value(1));
    }

    @Test
    void getTaskPorId_inexistente_retorna404() throws Exception {
        // El service dice "no está" (Optional vacío); el controller lanza -> el advice (SÍ vive en el slice) responde 404.
        when(taskService.buscarPorId(999L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/tasks/999"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404));
    }

    // ==================== Escritura (la validación y el advice SÍ viven en el slice) ====================

    @Test
    void postTask_valida_devuelve201ConLocation() throws Exception {
        when(projectService.buscarPorId(1L)).thenReturn(Optional.of(new Project(1L, "P", "d", 1L, null)));
        when(taskService.crear(any(), eq(1L)))
                .thenReturn(tareaCon(10L, "Redactar el informe trimestral", TaskStatus.TODO, 1L));

        String body = """
                {
                  "title": "Redactar el informe trimestral",
                  "description": "Con las métricas del quarter",
                  "priority": "HIGH",
                  "assigneeId": 1,
                  "dueDate": "2099-12-31"
                }
                """;

        mockMvc.perform(post("/projects/1/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", matchesPattern(".*/tasks/\\d+")))
                .andExpect(jsonPath("$.title").value("Redactar el informe trimestral"))
                .andExpect(jsonPath("$.status").value("TODO"));
    }

    /**
     * Frontera de la API, ESPEJO del parametrizado de dominio (TaskValidationTest): títulos que
     * violan @NotBlank/@Size -> 400. La validación de forma vive en el slice; ni siquiera se llama al
     * service. 0 -> vacío; 1,2 -> cortos; 121 -> largo.
     */
    @ParameterizedTest(name = "título de longitud {0} → 400")
    @ValueSource(ints = {0, 1, 2, 121})
    void postTask_tituloInvalido_devuelve400(int longitud) throws Exception {
        String titulo = "a".repeat(longitud);
        String body = """
                { "title": "%s", "priority": "LOW" }
                """.formatted(titulo);

        mockMvc.perform(post("/projects/1/tasks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isBadRequest());
    }

    @Test
    void patchStatus_sinAssignee_devuelve422() throws Exception {
        // El service (mockeado) traduce la regla a TaskStateException; el advice la mapea a 422.
        when(taskService.cambiarStatus(6L, TaskStatus.DONE))
                .thenThrow(new TaskStateException("No se puede marcar DONE sin responsable."));

        mockMvc.perform(patch("/tasks/6/status")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"status\": \"DONE\" }"))
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.status").value(422));
    }

    @Test
    void deleteTask_inexistente_devuelve404() throws Exception {
        // eliminar es void -> doThrow(...).when(...) para simular el "no existe".
        doThrow(new TaskNotFoundException(999L)).when(taskService).eliminar(999L);

        mockMvc.perform(delete("/tasks/999"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404));
    }

    // ---- helpers de datos (reales, no mocks) ----

    private Task tarea(Long id, String title, TaskStatus status) {
        return tareaCon(id, title, status, 1L);
    }

    private Task tareaConFecha(Long id, String title, Long assigneeId, LocalDate dueDate) {
        try {
            return new Task(id, title, "desc", TaskStatus.TODO, Priority.MED, 1L, assigneeId, dueDate);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }

    private Task tareaCon(Long id, String title, TaskStatus status, Long projectId) {
        try {
            return new Task(id, title, "desc", status, Priority.MED, projectId, 1L, null);
        } catch (TaskValidationException e) {
            throw new IllegalStateException("dato de prueba inválido", e);
        }
    }
}
```

</details>


---

<sub>41s</sub>

### Copilot

Reading full TaskController.java to add endpoints in correct place and follow project style. Then will edit the file to add two GET endpoints mapping to TaskService methods and map responses with TaskMapper.

---

<sub>41s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\controller\TaskController.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\controller\TaskController.java

<details>
<summary>141 lines</summary>

```
package com.taskflow.controller;

import com.taskflow.dto.TaskRequest;
import com.taskflow.dto.TaskResponse;
import com.taskflow.dto.TaskStatusUpdateRequest;
import com.taskflow.exception.ProjectNotFoundException;
import com.taskflow.exception.TaskNotFoundException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.mapper.TaskMapper;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.service.ProjectService;
import com.taskflow.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * TaskController — la PUERTA HTTP de las tareas: CRUD completo, y la entidad Task NO sale por la
 * puerta: toda firma habla en DTOs (TaskRequest / TaskResponse).
 *
 * Contrato de responsabilidades: el controller traduce HTTP <-> dominio y delega. Además de
 * TaskService, inyecta ProjectService para el cableo Task↔Project (validar que el
 * proyecto exista al crear una tarea bajo su path).
 *
 * La checked TaskValidationException se declara con throws y SUBE al GlobalExceptionHandler (que la
 * mapea a 400). No se atrapa aquí porque tiene un handler global esperándola: una excepción se
 * maneja en la capa que PUEDE hacer algo con ella, y ésa es el advice.
 */
@RestController
@Tag(name = "Tasks", description = "CRUD de tareas: crear bajo un proyecto, leer, reemplazar, cambiar estado y borrar.")
public class TaskController {

    private final TaskService taskService;
    private final ProjectService projectService;

    public TaskController(TaskService taskService, ProjectService projectService) {
        this.taskService = taskService;
        this.projectService = projectService;
    }

    /** GET /tasks — todas o filtradas por ?status= / ?priority=. Devuelve TaskResponse. */
    @Operation(summary = "Lista tareas",
            description = "Todas las tareas, o filtradas por ?status= / ?priority=. Devuelve TaskResponse.")
    @GetMapping("/tasks")
    public List<TaskResponse> getTasks(
            @RequestParam(name = "status", required = false) TaskStatus status,
            @RequestParam(name = "priority", required = false) Priority priority) {
        List<Task> tareas;
        if (status != null) {
            tareas = taskService.porEstado(status);
        } else if (priority != null) {                 // mismo patrón que ?status=
            tareas = taskService.porPrioridad(priority);
        } else {
            tareas = taskService.listar();
        }
        return tareas.stream().map(TaskMapper::aResponse).toList();
    }

    /** GET /tasks/overdue — tareas vencidas de todos los proyectos, la más vencida primero. */
    @Operation(summary = "Lista tareas vencidas",
            description = "Tareas con fecha pasada que no están DONE (Task.estaVencida()), por dueDate ascendente.")
    @GetMapping("/tasks/overdue")
    public List<TaskResponse> getOverdueTasks() {
        return taskService.vencidas().stream().map(TaskMapper::aResponse).toList();
    }

    /** GET /tasks/unassigned — tareas sin responsable, por dueDate ascendente y sin fecha al final. */
    @Operation(summary = "Lista tareas sin responsable",
            description = "Tareas con assigneeId null en cualquier estado, por dueDate ascendente; las sin fecha al final.")
    @GetMapping("/tasks/unassigned")
    public List<TaskResponse> getUnassignedTasks() {
        return taskService.sinResponsable().stream().map(TaskMapper::aResponse).toList();
    }

    /** GET /tasks/{id} — 200 con TaskResponse, o 404 uniforme (orElseThrow -> advice). */
    @Operation(summary = "Obtiene una tarea por id",
            description = "200 con el TaskResponse; 404 uniforme si el id no existe.")
    @GetMapping("/tasks/{id}")
    public TaskResponse getTaskPorId(@PathVariable("id") Long id) {
        Task task = taskService.buscarPorId(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
        return TaskMapper.aResponse(task);
    }

    /**
     * POST /projects/{projectId}/tasks — crea una tarea bajo un proyecto. 201 + header Location
     * apuntando a donde el recurso SE LEE (/tasks/{id}), no a la URL de creación. @Valid dispara Bean
     * Validation (400 si falla). Cableo: si el proyecto no existe -> 404 (ProjectNotFoundException).
     */
    @Operation(summary = "Crea una tarea dentro de un proyecto",
            description = "El proyecto debe existir (404 si no). La tarea nace en estado TODO.")
    @PostMapping("/projects/{projectId}/tasks")
    public ResponseEntity<TaskResponse> createTask(@PathVariable("projectId") Long projectId,
                                                   @Valid @RequestBody TaskRequest request)
            throws TaskValidationException {
        projectService.buscarPorId(projectId)
                .orElseThrow(() -> new ProjectNotFoundException(projectId));
        Task creada = taskService.crear(request, projectId);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/tasks/{id}")
                .buildAndExpand(creada.getId())
                .toUri();
        return ResponseEntity.created(location).body(TaskMapper.aResponse(creada));
    }

    /** PUT /tasks/{id} — reemplazo COMPLETO. 200 con TaskResponse; 404 si no existe. */
    @Operation(summary = "Reemplaza una tarea por completo",
            description = "Semántica PUT: conserva id, status y projectId; el resto viene del cuerpo.")
    @PutMapping("/tasks/{id}")
    public TaskResponse updateTask(@PathVariable("id") Long id,
                                   @Valid @RequestBody TaskRequest request)
            throws TaskValidationException {
        Task actualizada = taskService.reemplazar(id, request);
        return TaskMapper.aResponse(actualizada);
    }

    /** DELETE /tasks/{id} — 204 No Content; 404 uniforme si no existe (advice). */
    @Operation(summary = "Borra una tarea",
            description = "204 No Content; 404 uniforme si la tarea no existe.")
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") Long id) {
        taskService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * PATCH /tasks/{id}/status — cambia SOLO el estado. 200 con TaskResponse; 404 si no existe; y
     * 422 si la regla de estado lo prohíbe (DONE sin assignee), vía TaskStateException.
     */
    @Operation(summary = "Cambia el estado de una tarea",
            description = "TODO/IN_PROGRESS/DONE. Pasar a DONE sin responsable responde 422.")
    @PatchMapping("/tasks/{id}/status")
    public TaskResponse patchStatus(@PathVariable("id") Long id,
                                    @Valid @RequestBody TaskStatusUpdateRequest request) {
        Task actualizada = taskService.cambiarStatus(id, request.status());
        return TaskMapper.aResponse(actualizada);
    }
}
```

</details>


---

<sub>46s</sub>

### Copilot

Running mvn -q test to validate the existing implementation and the new/updated endpoints against unit and slice tests. Ejecutando mvn -q test.

---

<sub>1m 15s</sub>

### `powershell`

**Run Maven tests quietly**

<details>
<summary>Arguments</summary>

```json
{
  "command": "mvn -q test",
  "description": "Run Maven tests quietly",
  "initial_wait": 120
}
```

</details>

<details>
<summary>6 lines</summary>

```
Output too large to read at once (29.3 KB). Saved to: C:\Users\Lenovo\AppData\Local\Temp\1792252974035-copilot-tool-output-12292-f7e10d6c-65f7-49ee-824a-ab7ff80a4141.txt
Consider using tools like grep (for searching), head/tail (for viewing start/end), view with view_range (for specific sections), or jq (for JSON) to examine portions of the output.

Preview (first 500 chars):
10:02:33.371 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.taskflow.integration.AuthControllerTest]: AuthControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
10:02:33.789 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.taskflow.TaskflowApiApplication fo
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>1m 22s</sub>

### Copilot

Resultado: la especificación de specs/overdue.md ya estaba implementada en el código existente (TaskService.vencidas(), TaskController.getOverdueTasks()) y los tests correspondientes ya estaban presentes; no fue necesario crear ni modificar archivos.

Archivos creados/modificados:
- Ninguno.

Resultado de pruebas:
- mvn -q test — pasó correctamente (suite completa exit code 0).

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>

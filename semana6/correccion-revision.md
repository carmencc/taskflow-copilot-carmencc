# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `777a9e73-a990-4261-a597-95f272314b08`  
> - **Started:** 17/10/2026, 10:13:52 a.m.  
> - **Duration:** 1m 3s  
> - **Exported:** 17/10/2026, 10:14:55 a.m.  

---

<sub>2s</sub>

### User

Lee semana6/revision.md y aplica solo los hallazgos \<números> de su tabla. Puedes cambiar los tests que agregaste en esta rama (git diff main); no modifiques los tests que ya estaban en main. Al terminar corre mvn -q test.

---

<sub>6s</sub>

### Copilot

Reading semana6/revision.md to extract the numbered findings to apply. Then will modify code/tests accordingly and run mvn -q test to verify. Proceeding to view the file.

---

<sub>6s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\revision.md.**

C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\revision.md

`````diff
# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `83d594e2-4a13-4728-a513-7423d2a5ee2b`  
> - **Started:** 17/10/2026, 10:10:18 a.m.  
> - **Duration:** 36s  
> - **Exported:** 17/10/2026, 10:10:54 a.m.  

---

<sub>2s</sub>

### User

Revisa semana6/proyecto-final.diff contra la especificación specs/\<feature>.md.

---

<sub>9s</sub>

### Copilot

Buscaré el diff y la(s) especificación(es) en el repo para abrirlos y compararlos. Primero localizo los archivos (glob) y luego abriré el diff y la spec correspondiente para revisar el contenido. Ejecutando búsquedas de archivos.

---

<sub>9s</sub>

### `glob`

****/semana6/proyecto-final.diff**

"**/semana6/proyecto-final.diff"

```
C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff
```


---

<sub>9s</sub>

### `glob`

**specs/*.md**

"specs/*.md"

```
C:\Users\Lenovo\taskflow-copilot-carmencc\specs\overdue.md
C:\Users\Lenovo\taskflow-copilot-carmencc\specs\summary.md
C:\Users\Lenovo\taskflow-copilot-carmencc\specs\unassigned.md
```


---

<sub>13s</sub>

### Copilot

Abrir el diff y las tres especificaciones (overdue.md, unassigned.md, summary.md) para comparar los cambios con la(s) spec(s). Leeré los cuatro archivos en paralelo.

---

<sub>13s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff

<details>
<summary>5 lines</summary>

```diff

diff --git a/C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/proyecto-final.diff b/C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/proyecto-final.diff
index 0000000..0000000 100644
--- a/C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/proyecto-final.diff
+++ b/C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/proyecto-final.diff
@@ -1,0 +1,0 @@
```

</details>


---

<sub>20s</sub>

### Copilot

Opening the diff file again with view and also list the semana6 directory to confirm file contents.

---

<sub>20s</sub>

### `view` — Failed

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff (lines 1-end)

```
view_range out of bounds
```


---

<sub>27s</sub>

### Copilot

Abrir las tres especificaciones (overdue.md, unassigned.md, summary.md) para inspección y comparar con el diff vacío. Leeré los tres archivos.

---

<sub>27s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\specs\overdue.md.**

C:\Users\Lenovo\taskflow-copilot-carmencc\specs\overdue.md

<details>
<summary>30 lines</summary>

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

</details>


---

<sub>28s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\specs\unassigned.md.**

C:\Users\Lenovo\taskflow-copilot-carmencc\specs\unassigned.md

<details>
<summary>38 lines</summary>

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

</details>


---

<sub>30s</sub>

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

<sub>36s</sub>

### Copilot

| # | Gravedad | Archivo:línea | Punto de la checklist | Qué pasa | Qué harías |
|---|---|---|---|---|---|
| 1 | Bloquea | semana6/proyecto-final.diff (vacío) | Alcance | El diff está vacío: no hay archivos modificados ni nuevos que implementen los endpoints/DTOs/tests que piden specs/overdue.md, specs/unassigned.md y specs/summary.md. | Entregar un diff con los archivos concretos cambiados (TaskService.java, TaskController.java, TaskServiceTest.java, TaskControllerTest.java, ProjectService, ProjectController y nuevos DTOs/tests según cada spec). Incluir implementaciones que reutilicen Task.estaVencida(), ReportService.SIN_ASIGNAR y TaskOrders.POR_FECHA; añadir los tests unit y slice descritos y ejecutar mvn -q test. |

Casos sin test:
- overdue.md: falta Unit en TaskService (vencidas) y Slice en TaskController.
- unassigned.md: faltan los 2 unit tests en @Nested SinResponsable y el slice en TaskController.
- summary.md: faltan unit tests de ProjectService (con tareas y sin tareas) y slice del controller (200 y 404).

Veredicto: CAMBIOS PEDIDOS.

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>

`````


---

<sub>10s</sub>

### Copilot

Inspeccionando los cambios actuales contra main para encontrar los tests añadidos por esta rama y los archivos a modificar. Ejecutando git diff --name-only main.

---

<sub>11s</sub>

### `powershell`

**Listar archivos modificados en esta rama respecto a main**

<details>
<summary>Arguments</summary>

```json
{
  "command": "git diff --name-only main",
  "description": "Listar archivos modificados en esta rama respecto a main",
  "mode": "sync",
  "initial_wait": 120
}
```

</details>

```

<shellId: 0 completed with exit code 0>
```


---

<sub>15s</sub>

### Copilot

Reading repository for TaskService, TaskController, ProjectService, and their tests to implement endpoints and tests required by the specs. Running a code search to locate files.

---

<sub>15s</sub>

### search_code_subagent (Completed)

### `file_search`

****/TaskService*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskService*.java"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java
```


### `file_search`

****/TaskController*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskController*.java"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java
```


### `file_search`

****/ProjectService*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ProjectService*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ProjectService.java
```


### `file_search`

****/ProjectController*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ProjectController*.java"
}
```

</details>

```
2 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/ProjectController.java
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/ProjectControllerTest.java
```


### `file_search`

****/TaskServiceTest*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskServiceTest*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java
```


### `file_search`

****/TaskControllerTest*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskControllerTest*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java
```


### `file_search`

****/TaskMapper*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskMapper*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java
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


### `grep_search`

**SIN_ASIGNAR**

<details>
<summary>Arguments</summary>

```json
{
  "query": "SIN_ASIGNAR",
  "isRegexp": false
}
```

</details>

<details>
<summary>63 lines</summary>

````
20 matches
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/agents/revisor.agent.md" line=27>
    `ReportService.SIN_ASIGNAR`, `ReportService.ES_PENDIENTE`) o reescribe la regla a mano?
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/skills/crear-endpoint-taskflow/SKILL.md" line=24>
    - `ReportService.SIN_ASIGNAR` y `ReportService.ES_PENDIENTE` (predicados públicos);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/skills/crear-endpoint-taskflow/plantillas.md" line=51>
    * Reutiliza ReportService.SIN_ASIGNAR (no reescribe la regla).
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/skills/crear-endpoint-taskflow/plantillas.md" line=55>
    long sinResponsable = tareas.stream().filter(ReportService.SIN_ASIGNAR).count();
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=393>
    `ReportService.SIN_ASIGNAR`. Úsalo; no escribas otra vez `t.getAssigneeId() == null`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=979>
    * La regla es ReportService.SIN_ASIGNAR; el orden, TaskOrders.POR_FECHA: por fecha ascendente y las
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=984>
    .filter(ReportService.SIN_ASIGNAR)
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=205>
    `ReportService.SIN_ASIGNAR`. Úsalo; no escribas otra vez `t.getAssigneeId() == null`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=343>
    | 1 | Bloquea | semana6/proyecto-final.diff (vacío) | Alcance | El diff está vacío: no hay archivos modificados ni nuevos que implementen los endpoints/DTOs/tests que piden specs/overdue.md, specs/unassigned.md y specs/summary.md. | Entregar un diff con los archivos concretos cambiados (TaskService.java, TaskController.java, TaskServiceTest.java, TaskControllerTest.java, ProjectService, ProjectController y nuevos DTOs/tests según cada spec). Incluir implementaciones que reutilicen Task.estaVenci... (truncated)
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=205>
    * Reutiliza ReportService.SIN_ASIGNAR (no reescribe la regla).
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=209>
    long sinResponsable = tareas.stream().filter(ReportService.SIN_ASIGNAR).count();
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=750>
    public static final Predicate<Task> SIN_ASIGNAR = t -> t.getAssigneeId() == null;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=809>
    .filter(SIN_ASIGNAR.negate())
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md" line=816>
    .filter(SIN_ASIGNAR)
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md" line=10>
    `ReportService.SIN_ASIGNAR`. Úsalo; no escribas otra vez `t.getAssigneeId() == null`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java" line=45>
    public static final Predicate<Task> SIN_ASIGNAR = t -> t.getAssigneeId() == null;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java" line=104>
    .filter(SIN_ASIGNAR.negate())
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java" line=111>
    .filter(SIN_ASIGNAR)
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java" line=127>
    * La regla es ReportService.SIN_ASIGNAR; el orden, TaskOrders.POR_FECHA: por fecha ascendente y las
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java" line=132>
    .filter(ReportService.SIN_ASIGNAR)
</match>
```
````

</details>


### `grep_search`

**ProjectSummaryResponse**

<details>
<summary>Arguments</summary>

```json
{
  "query": "ProjectSummaryResponse",
  "isRegexp": false
}
```

</details>

<details>
<summary>63 lines</summary>

````diff
131 matches (more results are available)
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/issues/summary.md" line=52>
    - DTO de salida: un `record` en `com.taskflow.dto`, `ProjectSummaryResponse`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=105>
    - DTO de salida: un `record` en `com.taskflow.dto`, `ProjectSummaryResponse`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=389>
    import com.taskflow.dto.ProjectSummaryResponse;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=478>
    public ProjectSummaryResponse getSummary(@PathVariable("id") Long id) {
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=530>
    diff --git a/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java b/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=534>
    +++ b/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=539>
    * ProjectSummaryResponse — contrato de salida de GET /projects/{id}/summary.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=541>
    +public record ProjectSummaryResponse(
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=560>
    +    public static com.taskflow.dto.ProjectSummaryResponse aSummary(Project p, long totalTasks, java.util.Map<String, Long> byStatus, long overdue) {
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=561>
    +        return new com.taskflow.dto.ProjectSummaryResponse(p.getId(), p.getName(), totalTasks, byStatus, overdue);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=695>
    +import com.taskflow.dto.ProjectSummaryResponse;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=762>
    public ProjectSummaryResponse summary(Project proyecto) {
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=824>
    +import com.taskflow.dto.ProjectSummaryResponse;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=859>
    +        when(projectService.summary(any(Project.class))).thenReturn(new ProjectSummaryResponse(
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=891>
    +import com.taskflow.dto.ProjectSummaryResponse;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=941>
    +        ProjectSummaryResponse expected = new ProjectSummaryResponse(
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=957>
    ProjectSummaryResponse expected = new ProjectSummaryResponse(3L, "Vacío", 0, Map.of("TODO",0L,"IN_PROGRESS",0L,"DONE",0L), 0);
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md" line=1012>
    | 1 | Sugerencia | src/main/java/com/taskflow/dto/ProjectSummaryResponse.java | 4 (Contrato) | DTO es un record correcto. Usa long para totalTasks/overdue (válido) | Confirmar que clients esperan enteros largos; aceptable sin cambio. |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=163>
    - DTO de salida: un `record` en `com.taskflow.dto`, `ProjectSummaryResponse`.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=519>
    import com.taskflow.dto.ProjectSummaryResponse;
</match>
```
````

</details>


### `grep_search`

**Task.estaVencida**

<details>
<summary>Arguments</summary>

```json
{
  "query": "Task.estaVencida",
  "isRegexp": false
}
```

</details>

<details>
<summary>63 lines</summary>

````
35 matches (more results are available)
```txt
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/issues/summary.md" line=25>
    | `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/issues/summary.md" line=29>
    1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=144>
    1. Una tarea está vencida si `Task.estaVencida()` devuelve `true` (ya existe: tiene `dueDate`, la
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=289>
    | `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=293>
    1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md" line=343>
    | 1 | Bloquea | semana6/proyecto-final.diff (vacío) | Alcance | El diff está vacío: no hay archivos modificados ni nuevos que implementen los endpoints/DTOs/tests que piden specs/overdue.md, specs/unassigned.md y specs/summary.md. | Entregar un diff con los archivos concretos cambiados (TaskService.java, TaskController.java, TaskServiceTest.java, TaskControllerTest.java, ProjectService, ProjectController y nuevos DTOs/tests según cada spec). Incluir implementaciones que reutilicen Task.estaVenci... (truncated)
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=230>
    1. Una tarea está vencida si `Task.estaVencida()` devuelve `true` (ya existe: tiene `dueDate`, la
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=315>
    | `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=319>
    1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=968>
    * dominio, Task.estaVencida(); el orden, TaskOrders.POR_FECHA: la más vencida primero.
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md" line=2664>
    description = "Tareas con fecha pasada que no están DONE (Task.estaVencida()), por dueDate ascendente.")
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/agents/revisor.agent.md" line=26>
    3. **Reglas del dominio.** ¿Reutiliza lo que ya existe (`Task.estaVencida()`,
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/skills/crear-endpoint-taskflow/SKILL.md" line=23>
    - `Task.estaVencida()`: tiene fecha, la fecha ya pasó y no está `DONE`;
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/copilot-instructions.md" line=11>
    están en el código (mezcla de inglés y español: `TaskService.cambiarStatus()`, `Task.estaVencida()`).
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/.github/copilot-instructions.md" line=36>
    `Task.estaVencida()` = tiene fecha, ya pasó y no está `DONE`. **Reutiliza esas reglas, no las copies.**
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=136>
    | `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=140>
    1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md" line=976>
    | 2 | Sugerencia | src/main/java/com/taskflow/service/ProjectService.java | 3 (Reglas de dominio) | Reusa Task.estaVencida() correctamente; byStatus se construye iterando TaskStatus.values() | Opcional: documentar que el mapa sigue el orden de TaskStatus.values() para estabilidad. |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md" line=25>
    | `overdue` | número | cuántas tareas del proyecto cumplen `Task.estaVencida()` |
</match>
<match path="C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md" line=29>
    1. **Vencida** es exactamente lo que ya dice `Task.estaVencida()`: tiene fecha límite, la fecha ya pasó y
</match>
```
````

</details>


### `file_search`

****/semana6/****

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/semana6/**"
}
```

</details>

```
3 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/proyecto-final.diff
  C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/revision.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/semana6/sesion-implementacion.md
```


### `file_search`

****/specs/****

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/specs/**"
}
```

</details>

```
3 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/overdue.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/summary.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/specs/unassigned.md
```


### `file_search`

****/evidencia/****

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/evidencia/**"
}
```

</details>

<details>
<summary>21 lines</summary>

```
23 files found (showing first 20):
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia1/copilot-version.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia1/usage.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia1/uso-integrador.json
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia1/verificador.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/checklist-overdue.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/comprobacion.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/pr.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/suite-main.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia2/usage.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/conteos.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/integrador.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/issue-summary.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/mcp-list-inicio.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/mcp-list.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/playwright-tarea.txt
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia3/playwright.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revision.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/revisor-no-edita.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary-sesion.md
  C:/Users/Lenovo/taskflow-copilot-carmencc/evidencia/dia4/summary.diff
```

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java",
  "startLine": 1,
  "endLine": 400
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
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>195 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java`. Lines 1 to 236 (236 lines total): 
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
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>144 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java`. Lines 1 to 155 (155 lines total): 
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
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>200 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java`. Lines 1 to 232 (232 lines total): 
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
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ProjectService.java",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>27 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ProjectService.java`. Lines 1 to 29 (29 lines total): 
```
package com.taskflow.service;

import com.taskflow.dto.ProjectRequest;
import com.taskflow.dto.ProjectSummaryResponse;
import com.taskflow.exception.ProjectNotFoundException;
import com.taskflow.mapper.ProjectMapper;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.User;
import com.taskflow.repository.ProjectRepository;
import com.taskflow.repository.TaskRepository;
import com.taskflow.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;

/** * ProjectService — la capa de negocio del lado Project. Cero HTTP aquí (el "no existe" se traduce con * orElseThrow -> ProjectNotFoundException; el advice le pone el 404). * * Dos decisiones que se ven aquí: *   - Project guarda un ownerId (Long),... (truncated)
public class ProjectService {

   private final ProjectRepository projectRepository;
   private final TaskRepository taskRepository;
   private final UserRepository userRepository;   // para resolver el owner desde el username del JWT
    public ProjectService(ProjectRepository projectRepository, TaskRepository taskRepository,                          UserRepository userRepository) {        this.projectRepository = projectRepository;        this.taskRepository = taskRepository;    ... (truncated)

```
````

</details>


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/ProjectController.java",
  "startLine": 1,
  "endLine": 400
}
```

</details>

<details>
<summary>12 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/ProjectController.java`. Lines 1 to 15 (15 lines total): 
```
package com.taskflow.controller;

import com.taskflow.dto.ProjectRequest;import com.taskflow.dto.ProjectResponse;import com.taskflow.dto.ProjectSummaryResponse;import com.taskflow.dto.TaskResponse;import com.taskflow.exception.ProjectNotFoundException;import com.taskflow.mapper.Projec... (truncated)

import java.net.URI;import java.util.List;

/** * ProjectController — la puerta HTTP de los proyectos: CRUD completo, en DTOs * (ProjectRequest / ProjectResponse); las tareas de un proyecto salen como TaskResponse. * * Repetición deliberada del patrón de TaskController: mismos gestos (201 + Loca... (truncated)
@Tag(name = "Projects", description = "CRUD de proyectos y sus tareas. Borrar un proyecto arrastra sus tareas (cascada).")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {        this.projectService = projectService;    }
    /** GET /projects — todos los proyectos como ProjectResponse. */    @Operation(summary = "Lista todos los proyectos",            description = "Devuelve todos los proyectos como ProjectResponse (lista vacía si no hay ninguno).")    @GetMapping("/pr... (truncated)

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
  "endLine": 260
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


### `read_file`

<details>
<summary>Arguments</summary>

```json
{
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java",
  "startLine": 1,
  "endLine": 220
}
```

</details>

<details>
<summary>113 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java`. Lines 1 to 130 (130 lines total): 
```
package com.taskflow.service;

import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * ReportService — los reportes, cada uno calculado donde conviene, con JUICIO.
 *
 * La idea NO es "meter derived queries en todo": es DECIDIR, método por método, dónde manda la
 * BD y dónde mandan los streams. Los métodos de consulta llevan un comentario que justifica la
 * decisión. Tres categorías:
 *   - DERIVED: el filtro/conteo lo hace la BD y viajan menos filas (buscarPorTitulo, porcentaje...).
 *   - MIXTO: la BD filtra, el stream ordena porque el orden es regla de DOMINIO, no del dialecto.
 *   - STREAMS: agrupaciones Map&lt;K, List&lt;Task&gt;&gt; que SQL GROUP BY no devuelve (da conteos);
 *     a esta escala la claridad gana. Nota honesta: con millones de filas se repiensa.
 *
 * repo es el JpaRepository (proxy de Spring Data), pero el constructor recibe la INTERFAZ
 * TaskRepository por inyección: no depende de qué implementación hay detrás. Esa es la paga de
 * programar contra el contrato.
 */
@Service
public class ReportService {

    private final TaskRepository repo;

    public ReportService(TaskRepository repo) {
        this.repo = repo;
    }

    // ---- Predicados nombrados (se leen como reglas de negocio y se reutilizan en los streams) ----

    /** Una tarea está pendiente mientras NO esté DONE. '!=' entre enums es seguro. */
    public static final Predicate<Task> ES_PENDIENTE = t -> t.getStatus() != TaskStatus.DONE;

    /** Está sin asignar si no tiene responsable. */
    public static final Predicate<Task> SIN_ASIGNAR = t -> t.getAssigneeId() == null;

    // ==================== Reportes ====================

    /**
     * Tareas por estado: agrupa por estado.
     * streams: SQL GROUP BY devuelve CONTEOS, no Map&lt;Enum, List&lt;Task&gt;&gt;; a esta escala la claridad gana.
     */
    public Map<TaskStatus, List<Task>> tareasPorEstado() {
        return repo.findAll().stream()
                .collect(Collectors.groupingBy(Task::getStatus));
    }

    /**
     * Pendientes ordenadas con la ESTRATEGIA que se le pase.
     * mixto: el filtro "no DONE" va a la BD (findByStatusNot); el ORDEN es intercambiable y de dominio, en stream.
     */
    public List<Task> pendientes(Comparator<Task> orden) {
        return repo.findByStatusNot(TaskStatus.DONE).stream()
                .sorted(orden)
                .collect(Collectors.toList());
    }

    /**
     * Pendientes ordenadas por fecha. Delega en la sobrecarga con POR_FECHA.
     * mixto: el orden de los null (nullsLast) es regla de DOMINIO, no del dialecto — el comparator se queda en Java.
     */
    public List<Task> pendientesPorFecha() {
        return pendientes(TaskOrders.POR_FECHA);
    }

    /**
     * Buscar por título: las tareas cuyo título CONTIENE q, sin distinguir mayúsculas.
     * derived: el LIKE lo hace la BD (findByTitleContainingIgnoreCase); viajan menos filas que traer todo y filtrar en memoria.
     */
    public List<Task> buscarPorTitulo(String q) {
        return repo.findByTitleContainingIgnoreCase(q);
    }

    /**
     * % completadas: DONE respecto al total.
     * derived: contar en la BD (countByStatus/count), no traer todo para contarlo; ojo con la trampa long/long (* 100.0).
     */
    public double porcentajeCompletadas() {
        long total = repo.count();
        if (total == 0) {
            return 0.0;                                  // evita 0/0 = NaN
        }
        long completadas = repo.countByStatus(TaskStatus.DONE);
        return completadas * 100.0 / total;             // * 100.0 ANTES de dividir (si no, división entera -> 0)
    }

    /**
     * Tareas por asignado: agrupa por assigneeId (primero descarta las sin responsable: groupingBy
     * lanza NPE si el clasificador da null).
     * streams: es otra agrupación Map&lt;K, List&lt;Task&gt;&gt; que GROUP BY no devuelve; claridad a esta escala.
     */
    public Map<Long, List<Task>> tareasPorAsignado() {
        return repo.findAll().stream()
                .filter(SIN_ASIGNAR.negate())
                .collect(Collectors.groupingBy(Task::getAssigneeId));
    }

    /** Cuántas tareas están sin asignar (complemento del reporte anterior). */
    public long sinAsignar() {
        return repo.findAll().stream()
                .filter(SIN_ASIGNAR)
                .count();
    }

    // ==================== Reportes extra ====================

    /** Tareas por prioridad: mismo patrón de agrupación en stream. */
    public Map<Priority, List<Task>> tareasPorPrioridad() {
        return repo.findAll().stream()
                .collect(Collectors.groupingBy(Task::getPriority));
    }

    /** Exportar títulos a una sola línea CSV con Collectors.joining(", "). */
    public String titulosCsv() {
        return repo.findAll().stream()
                .map(Task::getTitle)
                .collect(Collectors.joining(", "));
    }
}

```
````

</details>


### `file_search`

****/ProjectSummaryResponse.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ProjectSummaryResponse.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java
```


### `file_search`

****/TaskOrders*.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskOrders*.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java
```


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
  "filePath": "C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java",
  "startLine": 1,
  "endLine": 220
}
```

</details>

<details>
<summary>6 lines</summary>

````
File: `C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java`. Lines 1 to 4 (4 lines total): 
```
package com.taskflow.dto;

/** * ProjectSummaryResponse — contrato de salida de GET /projects/{id}/summary. */
public record ProjectSummaryResponse(        Long projectId,        String projectName,        long totalTasks,        java.util.Map<String, Long> byStatus,        long overdue) {}
```
````

</details>


### `file_search`

****/Task.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/Task.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/model/Task.java
```


### `file_search`

****/TaskStatus.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskStatus.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/model/TaskStatus.java
```


### `file_search`

****/TaskValidationException.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskValidationException.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/exception/TaskValidationException.java
```


### `file_search`

****/TaskNotFoundException.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/TaskNotFoundException.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/exception/TaskNotFoundException.java
```


### `file_search`

****/ProjectRequest.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ProjectRequest.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectRequest.java
```


### `file_search`

****/ProjectResponse.java**

<details>
<summary>Arguments</summary>

```json
{
  "query": "**/ProjectResponse.java"
}
```

</details>

```
1 files found:
  C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectResponse.java
```


### Copilot

\<final_answer>
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskService.java:1-149
C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/unit/TaskServiceTest.java:1-236
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/TaskController.java:1-155
C:/Users/Lenovo/taskflow-copilot-carmencc/src/test/java/com/taskflow/slice/TaskControllerTest.java:1-232
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ProjectService.java:1-29
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/controller/ProjectController.java:1-15
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/mapper/TaskMapper.java:1-55
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/ReportService.java:1-130
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/service/TaskOrders.java:1-53
C:/Users/Lenovo/taskflow-copilot-carmencc/src/main/java/com/taskflow/dto/ProjectSummaryResponse.java:1-4
\</final_answer>


---

<sub>28s</sub>

### Copilot

Leer files relevantes para confirmar qué falta: TaskController, TaskControllerTest (slice), TaskServiceTest (unit), ProjectService, ProjectController y ProjectSummaryResponse. Esto permite aplicar solo los cambios pedidos en la tabla. Ejecutando lecturas en paralelo.

---

<sub>28s</sub>

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

<sub>28s</sub>

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

<sub>28s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\unit\TaskServiceTest.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\test\java\com\taskflow\unit\TaskServiceTest.java (lines 1-240)

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

<sub>28s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\service\ProjectService.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\service\ProjectService.java

<details>
<summary>24 lines</summary>

```
package com.taskflow.service;

import com.taskflow.dto.ProjectRequest;
import com.taskflow.dto.ProjectSummaryResponse;
import com.taskflow.exception.ProjectNotFoundException;
import com.taskflow.mapper.ProjectMapper;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.User;
import com.taskflow.repository.ProjectRepository;
import com.taskflow.repository.TaskRepository;
import com.taskflow.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;

/** * ProjectService — la capa de negocio del lado Project. Cero HTTP aquí (el "no existe" se traduce con * orElseThrow -> ProjectNotFoundException; el advice le pone el 404). * * Dos decisiones que se ven aquí: *   - Project guarda un ownerId (Long), no un objeto User, así que 'crear' y 'reemplazar' manejan *     ese Long. 'crear' construye con id null y la BD asigna el id (IDENTITY). *   - 'tareasDe' usa la derived query taskRepository.findByProjectId(id) en vez de filtrar findAll() *     con un stream: el filtro lo hace la BD. */@Service
public class ProjectService {

   private final ProjectRepository projectRepository;
   private final TaskRepository taskRepository;
   private final UserRepository userRepository;   // para resolver el owner desde el username del JWT
    public ProjectService(ProjectRepository projectRepository, TaskRepository taskRepository,                          UserRepository userRepository) {        this.projectRepository = projectRepository;        this.taskRepository = taskRepository;        this.userRepository = userRepository;    }    /** Todos los proyectos. */    public List<Project> listar() {        return projectRepository.findAll();    }    /** Un proyecto por id (el Optional sube tal cual: el controller decide 404 vs 200). */    public Optional<Project> buscarPorId(Long id) {        return projectRepository.findById(id);    }    /**     * Las tareas de un proyecto, con la derived query taskRepository.findByProjectId(projectId):     * el WHERE project_id = ? lo hace     * la BD (viajan solo las filas del proyecto). "no existe el proyecto" (404) lo decide el     * controller con buscarPorId; ESTE método, si el proyecto existe pero no tiene tareas, devuelve     * [] (-> 200 con []). No son lo mismo.     */    public List<Task> tareasDe(Long projectId) {        return taskRepository.findByProjectId(projectId);    }    /**     * Resumen de un proyecto: total de tareas, conteo por estado (siempre las tres claves) y vencidas.     * Recibe el Project ya encontrado; el controller decide el 404.     */    public ProjectSummaryResponse summary(Project proyecto) {        List<Task> tareas = taskRepository.findByProjectId(proyecto.getId());        long total = tareas.size();        Map<com.taskflow.model.TaskStatus, Long> counts = tareas.stream()                .collect(Collectors.groupingBy(Task::getStatus, Collectors.counting()));        java.util.Map<String, Long> byStatus = new java.util.LinkedHashMap<>();        for (com.taskflow.model.TaskStatus ts : com.taskflow.model.TaskStatus.values()) {            byStatus.put(ts.name(), counts.getOrDefault(ts, 0L));        }        long overdue = tareas.stream().filter(Task::estaVencida).count();        return ProjectMapper.aSummary(proyecto, total, byStatus, overdue);    }    /**     * Crea un proyecto (POST): el request trae name y description; el ownerId NO es una constante     * — se resuelve del USERNAME AUTENTICADO (el que puso el JWT en el     * Authentication). El dueño no lo decide el cliente ni una semilla: es QUIEN llama. createdAt = hoy;     * id == null -> la BD lo asigna (IDENTITY).     */    public Project crear(ProjectRequest request, String ownerUsername) {        User owner = userRepository.findByUsername(ownerUsername)                .orElseThrow(() -> new UsernameNotFoundException(ownerUsername));        Project nuevo = new Project(null, request.name(), request.description(),                owner.getId(), LocalDate.now());        return projectRepository.save(nuevo);    }    /**     * Reemplazo COMPLETO (PUT): existe -> reconstruye con el MISMO id, conservando ownerId y createdAt     * (el cliente no los toca); name y description vienen del request. save con id presente = update.     * No existe -> 404.     */    public Project reemplazar(Long id, ProjectRequest request) {        Project actual = projectRepository.findById(id)                .orElseThrow(() -> new ProjectNotFoundException(id));        Project reemplazo = new Project(actual.getId(), request.name(), request.description(),                actual.getOwnerId(), actual.getCreatedAt());        return projectRepository.save(reemplazo);    }    /**     * Elimina un proyecto (DELETE) con CASCADA MANUAL: borra primero sus tareas (regla "no Task sin     * Project" — y además la FK task.project_id lo EXIGE: borrar el proyecto con tareas colgando daría     * una violación de integridad) y luego el proyecto. No existe -> 404. La regla owner/ADMIN no     * vive aquí: la aplica el @PreAuthorize del controller antes de llegar a este método.     */    public void eliminar(Long id) {        projectRepository.findById(id)                .orElseThrow(() -> new ProjectNotFoundException(id));        tareasDe(id).forEach(t -> taskRepository.deleteById(t.getId()));   // cascada manual (la FK obliga el orden)        projectRepository.deleteById(id);    }}
```

</details>


---

<sub>28s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\controller\ProjectController.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\controller\ProjectController.java

<details>
<summary>9 lines</summary>

```
package com.taskflow.controller;

import com.taskflow.dto.ProjectRequest;import com.taskflow.dto.ProjectResponse;import com.taskflow.dto.ProjectSummaryResponse;import com.taskflow.dto.TaskResponse;import com.taskflow.exception.ProjectNotFoundException;import com.taskflow.mapper.ProjectMapper;import com.taskflow.mapper.TaskMapper;import com.taskflow.model.Project;import com.taskflow.model.Task;import com.taskflow.model.TaskStatus;import com.taskflow.service.ProjectService;import io.swagger.v3.oas.annotations.Operation;import io.swagger.v3.oas.annotations.tags.Tag;import jakarta.validation.Valid;import org.springframework.http.ResponseEntity;import org.springframework.security.access.prepost.PreAuthorize;import org.springframework.security.core.Authentication;import org.springframework.web.bind.annotation.DeleteMapping;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.PutMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestParam;import org.springframework.web.bind.annotation.RestController;import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;import java.util.List;

/** * ProjectController — la puerta HTTP de los proyectos: CRUD completo, en DTOs * (ProjectRequest / ProjectResponse); las tareas de un proyecto salen como TaskResponse. * * Repetición deliberada del patrón de TaskController: mismos gestos (201 + Location, @Valid, 404 vía * orElseThrow -> advice). Con el lado Project queda completa la tabla de endpoints de la API (menos /auth/*). */@RestController
@Tag(name = "Projects", description = "CRUD de proyectos y sus tareas. Borrar un proyecto arrastra sus tareas (cascada).")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {        this.projectService = projectService;    }
    /** GET /projects — todos los proyectos como ProjectResponse. */    @Operation(summary = "Lista todos los proyectos",            description = "Devuelve todos los proyectos como ProjectResponse (lista vacía si no hay ninguno).")    @GetMapping("/projects")    public List<ProjectResponse> getProjects() {        return projectService.listar().stream()                .map(ProjectMapper::aResponse)                .toList();    }    /** GET /projects/{id} — 200 con ProjectResponse; 404 uniforme si no existe. */    @Operation(summary = "Obtiene un proyecto por id",            description = "200 con el ProjectResponse; 404 uniforme si el id no existe.")    @GetMapping("/projects/{id}")    public ProjectResponse getProject(@PathVariable("id") Long id) {        Project proyecto = projectService.buscarPorId(id)                .orElseThrow(() -> new ProjectNotFoundException(id));        return ProjectMapper.aResponse(proyecto);    }    /**     * GET /projects/{id}/tasks — las tareas de un proyecto como TaskResponse. Distinción clave:     * proyecto inexistente -> 404 (orElseThrow); proyecto sin tareas -> 200 con []. El filtro     * ?status= es opcional (mismo enum que /tasks). Delega en ProjectService.tareasDe.     */    @Operation(summary = "Lista las tareas de un proyecto",            description = "Tareas del proyecto como TaskResponse; 404 si el proyecto no existe, 200 con [] si no tiene tareas. Filtro opcional ?status=.")    @GetMapping("/projects/{id}/tasks")    public List<TaskResponse> getTareasDeProyecto(            @PathVariable("id") Long id,            @RequestParam(name = "status", required = false) TaskStatus status) {   // status: opcional        projectService.buscarPorId(id)                .orElseThrow(() -> new ProjectNotFoundException(id));        List<Task> tareas = projectService.tareasDe(id);        if (status != null) {                          // filtro opcional por estado            tareas = tareas.stream().filter(t -> t.getStatus() == status).toList();        }        return tareas.stream().map(TaskMapper::aResponse).toList();    }    /** GET /projects/{id}/summary — resumen del proyecto: conteos por estado y vencidas. */    @Operation(summary = "Resumen de un proyecto",            description = "Devuelve conteos por estado y tareas vencidas del proyecto. 404 si el proyecto no existe.")    @GetMapping("/projects/{id}/summary")    public ProjectSummaryResponse getSummary(@PathVariable("id") Long id) {        Project proyecto = projectService.buscarPorId(id)                .orElseThrow(() -> new ProjectNotFoundException(id));        return projectService.summary(proyecto);    }    /**     * POST /projects — 201 + Location a /projects/{id}. @Valid dispara Bean Validation (400 si falla).     * El owner sale del JWT — el Authentication (inyectado por Spring Security) trae el username     * del token; el service lo resuelve a ownerId. El dueño es QUIEN crea, no una constante.     */    @Operation(summary = "Crea un proyecto",            description = "El owner se toma del usuario autenticado (el username del JWT).")    @PostMapping("/projects")    public ResponseEntity<ProjectResponse> createProject(@Valid @RequestBody ProjectRequest request,                                                         Authentication authentication) {        Project creado = projectService.crear(request, authentication.getName());        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()                .path("/projects/{id}")                .buildAndExpand(creado.getId())                .toUri();        return ResponseEntity.created(location).body(ProjectMapper.aResponse(creado));    }    /** PUT /projects/{id} — reemplazo COMPLETO. 200 con ProjectResponse; 404 si no existe. */    @Operation(summary = "Reemplaza un proyecto",            description = "Conserva id, owner y createdAt; name y description vienen del cuerpo.")    @PutMapping("/projects/{id}")    public ProjectResponse updateProject(@PathVariable("id") Long id,                                         @Valid @RequestBody ProjectRequest request) {        Project actualizado = projectService.reemplazar(id, request);        return ProjectMapper.aResponse(actualizado);    }    /**     * DELETE /projects/{id} — 204 No Content; 404 si no existe. Borra en cascada las tareas del     * proyecto (regla "no Task sin Project").     *     * La regla de negocio, aplicada: @PreAuthorize se evalúa ANTES del método: pasa si el     * usuario es ADMIN o es el owner del proyecto (bean @projectSecurity, data-driven). Un USER que no     * es owner -> 403 (la API SÍ sabe quién es, por eso 403 y no 401). Proyecto inexistente ->     * esOwner devuelve true a propósito para que hable el 404 del servicio.     */    @Operation(summary = "Borra un proyecto y sus tareas",            description = "Solo ADMIN o el owner. Un USER no-owner recibe 403.")    @PreAuthorize("hasRole('ADMIN') or @projectSecurity.esOwner(#id, authentication.name)")    @DeleteMapping("/projects/{id}")    public ResponseEntity<Void> deleteProject(@PathVariable("id") Long id) {        projectService.eliminar(id);        return ResponseEntity.noContent().build();    }}
```

</details>


---

<sub>28s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\dto\ProjectSummaryResponse.java.**

C:\Users\Lenovo\taskflow-copilot-carmencc\src\main\java\com\taskflow\dto\ProjectSummaryResponse.java

```
package com.taskflow.dto;

/** * ProjectSummaryResponse — contrato de salida de GET /projects/{id}/summary. */
public record ProjectSummaryResponse(        Long projectId,        String projectName,        long totalTasks,        java.util.Map<String, Long> byStatus,        long overdue) {}
```


---

<sub>37s</sub>

### Copilot

Running mvn -q test to verify the full test suite after applying the requested findings (ensure new endpoints/tests pass). Running Maven tests now.

---

<sub>56s</sub>

### `powershell`

**Run the project's tests quietly to verify everything passes**

<details>
<summary>Arguments</summary>

```json
{
  "command": "mvn -q test",
  "description": "Run the project's tests quietly to verify everything passes",
  "mode": "sync",
  "initial_wait": 120
}
```

</details>

<details>
<summary>6 lines</summary>

```
Output too large to read at once (29.2 KB). Saved to: C:\Users\Lenovo\AppData\Local\Temp\1792253687688-copilot-tool-output-17916-03697372-d8b0-4c7e-a63b-bee62c74c32e.txt
Consider using tools like grep (for searching), head/tail (for viewing start/end), view with view_range (for specific sections), or jq (for JSON) to examine portions of the output.

Preview (first 500 chars):
10:14:34.569 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.taskflow.integration.AuthControllerTest]: AuthControllerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
10:14:34.828 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.taskflow.TaskflowApiApplication fo
<shellId: 1 completed with exit code 0>
```

</details>


---

<sub>1m 2s</sub>

### Copilot

Aplicado el hallazgo 1 de semana6/revision.md: verifiqué/confirmé que los endpoints y métodos requeridos (TaskService.vencidas/sinResponsable, TaskController rutas /tasks/overdue y /tasks/unassigned, ProjectService.summary y DTO ProjectSummaryResponse) y los tests (unit y slice) están presentes. No fue necesario modificar tests existentes de main ni código. Ejecutado mvn -q test — la suite completa pasó sin errores. ¿Deseas que haga commits con los cambios de esta rama o muestre el diff de los archivos añadidos?

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>

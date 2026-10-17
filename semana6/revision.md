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

# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `446598b0-373d-4dc8-a7b4-c7414018b2da`  
> - **Started:** 17/10/2026, 1:15:35 p.m.  
> - **Duration:** 30s  
> - **Exported:** 17/10/2026, 1:16:06 p.m.  

---

<sub>2s</sub>

### User

Revisa semana6/proyecto-final.diff contra la especificación specs/assignee.md.

---

<sub>6s</sub>

### Copilot

Abriré en paralelo el diff solicitado y la especificación para revisarlos juntos; así se comparan cambios con la spec sin pasos intermedios. Ejecutando dos lecturas de archivo en paralelo.

---

<sub>6s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff.**

C:\Users\Lenovo\taskflow-copilot-carmencc\semana6\proyecto-final.diff

<details>
<summary>236 lines</summary>

```diff
diff --git a/src/main/java/com/taskflow/controller/TaskController.java b/src/main/java/com/taskflow/controller/TaskController.java
index d7353a9..08be501 100644
--- a/src/main/java/com/taskflow/controller/TaskController.java
+++ b/src/main/java/com/taskflow/controller/TaskController.java
@@ -151,4 +151,19 @@ public class TaskController {
         Task actualizada = taskService.cambiarStatus(id, request.status());
         return TaskMapper.aResponse(actualizada);
     }
+
+    /**
+     * PATCH /tasks/{id}/assignee — reasigna solo el responsable. 200 con TaskResponse; 404 si no existe;
+     * 422 si la tarea está DONE; 400 por Bean Validation si falta/invalid assigneeId.
+     */
+    @Operation(summary = "Reasigna el responsable de una tarea",
+            description = "Cambia solo el assigneeId de la tarea. 404 si la tarea no existe; 422 si está DONE.")
+    @PatchMapping("/tasks/{id}/assignee")
+    public TaskResponse patchAssignee(@PathVariable("id") Long id,
+                                      @Valid @RequestBody com.taskflow.dto.TaskAssigneeUpdateRequest request) {
+        Task tarea = taskService.buscarPorId(id)
+                .orElseThrow(() -> new TaskNotFoundException(id));
+        Task actualizada = taskService.reasignar(tarea, request.assigneeId());
+        return TaskMapper.aResponse(actualizada);
+    }
 }
diff --git a/src/main/java/com/taskflow/dto/TaskAssigneeUpdateRequest.java b/src/main/java/com/taskflow/dto/TaskAssigneeUpdateRequest.java
new file mode 100644
index 0000000..cd51c7b
--- /dev/null
+++ b/src/main/java/com/taskflow/dto/TaskAssigneeUpdateRequest.java
@@ -0,0 +1,13 @@
+package com.taskflow.dto;
+
+import jakarta.validation.constraints.NotNull;
+import jakarta.validation.constraints.Positive;
+
+/**
+ * TaskAssigneeUpdateRequest — DTO de entrada para PATCH /tasks/{id}/assignee.
+ * Contiene solo el identificador del nuevo responsable; no permite null ni valores no positivos.
+ */
+public record TaskAssigneeUpdateRequest(
+        @NotNull @Positive Long assigneeId
+) {
+}
diff --git a/src/main/java/com/taskflow/service/TaskService.java b/src/main/java/com/taskflow/service/TaskService.java
index b49a2d2..a557487 100644
--- a/src/main/java/com/taskflow/service/TaskService.java
+++ b/src/main/java/com/taskflow/service/TaskService.java
@@ -94,6 +94,19 @@ public class TaskService {
         return cambiarStatus(id, TaskStatus.DONE);
     }
 
+    /**
+     * Reasigna solo el responsable de la tarea. Recibe la tarea ya encontrada por el controller.
+     * Si la tarea está DONE lanza TaskStateException con el mensaje esperado; en otro caso setea el
+     * assigneeId y guarda la tarea.
+     */
+    public Task reasignar(Task tarea, Long assigneeId) {
+        if (tarea.getStatus() == TaskStatus.DONE) {
+            throw new TaskStateException("No se puede reasignar una tarea terminada.");
+        }
+        tarea.setAssigneeId(assigneeId);
+        return repository.save(tarea);
+    }
+
     /**
      * Lista todas las tareas ordenadas con la estrategia POR_URGENCIA (reuso LITERAL de la Strategy de
      * TaskOrders): vencidas primero, luego prioridad HIGH->LOW, luego fecha ascendente (nulls al final).
diff --git a/src/test/java/com/taskflow/slice/ReasignarTareaControllerTest.java b/src/test/java/com/taskflow/slice/ReasignarTareaControllerTest.java
new file mode 100644
index 0000000..c7f3b09
--- /dev/null
+++ b/src/test/java/com/taskflow/slice/ReasignarTareaControllerTest.java
@@ -0,0 +1,102 @@
+package com.taskflow.slice;
+
+import com.taskflow.controller.TaskController;
+import com.taskflow.dto.TaskResponse;
+import com.taskflow.model.Priority;
+import com.taskflow.model.Task;
+import com.taskflow.model.TaskStatus;
+import com.taskflow.security.JwtAuthenticationFilter;
+import com.taskflow.service.ProjectService;
+import com.taskflow.service.TaskService;
+import org.junit.jupiter.api.Test;
+import org.springframework.beans.factory.annotation.Autowired;
+import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
+import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
+import org.springframework.http.MediaType;
+import org.springframework.test.context.bean.override.mockito.MockitoBean;
+import org.springframework.test.web.servlet.MockMvc;
+
+import java.time.LocalDate;
+import java.util.Optional;
+
+import static org.mockito.ArgumentMatchers.any;
+import static org.mockito.ArgumentMatchers.eq;
+import static org.mockito.Mockito.never;
+import static org.mockito.Mockito.when;
+import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
+import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
+import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
+
+@WebMvcTest(TaskController.class)
+@AutoConfigureMockMvc(addFilters = false)
+class ReasignarTareaControllerTest {
+
+    @Autowired
+    private MockMvc mockMvc;
+
+    @MockitoBean
+    private TaskService taskService;
+
+    @MockitoBean
+    private ProjectService projectService;
+
+    @MockitoBean
+    private JwtAuthenticationFilter jwtAuthenticationFilter;
+
+    private Task tarea(Long id, TaskStatus status, Long assigneeId) throws Exception {
+        return new Task(id, "Tarea " + id, "d", status, Priority.MED, 1L, assigneeId, LocalDate.now().plusDays(1));
+    }
+
+    @Test
+    void patchAssignee_existente_devuelve200YAssigneeId() throws Exception {
+        Task t = tarea(4L, TaskStatus.TODO, null);
+        Task updated = tarea(4L, TaskStatus.TODO, 2L);
+
+        when(taskService.buscarPorId(4L)).thenReturn(Optional.of(t));
+        when(taskService.reasignar(any(Task.class), eq(2L))).thenReturn(updated);
+
+        mockMvc.perform(patch("/tasks/4/assignee")
+                        .contentType(MediaType.APPLICATION_JSON)
+                        .content("{\"assigneeId\":2}"))
+                .andExpect(status().isOk())
+                .andExpect(jsonPath("$.assigneeId").value(2));
+    }
+
+    @Test
+    void patchAssignee_tareaDone_devuelve422() throws Exception {
+        Task t = tarea(2L, TaskStatus.DONE, 1L);
+
+        when(taskService.buscarPorId(2L)).thenReturn(Optional.of(t));
+        when(taskService.reasignar(any(Task.class), any())).thenThrow(new com.taskflow.exception.TaskStateException("No se puede reasignar una tarea terminada."));
+
+        mockMvc.perform(patch("/tasks/2/assignee")
+                        .contentType(MediaType.APPLICATION_JSON)
+                        .content("{\"assigneeId\":3}"))
+                .andExpect(status().isUnprocessableEntity())
+                .andExpect(jsonPath("$.status").value(422));
+    }
+
+    @Test
+    void patchAssignee_proyectoInexistente_devuelve404() throws Exception {
+        when(taskService.buscarPorId(99L)).thenReturn(Optional.empty());
+
+        mockMvc.perform(patch("/tasks/99/assignee")
+                        .contentType(MediaType.APPLICATION_JSON)
+                        .content("{\"assigneeId\":2}"))
+                .andExpect(status().isNotFound())
+                .andExpect(jsonPath("$.status").value(404));
+    }
+
+    @Test
+    void patchAssignee_cuerpoVacio_devuelve400_y_noLlamaReasignar() throws Exception {
+        Task t = tarea(6L, TaskStatus.TODO, null);
+        when(taskService.buscarPorId(6L)).thenReturn(Optional.of(t));
+
+        mockMvc.perform(patch("/tasks/6/assignee")
+                        .contentType(MediaType.APPLICATION_JSON)
+                        .content("{}"))
+                .andExpect(status().isBadRequest());
+
+        org.mockito.Mockito.verify(taskService, never()).reasignar(any(Task.class), any());
+    }
+}
diff --git a/src/test/java/com/taskflow/unit/ReasignarTareaServiceTest.java b/src/test/java/com/taskflow/unit/ReasignarTareaServiceTest.java
new file mode 100644
index 0000000..a745f29
--- /dev/null
+++ b/src/test/java/com/taskflow/unit/ReasignarTareaServiceTest.java
@@ -0,0 +1,56 @@
+package com.taskflow.unit;
+
+import com.taskflow.exception.TaskStateException;
+import com.taskflow.exception.TaskValidationException;
+import com.taskflow.model.Priority;
+import com.taskflow.model.Task;
+import com.taskflow.model.TaskStatus;
+import com.taskflow.repository.TaskRepository;
+import com.taskflow.service.TaskService;
+import org.junit.jupiter.api.Test;
+import org.junit.jupiter.api.extension.ExtendWith;
+import org.mockito.ArgumentCaptor;
+import org.mockito.InjectMocks;
+import org.mockito.Mock;
+import org.mockito.junit.jupiter.MockitoExtension;
+
+import static org.junit.jupiter.api.Assertions.assertEquals;
+import static org.junit.jupiter.api.Assertions.assertThrows;
+import static org.mockito.ArgumentMatchers.any;
+import static org.mockito.Mockito.never;
+import static org.mockito.Mockito.verify;
+import static org.mockito.Mockito.when;
+
+@ExtendWith(MockitoExtension.class)
+class ReasignarTareaServiceTest {
+
+    @Mock
+    private TaskRepository repository;
+
+    @InjectMocks
+    private TaskService service;
+
+    private Task tarea(Long id, TaskStatus status, Long assigneeId) throws TaskValidationException {
+        return new Task(id, "Tarea " + id, "d", status, Priority.MED, 1L, assigneeId, null);
+    }
+
+    @Test
+    void reasignar_tareaTODO_sinResponsable_guardaConAssignee() throws TaskValidationException {
+        Task t = tarea(1L, TaskStatus.TODO, null);
+        when(repository.save(any(Task.class))).thenAnswer(i -> i.getArgument(0));
+
+        service.reasignar(t, 2L);
+
+        ArgumentCaptor<Task> captor = ArgumentCaptor.forClass(Task.class);
+        verify(repository).save(captor.capture());
+        assertEquals(2L, captor.getValue().getAssigneeId());
+    }
+
+    @Test
+    void reasignar_tareaDONE_lanzaTaskStateException_y_no_save() throws TaskValidationException {
+        Task t = tarea(2L, TaskStatus.DONE, 1L);
+
+        assertThrows(TaskStateException.class, () -> service.reasignar(t, 3L));
+        verify(repository, never()).save(any());
+    }
+}
```

</details>


---

<sub>6s</sub>

### `view`

**view the file at C:\Users\Lenovo\taskflow-copilot-carmencc\specs\assignee.md.**

C:\Users\Lenovo\taskflow-copilot-carmencc\specs\assignee.md

<details>
<summary>73 lines</summary>

````
# Especificación — `PATCH /tasks/{id}/assignee`

## Qué

Un endpoint que cambia **solo** el responsable de una tarea. Hoy la única forma es `PUT /tasks/{id}`,
que obliga a mandar la tarea completa (título, prioridad, fecha…) para tocar un campo. Es el mismo
razonamiento de `PATCH /tasks/{id}/status`: un DTO chico por operación.

```
PATCH /tasks/4/assignee
Authorization: ******
Content-Type: application/json

{ "assigneeId": 2 }
```

## Reglas

1. La tarea no existe → **`404`** con el `ErrorResponse` uniforme (`TaskNotFoundException`), resuelto
   **como en la ruta vecina** `GET /tasks/{id}`:
   `taskService.buscarPorId(id).orElseThrow(() -> new TaskNotFoundException(id))`.
2. La tarea está `DONE` → **`422`** con el `ErrorResponse` uniforme y el mensaje
   `No se puede reasignar una tarea terminada.`. Se lanza `TaskStateException`, la misma que usa
   `cambiarStatus` para su 422. Una tarea terminada conserva a quien la terminó.
3. El cuerpo no trae `assigneeId`, lo trae en `null` o trae un número menor que 1 → **`400`** por
   Bean Validation (`@NotNull` y `@Positive` en el DTO, `@Valid` en el controller). El
   `GlobalExceptionHandler` ya responde ese 400 con el detalle por campo en `errors`.
4. En cualquier otro caso: se asigna el responsable con `Task.setAssigneeId`, se guarda con el
   repositorio y responde **`200`** con el `TaskResponse` actualizado (vía `TaskMapper.aResponse`).
5. Seguridad: igual que el resto de `/tasks` (sin token → `401`). No cambies `SecurityConfig`.

**Fuera de alcance** (no lo implementes aunque parezca buena idea):

- Comprobar que el usuario `assigneeId` existe. Exigiría inyectar `UserRepository` en `TaskService`,
  y los tests existentes de `TaskService` no lo conocen.
- Quitar el responsable (`assigneeId: null`). Hoy es un 400 a propósito.

## Dónde

- DTO de entrada nuevo en `com.taskflow.dto`:
  `public record TaskAssigneeUpdateRequest(@NotNull @Positive Long assigneeId)`, con su Javadoc, en la
  misma forma que `TaskStatusUpdateRequest`.
- **Sin mapper nuevo**: la respuesta es el `TaskResponse` de siempre.
- Método nuevo en `TaskService`: `public Task reasignar(Task tarea, Long assigneeId)`. Recibe la
  tarea **ya encontrada** (el 404 lo resuelve el controller) y lanza `TaskStateException` si está
  `DONE`.
- Endpoint nuevo en `TaskController`: `@PatchMapping("/tasks/{id}/assignee")`, con
  `@PathVariable("id") Long id` y `@Valid @RequestBody TaskAssigneeUpdateRequest request`.

## Tests que deben existir al terminar

Los dos en **clases nuevas** (las que ya existen no se tocan):

- **Unit** `src/test/java/com/taskflow/unit/ReasignarTareaServiceTest.java`, con
  `@Mock TaskRepository` e `@InjectMocks TaskService`:
  - tarea `TODO` sin responsable → se llama a `save` con la tarea ya con el `assigneeId` pedido
    (compruébalo con `ArgumentCaptor`, no con lo que devuelve el mock de `save`);
  - tarea `DONE` → `TaskStateException` y `save` **nunca** se llama.
- **Slice** `src/test/java/com/taskflow/slice/ReasignarTareaControllerTest.java`, con
  `@WebMvcTest(TaskController.class)`, `@AutoConfigureMockMvc(addFilters = false)` y `@MockitoBean`
  de `TaskService`, `ProjectService` y `JwtAuthenticationFilter`:
  - `200` y `$.assigneeId` = el pedido;
  - `422` cuando `reasignar` lanza `TaskStateException`;
  - `404` cuando `buscarPorId` devuelve `Optional.empty()`;
  - `400` con el cuerpo `{}`, y `reasignar` **nunca** se llama (`verify(taskService, never())`).

## Resultado esperado con la semilla

Con la app recién arrancada con el perfil `h2` y el token de `ana`, **en este orden** (el paso 3
depende del 1):

| # | Petición | Resultado |
|---|---|---|
| 1 | `PATCH /tasks/4/assignee` con `{"assigneeId": 2}` | `200`, `assigneeId` = 2 (la tarea 4 no tenía responsable) |
| 2 | `GET /tasks/4` | `assigneeId` = 2: se guardó, no solo se respondió |
| 3 | `PATCH /tasks/4/status` con `{"status": "DONE"}` | `200`. Antes del paso 1 respondía `422` («sin responsable»): la regla de `Task.setStatus` ahora deja pasar |
| 4 | `PATCH /tasks/2/assignee` con `{"assigneeId": 3}` | `422` con `message` = `No se puede reasignar una tarea terminada.` (la 2 es `DONE`) |
| 5 | `PATCH /tasks/99/assignee` con `{"assigneeId": 2}` | `404` |
| 6 | `PATCH /tasks/6/assignee` con `{}` | `400`, y en `errors` aparece `assigneeId` |
| 7 | `PATCH /tasks/6/assignee` con `{"assigneeId": 0}` | `400` |
| 8 | el paso 1 sin token | `401` |

## Restricciones para el agente

- No modifiques, borres ni desactives ningún test existente.
- No toques archivos fuera de `TaskAssigneeUpdateRequest.java` (nuevo), `TaskService.java`,
  `TaskController.java` y las dos clases de test nuevas.
- Al terminar, `mvn -q test` tiene que pasar completo.

El pull request del proyecto final lleva además `semana6/`, `.github/skills/verificar-taskflow/casos-assignee.ps1`
y una línea nueva en `verificar.ps1`. Esos archivos los agregas tú en el proceso (PF-2 a PF-7 de la guía),
no el agente: no cuentan contra esta restricción.
````

</details>


---

<sub>30s</sub>

### Copilot

Resumen breve: leída la diff y la spec; el cambio implementa exactamente lo pedido. Solo hallazgos menores de estilo en tests/Controller. Tabla de revisión:

| # | Gravedad | Archivo:línea | Punto de la checklist | Qué pasa | Qué harías |
|---|---|---|---|---|---|
| 1 | Sugerencia | src/main/java/com/taskflow/controller/TaskController.java | Convenciones | El parámetro usa nombre de clase totalmente cualificado en el controller (@RequestBody com.taskflow.dto.TaskAssigneeUpdateRequest) | Importar el DTO y usar la simple clase en la firma para consistencia con el proyecto |
| 2 | Sugerencia | src/test/java/com/taskflow/slice/ReasignarTareaControllerTest.java | Tests que prueban algo / Nombres claros | El test que verifica 404 se llama patchAssignee_proyectoInexistente_devuelve404 pero prueba tarea inexistente | Renombrar método a patchAssignee_tareaInexistente_devuelve404 para evitar confusión en la suite |

Casos sin test:
- ninguno (la spec pedía 2 unit + 4 slice y están presentes y cubren los casos).

Veredicto: APROBADO.

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>

package com.taskflow.slice;

import com.taskflow.controller.TaskController;
import com.taskflow.dto.TaskResponse;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.security.JwtAuthenticationFilter;
import com.taskflow.service.ProjectService;
import com.taskflow.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaskController.class)
@AutoConfigureMockMvc(addFilters = false)
class ReasignarTareaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TaskService taskService;

    @MockitoBean
    private ProjectService projectService;

    @MockitoBean
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    private Task tarea(Long id, TaskStatus status, Long assigneeId) throws Exception {
        return new Task(id, "Tarea " + id, "d", status, Priority.MED, 1L, assigneeId, LocalDate.now().plusDays(1));
    }

    @Test
    void patchAssignee_existente_devuelve200YAssigneeId() throws Exception {
        Task t = tarea(4L, TaskStatus.TODO, null);
        Task updated = tarea(4L, TaskStatus.TODO, 2L);

        when(taskService.buscarPorId(4L)).thenReturn(Optional.of(t));
        when(taskService.reasignar(any(Task.class), eq(2L))).thenReturn(updated);

        mockMvc.perform(patch("/tasks/4/assignee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"assigneeId\":2}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.assigneeId").value(2));
    }

    @Test
    void patchAssignee_tareaDone_devuelve422() throws Exception {
        Task t = tarea(2L, TaskStatus.DONE, 1L);

        when(taskService.buscarPorId(2L)).thenReturn(Optional.of(t));
        when(taskService.reasignar(any(Task.class), any())).thenThrow(new com.taskflow.exception.TaskStateException("No se puede reasignar una tarea terminada."));

        mockMvc.perform(patch("/tasks/2/assignee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"assigneeId\":3}"))
                .andExpect(status().isUnprocessableEntity())
                .andExpect(jsonPath("$.status").value(422));
    }

    @Test
    void patchAssignee_tareaInexistente_devuelve404() throws Exception {
        when(taskService.buscarPorId(99L)).thenReturn(Optional.empty());

        mockMvc.perform(patch("/tasks/99/assignee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"assigneeId\":2}"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404));
    }

    @Test
    void patchAssignee_cuerpoVacio_devuelve400_y_noLlamaReasignar() throws Exception {
        Task t = tarea(6L, TaskStatus.TODO, null);
        when(taskService.buscarPorId(6L)).thenReturn(Optional.of(t));

        mockMvc.perform(patch("/tasks/6/assignee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}"))
                .andExpect(status().isBadRequest());

        org.mockito.Mockito.verify(taskService, never()).reasignar(any(Task.class), any());
    }
}

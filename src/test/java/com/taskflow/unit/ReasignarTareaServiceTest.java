package com.taskflow.unit;

import com.taskflow.exception.TaskStateException;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.TaskRepository;
import com.taskflow.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReasignarTareaServiceTest {

    @Mock
    private TaskRepository repository;

    @InjectMocks
    private TaskService service;

    private Task tarea(Long id, TaskStatus status, Long assigneeId) throws TaskValidationException {
        return new Task(id, "Tarea " + id, "d", status, Priority.MED, 1L, assigneeId, null);
    }

    @Test
    void reasignar_tareaTODO_sinResponsable_guardaConAssignee() throws TaskValidationException {
        Task t = tarea(1L, TaskStatus.TODO, null);
        when(repository.save(any(Task.class))).thenAnswer(i -> i.getArgument(0));

        service.reasignar(t, 2L);

        ArgumentCaptor<Task> captor = ArgumentCaptor.forClass(Task.class);
        verify(repository).save(captor.capture());
        assertEquals(2L, captor.getValue().getAssigneeId());
    }

    @Test
    void reasignar_tareaDONE_lanzaTaskStateException_y_no_save() throws TaskValidationException {
        Task t = tarea(2L, TaskStatus.DONE, 1L);

        assertThrows(TaskStateException.class, () -> service.reasignar(t, 3L));
        verify(repository, never()).save(any());
    }
}

package com.taskflow.unit;

import com.taskflow.dto.ProjectSummaryResponse;
import com.taskflow.exception.TaskValidationException;
import com.taskflow.model.Priority;
import com.taskflow.model.Project;
import com.taskflow.model.Task;
import com.taskflow.model.TaskStatus;
import com.taskflow.repository.ProjectRepository;
import com.taskflow.repository.TaskRepository;
import com.taskflow.repository.UserRepository;
import com.taskflow.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProjectSummaryServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @Mock
    private TaskRepository taskRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private ProjectService service;

    private final Project proyecto = new Project(2L, "App Móvil", "d", 1L, null);

    @Test
    void summary_cuentaYvencida_devuelveConteosCorrectos() throws TaskValidationException {
        when(taskRepository.findByProjectId(2L)).thenReturn(List.of(
                new Task(5L, "T01", "d", TaskStatus.TODO, Priority.MED, 2L, 1L, null),
                new Task(6L, "T02", "d", TaskStatus.IN_PROGRESS, Priority.MED, 2L, 2L, LocalDate.now().plusDays(1)),
                new Task(7L, "T03", "d", TaskStatus.IN_PROGRESS, Priority.MED, 2L, 2L, LocalDate.now().minusDays(2)),
                new Task(8L, "T04", "d", TaskStatus.DONE, Priority.MED, 2L, 2L, LocalDate.now().minusDays(5))
        ));

        ProjectSummaryResponse expected = new ProjectSummaryResponse(                2L,                "App Móvil",                4,                Map.of("TODO", 1L, "IN_PROGRESS", 2L, "DONE", 1L),                1
        );

        assertEquals(expected, service.summary(proyecto));
    }

    @Test
    void summary_proyectoSinTareas_devuelveCeros() {        when(taskRepository.findByProjectId(3L)).thenReturn(List.of());
        // ensure no unfinished stubbing elsewhere in the test context        Project p = new Project(3L, "Vacío", "d", 1L, null);        ProjectSummaryResponse expected = new ProjectSummaryResponse(3L, "Vacío", 0, Map.of("TODO",0L,"IN_PROGRESS",0L,"DONE",0L), 0);
        assertEquals(expected, service.summary(p));    }}

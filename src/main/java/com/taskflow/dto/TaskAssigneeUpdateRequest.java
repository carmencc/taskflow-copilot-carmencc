package com.taskflow.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/**
 * TaskAssigneeUpdateRequest — DTO de entrada para PATCH /tasks/{id}/assignee.
 * Contiene solo el identificador del nuevo responsable; no permite null ni valores no positivos.
 */
public record TaskAssigneeUpdateRequest(
        @NotNull @Positive Long assigneeId
) {
}

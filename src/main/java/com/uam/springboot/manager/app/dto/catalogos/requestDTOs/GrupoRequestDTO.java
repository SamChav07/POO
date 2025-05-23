package com.uam.springboot.manager.app.dto.catalogos.requestDTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GrupoRequestDTO(
        @NotBlank String nombre,
        @NotNull @Min(1)Integer numeroEstudiantes,
        @NotNull Long ProfesorID,
        @NotNull @Min(1) Integer numeroGrupo
        ) {
}

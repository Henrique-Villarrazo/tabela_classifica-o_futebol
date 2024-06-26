package com.villarrazo.broadcast.model;

import jakarta.validation.constraints.NotBlank;

public record TabelaDTO(

        @NotBlank
        String team,
        @NotBlank
        int points,
        @NotBlank
        int goals,
        @NotBlank
        int win) {}

package br.com.api.farmacia.apirest.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroFabricante(
        @NotBlank
        String nome) {
}

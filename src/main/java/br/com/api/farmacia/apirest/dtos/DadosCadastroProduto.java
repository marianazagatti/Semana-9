package br.com.api.farmacia.apirest.dtos;

import br.com.api.farmacia.apirest.entities.Fabricante;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroProduto(
        @NotBlank
        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        Double preco,
        @NotBlank
        Fabricante fabricante
        ) {
}

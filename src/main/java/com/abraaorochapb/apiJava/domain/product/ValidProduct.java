package com.abraaorochapb.apiJava.domain.product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ValidProduct(@NotBlank @Size(min = 10) String nome,
                           @NotBlank @Size(min = 30)String descricao,
                           @NotNull Integer preco) {

}

package com.abraaorochapb.apiJava.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "produto")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Integer preco;

    public Product(ValidProduct validProduct) {
        this.nome = validProduct.nome();
        this.descricao = validProduct.descricao();
        this.preco =  validProduct.preco();
    }
}
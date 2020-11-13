package com.gerencial.app.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_BARRAS")
    private String codigoBarras;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;
}
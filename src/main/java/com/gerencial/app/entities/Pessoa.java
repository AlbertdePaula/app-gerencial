package com.gerencial.app.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "PESSOA")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME") //Define o nome da coluna;
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private Integer telefone;

   /* public String getNome(){
        return this.nome;
    }
    public void setNome(final String nome){
        this.nome = nome;
    }
    */
}
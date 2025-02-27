package com.aula.projeto.suporte.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Pessoa {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "nome")
    private String nome ;

    @Column(name = "telefone")
    private String telefone ;

    @Column(name = "email")
    private String email ;

    @Column(name = "endereço")
    private String endereço ;

    @Column(name = "cpf")
    private String cpf ;


}

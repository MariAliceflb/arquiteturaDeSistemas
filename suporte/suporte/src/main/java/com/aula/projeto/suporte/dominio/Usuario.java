package com.aula.projeto.suporte.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Pessoa {

    @OneToMany(mappedBy = "usuario_id")
    private List<chamados> chamados = new ArrayList<>();

}
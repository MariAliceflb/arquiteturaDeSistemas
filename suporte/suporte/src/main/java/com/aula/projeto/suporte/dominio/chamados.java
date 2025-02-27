package com.aula.projeto.suporte.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@Entity
public class chamados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAbertura = LocalDate.now();

    private String prioridade;
    private String status;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}

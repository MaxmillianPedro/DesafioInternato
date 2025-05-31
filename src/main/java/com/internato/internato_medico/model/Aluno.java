package com.internato.internato_medico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Aluno extends Usuario {
    @Column(nullable = false, length = 10)
    private String periodo; // P9, P10, P11, P12

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
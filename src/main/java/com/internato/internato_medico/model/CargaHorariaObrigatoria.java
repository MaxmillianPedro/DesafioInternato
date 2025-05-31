package com.internato.internato_medico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "carga_horaria_obrigatoria")
public class CargaHorariaObrigatoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @Column(nullable = false, length = 10)
    private String periodo;

    @Column(name = "horas_minimas", nullable = false)
    private Integer horasMinimas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getHorasMinimas() {
        return horasMinimas;
    }

    public void setHorasMinimas(Integer horasMinimas) {
        this.horasMinimas = horasMinimas;
    }
}
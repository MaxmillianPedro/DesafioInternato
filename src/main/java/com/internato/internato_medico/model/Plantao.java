package com.internato.internato_medico.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "plantao")
public class Plantao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hora_fim", nullable = false)
    private LocalTime horaFim;

    @ManyToOne
    @JoinColumn(name = "local_parceiro_id", nullable = false)
    private LocalParceiro localParceiro;

    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @Column(name = "vagas_max", nullable = false)
    private Integer vagasMax;

    @ManyToOne
    @JoinColumn(name = "preceptor_id")
    private Usuario preceptor;

    @ManyToOne
    @JoinColumn(name = "semestre_id", nullable = false)
    private SemestreLetivo semestre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public LocalParceiro getLocalParceiro() {
        return localParceiro;
    }

    public void setLocalParceiro(LocalParceiro localParceiro) {
        this.localParceiro = localParceiro;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getVagasMax() {
        return vagasMax;
    }

    public void setVagasMax(Integer vagasMax) {
        this.vagasMax = vagasMax;
    }

    public Usuario getPreceptor() {
        return preceptor;
    }

    public void setPreceptor(Usuario preceptor) {
        this.preceptor = preceptor;
    }

    public SemestreLetivo getSemestre() {
        return semestre;
    }

    public void setSemestre(SemestreLetivo semestre) {
        this.semestre = semestre;
    }
}
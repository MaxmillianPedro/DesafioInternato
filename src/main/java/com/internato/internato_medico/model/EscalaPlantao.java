package com.internato.internato_medico.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "escala_plantao")
public class EscalaPlantao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plantao_id", nullable = false)
    private Plantao plantao;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(name = "presenca_confirmada")
    private Boolean presencaConfirmada = false;

    @Column(name = "check_in")
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    @Column(name = "horas_creditadas")
    private Integer horasCreditadas = 0;

    private Boolean advertencia = false;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Plantao getPlantao() {
        return plantao;
    }

    public void setPlantao(Plantao plantao) {
        this.plantao = plantao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Boolean getPresencaConfirmada() {
        return presencaConfirmada;
    }

    public void setPresencaConfirmada(Boolean presencaConfirmada) {
        this.presencaConfirmada = presencaConfirmada;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getHorasCreditadas() {
        return horasCreditadas;
    }

    public void setHorasCreditadas(Integer horasCreditadas) {
        this.horasCreditadas = horasCreditadas;
    }

    public Boolean getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(Boolean advertencia) {
        this.advertencia = advertencia;
    }
}
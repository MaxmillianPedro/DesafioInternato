package com.internato.internato_medico.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reposicao")
public class Reposicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "escala_original_id", nullable = false)
    private EscalaPlantao escalaOriginal;

    @ManyToOne
    @JoinColumn(name = "escala_reposicao_id", nullable = false)
    private EscalaPlantao escalaReposicao;

    private String justificativa;

    private String status = "PENDENTE"; // PENDENTE, APROVADA, RECUSADA

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EscalaPlantao getEscalaOriginal() {
        return escalaOriginal;
    }

    public void setEscalaOriginal(EscalaPlantao escalaOriginal) {
        this.escalaOriginal = escalaOriginal;
    }

    public EscalaPlantao getEscalaReposicao() {
        return escalaReposicao;
    }

    public void setEscalaReposicao(EscalaPlantao escalaReposicao) {
        this.escalaReposicao = escalaReposicao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
package com.internato.internato_medico.repository;

import com.internato.internato_medico.model.Plantao;
import com.internato.internato_medico.model.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PlantaoRepository extends JpaRepository<Plantao, Long> {
    List<Plantao> findBySemestre(SemestreLetivo semestre);
    List<Plantao> findByDataBetween(LocalDate inicio, LocalDate fim);
    List<Plantao> findByEspecialidadeIdAndDataBetween(Long especialidadeId, LocalDate inicio, LocalDate fim);
}
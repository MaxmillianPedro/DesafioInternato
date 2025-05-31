package com.internato.internato_medico.repository;

import com.internato.internato_medico.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
    boolean existsByNome(String nome);
}
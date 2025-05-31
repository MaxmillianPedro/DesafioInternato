package com.internato.internato_medico.repository;


import com.internato.internato_medico.model.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreLetivoRepository extends JpaRepository<SemestreLetivo, Long> {
    boolean existsByRotulo(String rotulo);
}
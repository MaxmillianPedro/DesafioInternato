package com.internato.internato_medico.repository;

import com.internato.internato_medico.model.LocalParceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalParceiroRepository extends JpaRepository<LocalParceiro, Long> {
    boolean existsByNome(String nome);
}
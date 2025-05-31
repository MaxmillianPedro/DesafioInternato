package com.internato.internato_medico.service;


import com.internato.internato_medico.Exception.ResourceNotFoundException;
import com.internato.internato_medico.dto.SemestreLetivoDTO;
import com.internato.internato_medico.model.SemestreLetivo;
import com.internato.internato_medico.repository.SemestreLetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SemestreLetivoService {

    private final SemestreLetivoRepository repository;

    @Autowired
    public SemestreLetivoService(SemestreLetivoRepository repository) {
        this.repository = repository;
    }

    public List<SemestreLetivoDTO> findAll() {
        return repository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public SemestreLetivoDTO findById(Long id) {
        SemestreLetivo semestre = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Semestre não encontrado com id: " + id));
        return convertToDTO(semestre);
    }

    public SemestreLetivoDTO create(SemestreLetivoDTO dto) {
        if (repository.existsByRotulo(dto.getRotulo())) {
            throw new IllegalArgumentException("Já existe um semestre com este rótulo");
        }

        SemestreLetivo semestre = new SemestreLetivo();
        semestre.setRotulo(dto.getRotulo());
        semestre.setDataInicio(dto.getDataInicio());
        semestre.setDataFim(dto.getDataFim());

        return convertToDTO(repository.save(semestre));
    }

    public SemestreLetivoDTO update(Long id, SemestreLetivoDTO dto) {
        SemestreLetivo semestre = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Semestre não encontrado com id: " + id));

        if (!semestre.getRotulo().equals(dto.getRotulo()) && repository.existsByRotulo(dto.getRotulo())) {
            throw new IllegalArgumentException("Já existe um semestre com este rótulo");
        }

        semestre.setRotulo(dto.getRotulo());
        semestre.setDataInicio(dto.getDataInicio());
        semestre.setDataFim(dto.getDataFim());

        return convertToDTO(repository.save(semestre));
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Semestre não encontrado com id: " + id);
        }
        repository.deleteById(id);
    }

    private SemestreLetivoDTO convertToDTO(SemestreLetivo semestre) {
        SemestreLetivoDTO dto = new SemestreLetivoDTO();
        dto.setId(semestre.getId());
        dto.setRotulo(semestre.getRotulo());
        dto.setDataInicio(semestre.getDataInicio());
        dto.setDataFim(semestre.getDataFim());
        return dto;
    }
}
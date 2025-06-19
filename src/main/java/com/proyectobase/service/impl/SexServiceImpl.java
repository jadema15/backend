package com.proyectobase.service.impl;

import com.proyectobase.entity.SexEntity;
import com.proyectobase.repository.SexRepository;
import com.proyectobase.service.SexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SexServiceImpl implements SexService {

    private final SexRepository sexRepository;

    @Autowired
    public SexServiceImpl(SexRepository sexRepository) {
        this.sexRepository = sexRepository;
    }

    @Override
    @Transactional
    public SexEntity save(SexEntity sex) {
        return sexRepository.save(sex);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SexEntity> findAll() {
        return sexRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<SexEntity> findById(Long id) {
        return sexRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        sexRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsById(Long id) {
        return sexRepository.existsById(id);
    }
} 
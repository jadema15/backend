package com.proyectobase.service;

import com.proyectobase.entity.SexEntity;
import java.util.List;
import java.util.Optional;

public interface SexService {
    // Crear o actualizar un sexo
    SexEntity save(SexEntity sex);
    
    // Obtener todos los sexos
    List<SexEntity> findAll();
    
    // Buscar sexo por ID
    Optional<SexEntity> findById(Long id);
    
    // Eliminar sexo por ID
    void deleteById(Long id);
    
    // Verificar si existe un sexo por ID
    boolean existsById(Long id);
} 
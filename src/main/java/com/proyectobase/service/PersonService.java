package com.proyectobase.service;

import com.proyectobase.entity.PersonEntity;
import java.util.List;
import java.util.Optional;

public interface PersonService {
    // Crear o actualizar una persona
    PersonEntity save(PersonEntity person);
    
    // Obtener todas las personas
    List<PersonEntity> findAll();
    
    // Buscar persona por ID
    Optional<PersonEntity> findById(Long id);
    
    // Eliminar persona por ID
    void deleteById(Long id);
    
    // Verificar si existe una persona por ID
    boolean existsById(Long id);
} 
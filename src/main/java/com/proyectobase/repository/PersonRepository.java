package com.proyectobase.repository;

import com.proyectobase.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    // Aquí puedes agregar métodos personalizados de consulta si los necesitas
    // Por ejemplo:
    // List<PersonEntity> findByName(String name);
    // Optional<PersonEntity> findByEmailAddress(String email);
} 
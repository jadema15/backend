package com.proyectobase.repository;

import com.proyectobase.entity.SexEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexRepository extends JpaRepository<SexEntity, Long> {
    // Aquí puedes agregar métodos personalizados de consulta si los necesitas
    // Por ejemplo:
    // Optional<SexEntity> findByNombreSex(String nombreSex);
} 
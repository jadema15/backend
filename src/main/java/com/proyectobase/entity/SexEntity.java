package com.proyectobase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sex")
public class SexEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "El nombre del sexo es obligatorio")
    private String nombreSex;
    
    @OneToMany(mappedBy = "sex")
    private List<PersonEntity> persons;
    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombreSex() {
        return nombreSex;
    }
    
    public void setNombreSex(String nombreSex) {
        this.nombreSex = nombreSex;
    }
    
    public List<PersonEntity> getPersons() {
        return persons;
    }
    
    public void setPersons(List<PersonEntity> persons) {
        this.persons = persons;
    }
} 
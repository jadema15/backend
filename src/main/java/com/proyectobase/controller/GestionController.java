package com.proyectobase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectobase.entity.PersonEntity;
import com.proyectobase.service.PersonService;



@RestController
public class GestionController {

    @Autowired
    private PersonService personService;

    @GetMapping("/live")
    public boolean live() {
        return true;
    }

    @GetMapping("/ready")
    public boolean ready() {
        return personService.findAll().size() > 0;
    }

    @GetMapping("/person")
    public List<PersonEntity> findAll() {
        return personService.findAll();
    }

    @GetMapping("/texto")
    public String texto() {
        return "respuesta en texto string";
    }
} 
package com.proyectobase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
/** Controlador para la gestion de la aplicacion */
public class GestionController {
    @GetMapping("/live")
    public boolean live() {
        return true;
    }

    @GetMapping("/ready/{id}")
    public String ready(@PathVariable String id){
        if(id!=null){
            return "Se retorna el id: " + id;
        }
        return "No se ha proporcionado un id";
    }
}
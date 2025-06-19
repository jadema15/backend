package com.proyectobase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/** Controlador para la gestion de la aplicacion */
public class GestionController {
    @GetMapping("/live")
    public boolean live() {
        return true;
    }
} 
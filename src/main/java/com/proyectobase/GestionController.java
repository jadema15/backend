package com.proyectobase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionController {
    @GetMapping("/live")
    public boolean live() {
        return true;
    }
} 
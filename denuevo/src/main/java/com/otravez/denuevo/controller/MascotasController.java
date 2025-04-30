package com.otravez.denuevo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {
    
    @GetMapping
    public String algo() {
        return "ahora si";
    }
    
}

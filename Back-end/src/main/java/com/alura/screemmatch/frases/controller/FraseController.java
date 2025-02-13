package com.alura.screemmatch.frases.controller;

import com.alura.screemmatch.frases.DTO.FraseDTO;
import com.alura.screemmatch.frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    public FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFrase(){
        return service.obterFraseAleatoria();
    }
}

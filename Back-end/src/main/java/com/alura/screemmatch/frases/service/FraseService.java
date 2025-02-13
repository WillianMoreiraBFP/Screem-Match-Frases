package com.alura.screemmatch.frases.service;

import com.alura.screemmatch.frases.DTO.FraseDTO;
import com.alura.screemmatch.frases.model.Frase;
import com.alura.screemmatch.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        return converteDados(repository.getFrase());
    }

    private FraseDTO converteDados(Frase frase){
        return new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}

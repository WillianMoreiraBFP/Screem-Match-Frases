package com.alura.screemmatch.frases.repository;

import com.alura.screemmatch.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long>{
    //@Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    @Query(value = "SELECT * FROM frases ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Frase getFrase();
}

package com.exemplo.site.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class FraseController {

    private static final List<String> FRASES = List.of(
        "Acredite em si mesmo e tudo será possível.",
        "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
        "Não espere por oportunidades, crie você mesmo as suas.",
        "A persistência é o caminho para a realização dos sonhos.",
        "Cada dia é uma nova chance para recomeçar.",
        "A única pessoa que pode te limitar é você mesmo.",
        "Grandes realizações começam com um pequeno passo.",
        "O fracasso é apenas uma oportunidade para recomeçar com mais inteligência."
    );

    private final Random random = new Random();

    @GetMapping("/api/frase")
    public String getFrase() {
        return FRASES.get(random.nextInt(FRASES.size()));
    }
}

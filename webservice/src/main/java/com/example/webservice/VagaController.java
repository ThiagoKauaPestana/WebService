package com.example.webservice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private List<Vaga> vagas = new ArrayList<>();

    public VagaController(){
        vagas.add(new Vaga(1, "Engenheiro de Software Jr", "Desenvolvimento de aplicações web", 5000.00));
        vagas.add(new Vaga(2, "Estágio em Edificações", "Acompanhamento de obras", 1500.00));
    }
    
    @GetMapping
    public List<Vaga> listarTodas() {
        return vagas;
    }


}
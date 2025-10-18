package com.example.webservice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private List<Empresa> empresas = new ArrayList<>();

    public EmpresaController() {
        empresas.add(new Empresa(1, "Google", "Tecnologia"));
        empresas.add(new Empresa(2, "Afonso França", "Construção Civil"));
    }
    
   
    @GetMapping
    public List<Empresa> listarTodas() {
        return empresas;
    }
    

}
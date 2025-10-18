package com.example.webservice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private List<Estudante> estudantes = new ArrayList<>();

    public EstudanteController() {
      
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return estudantes;
    }

    @GetMapping("/{id}")
    public Estudante buscarPorId(@PathVariable int id) {
        return estudantes.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @PostMapping
    public Estudante criar(@RequestBody Estudante novoEstudante) {
        novoEstudante.setId(estudantes.size() + 1);
        estudantes.add(novoEstudante);
        return novoEstudante;
    }

    @PutMapping("/{id}")
    public Estudante atualizar(@PathVariable int id, @RequestBody Estudante estudanteAtualizado) {
        Estudante estudante = buscarPorId(id);
        if (estudante != null) {
            estudante.setNome(estudanteAtualizado.getNome());
            estudante.setEmail(estudanteAtualizado.getEmail());
        }
        return estudante;
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        estudantes.removeIf(e -> e.getId() == id);
    }
}
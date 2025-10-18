package com.example.webservice; 

public class Empresa {
    private int id;
    private String nome;
    private String ramo;

    // Construtor
    public Empresa(int id, String nome, String ramo) {
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
    }
    
    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRamo() { return ramo; }
    public void setRamo(String ramo) { this.ramo = ramo; }
}
package com.example.webservice; 

public class Vaga {
    private int id;
    private String titulo;
    private String descricao;
    private double salario;

    // Construtor
    public Vaga(int id, String titulo, String descricao, double salario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.salario = salario;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
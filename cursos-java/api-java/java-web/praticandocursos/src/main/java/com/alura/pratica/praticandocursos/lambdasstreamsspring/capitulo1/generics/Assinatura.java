package com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo1.generics;

public class Assinatura {
    private final String nomePlano;
    private final double mensalidade;
    private final int duracaoMeses;

    public Assinatura(String nomePlano, double mensalidade, int duracaoMeses) {
        this.nomePlano = nomePlano;
        this.mensalidade = mensalidade;
        this.duracaoMeses = duracaoMeses;
    }

    public String getNomePlano() { return nomePlano; }
    public double getMensalidade() { return mensalidade; }
    public int getDuracaoMeses() { return duracaoMeses; }

    @Override
    public String toString() {
        return "Assinatura{" +
                "nomePlano='" + nomePlano + '\'' +
                ", mensalidade=" + mensalidade +
                ", duracaoMeses=" + duracaoMeses +
                '}';
    }
}

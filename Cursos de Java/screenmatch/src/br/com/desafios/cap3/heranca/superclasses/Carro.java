package br.com.desafios.cap3.heranca.superclasses;

public class Carro {
    protected String modelo;
    private double valorAno2023;
    private double valorAno2024;
    private double valorAno2025;

    public double calculaPrecoMedio(double valorAno2023, double valorAno2024, double valorAno2025) {
        return (valorAno2023 + valorAno2024 + valorAno2025) / (double)3.0F;
    }

    public double getValorAno2025() {
        return this.valorAno2025;
    }

    public double getValorAno2024() {
        return this.valorAno2024;
    }

    public double getValorAno2023() {
        return this.valorAno2023;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorAno2023(double valorAno2023) {
        this.valorAno2023 = valorAno2023;
    }

    public void setValorAno2024(double valorAno2024) {
        this.valorAno2024 = valorAno2024;
    }

    public void setValorAno2025(double valorAno2025) {
        this.valorAno2025 = valorAno2025;
    }
}

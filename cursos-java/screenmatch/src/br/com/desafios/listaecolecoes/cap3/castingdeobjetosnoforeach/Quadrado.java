package br.com.desafios.listaecolecoes.cap3.castingdeobjetosnoforeach;

public class Quadrado implements Forma {
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

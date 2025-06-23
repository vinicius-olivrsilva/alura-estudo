package br.com.desafios.poo.cap4.interfaces.classessuper;

import br.com.desafios.poo.cap4.interfaces.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public int calcularArea(int altura, int largura) {
        return altura * largura;
    }

    @Override
    public int calculaPerimetro(int altura, int largura) {
        return (altura + largura) * 2;
    }
}

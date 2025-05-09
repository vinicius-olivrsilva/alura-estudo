package br.com.desafios.cap4.interfaces.classessuper;

import br.com.desafios.cap4.interfaces.interfaces.Calculavel;

public class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = preco * 0.40;
        return preco - desconto;
    }
}

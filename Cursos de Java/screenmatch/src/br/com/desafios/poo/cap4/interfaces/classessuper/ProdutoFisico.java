package br.com.desafios.poo.cap4.interfaces.classessuper;

import br.com.desafios.poo.cap4.interfaces.interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        double taxa = preco * 0.15;
        return preco + taxa;
    }
}

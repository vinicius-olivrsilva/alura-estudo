package com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulodois;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MainCapDois {
    public void principal() {
        BinaryOperator<Integer> multiplicacao =
                (a ,b) ->  a * b;

        Integer c = multiplicacao.apply(5, 5);
        System.out.println(c);

        UnaryOperator<Integer> primo = p -> {
            if (p % 2 == 0) {

            }
            return p;
        };
    }
}

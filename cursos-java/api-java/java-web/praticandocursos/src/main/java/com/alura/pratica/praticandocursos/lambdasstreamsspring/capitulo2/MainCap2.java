package com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo2;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainCap2 {
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

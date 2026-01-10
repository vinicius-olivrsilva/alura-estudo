package br.com.desafios.listaecolecoes.cap4.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio1 {
    List<Integer> listaInteira = new ArrayList<>(List.of(27,24,9,7,23,16));

    public void organizaImprime() {
        Collections.sort(listaInteira);
        for (Integer i : listaInteira) {
            System.out.println(i);
        }
    }
}

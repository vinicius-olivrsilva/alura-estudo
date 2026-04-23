package com.alura.pratica.praticandocursos.springcomjpa.capituloum.nomecompleto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3 - Implemente um metodo que recebe uma String representando um nome completo separado por espaços.
 * O metodo deve retornar o primeiro e o último nome após remover os espaços desnecessários.
 */

public class MainTres {
    public static void principal3() {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
        System.out.println(obterPrimeiroEUltimoNome("       Vinícius        Oliveira da    Silva   ")); // Saída: "Maria"

    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        List<String> nomes = Arrays.stream(nomeCompleto.trim().split("\\s+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        if (nomes.isEmpty()) return "";
        if (nomes.size() == 1) return nomes.getFirst();

        return nomes.getFirst() + " " + nomes.getLast();    // versão 21 do Java
//        return nomes.get(0) + " " + nomes.get(nomes.size() - 1);    // versão 17 ou menos
    }
}

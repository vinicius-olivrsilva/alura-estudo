package com.alura.pratica.praticandocursos.springcomjpa.capituloum.filtrarinteiros;

import java.util.*;

/**
 * 1 - Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não.
 * Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor.
 */

public class MainUm {
    public static void principal() {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> inteiros = input.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .toList();

        inteiros.forEach(System.out::println);
    }

    public static void principalOpcional() {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> inteiros = input.stream()
                .map(s -> {
                    try {
                        return Optional.of(Integer.parseInt(s));
                    } catch (NumberFormatException e) {
                        return Optional.<Integer>empty();
                    }
                })
                .flatMap(Optional::stream)
                .toList();

        inteiros.forEach(System.out::println);
    }

    // Forma mais elegante
    public static Optional<Integer> tentarConverter(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    // Uso
//    List<Integer> resultado = input.stream()
//            .map(Main::tentarConverter)
//            .flatMap(Optional::stream)
//            .toList();
//
}

package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloquatro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCapQuatro {
    public void principal() {
        // 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        int maior = numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
//                .orElse(0); // - O orElse(0) pode mascarar erro: se a lista estiver vazia, retorna 0, o que pode não ser desejado.
        System.out.println(maior);

        // 2 - Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> collect = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        // 3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula. // Resultado Esperado: "Alice, Bob, Charlie"
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String collect2 = nomes.stream()
                .collect(Collectors.joining(", "));
        // String collect2 = String.join(", ", nomes);
        System.out.println(collect2);

        // 4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.
        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int somaDosQuadrados = numerosInteiros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(somaDosQuadrados);

        // 5 - Dada a lista de números inteiros, separe os números pares dos ímpares.
        Map<Boolean, List<Integer>> collect3 = numerosInteiros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + collect3.get(true));
        System.out.println("Impares: " + collect3.get(false));

        // Continuação dos exercícios no pacote continuacao
    }
}

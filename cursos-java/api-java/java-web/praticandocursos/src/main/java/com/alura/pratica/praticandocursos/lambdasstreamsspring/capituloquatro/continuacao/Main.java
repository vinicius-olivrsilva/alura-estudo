package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloquatro.continuacao;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Nos próximos exercícios, iremos usar o mesmo código base, dado a seguir:
 * Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String),
 * preço (double) e categoria (String).
 */
public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis"),
                new Produto("Placa de Vídeo", 2300.0, "Eletrônicos")
        );

        //Filtre todos os produtos da categoria "Eletrônicos" com preço menor que R$ 1000,
        // ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.
        List<Produto> menorQueMil = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos")
                        && p.getPreco() < 1000)
                .toList();
        System.out.println(menorQueMil);

        // 6 - Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>>.
        Map<String, List<Produto>> agrupaCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        for (Map.Entry<String, List<Produto>> entry : agrupaCategoria.entrySet()) {
            System.out.println(entry);
        }

        // 7 - Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.
        Map<String, Long> quantidadePorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.counting()
                ));
        System.out.println(quantidadePorCategoria);

        // 8 - Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o resultado em um Map<String, Optional<Produto>>.
        Map<String, Optional<Produto>> maisCaro = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println(maisCaro);

        // 9 - Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e armazene o resultado em um Map<String, Double>.
        Map<String, Double> somaPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.summingDouble(Produto::getPreco)));
        System.out.println(somaPorCategoria);
    }
}

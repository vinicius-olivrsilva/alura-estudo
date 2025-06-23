package br.com.desafios.listaecolecoes.cap2.contrutores;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 1.00, 1);
        Produto produto2 = new Produto("Monitor", 780.00, 2);
        Produto produto3 = new Produto("RTX 4060", 2400.00, 1);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho da Lista: " + produtos.size());
        System.out.println("Produto da ultima posição: " + produtos.get(2));

        System.out.println(produtos);
        System.out.println("------------------");

        ProdutoPerecivel produtoPerecivel =
                new ProdutoPerecivel("Melancia", 5, 1, "25/06/2025");
        System.out.println((produtoPerecivel));

        produtos.add(produtoPerecivel);
        System.out.println("--- Lista Completa ---");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

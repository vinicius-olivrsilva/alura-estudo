package br.com.desafios.cap1listasecolecoes;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("1. ---");
        Pessoa pessoa1 = new Pessoa("Vinícius", 30);
        Pessoa pessoa2 = new Pessoa("Elísio", 27);
        Pessoa pessoa3 = new Pessoa("Bruna", 27);
        System.out.println(pessoa1);

        System.out.println("2. ---");
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        System.out.println("3. ---");
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("4. ---");
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("5. ---");
        System.out.println(listaDePessoas.get(0));

        System.out.println("6. ---");
        System.out.println(listaDePessoas);
    }

}

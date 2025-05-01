package br.com.alura.aulas;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = scr.nextLine();

        System.out.println(filme);

        scr.close();
    }
}

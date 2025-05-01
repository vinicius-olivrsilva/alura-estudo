package br.com.alura.aulas;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme segundo sua opiniao");
            nota = scr.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(mediaAvaliacao / 3);

        scr.close();
    }
}

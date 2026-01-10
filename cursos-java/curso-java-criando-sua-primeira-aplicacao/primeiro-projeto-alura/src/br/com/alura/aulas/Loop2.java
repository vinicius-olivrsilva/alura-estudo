package br.com.alura.aulas;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a nota do filme segundo sua opiniao ou -1 para encerrar");
            nota = scr.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas > 0) {
            System.out.println("Média das avaliações: " + (mediaAvaliacao / totalDeNotas));
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}

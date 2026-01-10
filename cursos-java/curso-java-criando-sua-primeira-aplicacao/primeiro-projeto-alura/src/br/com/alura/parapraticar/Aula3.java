package br.com.alura.parapraticar;

/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa
deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop. */

import java.util.Random;
import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroTentativas;
    int chute = -1;
    int valorMinimo = 0;
    int valorMaximo = 100;

    System.out.println("#### JOGO DE ADIVINHAÇÃO ####");
    int numeroGerado = new Random().nextInt(100);
        System.out.println(numeroGerado);
        for (numeroTentativas = 1; numeroTentativas <= 5; numeroTentativas++) {
            imprimeDeAte(valorMinimo, valorMaximo);
            chute = scanner.nextInt();
            if (chute == numeroGerado){
                System.out.println("Acertou!! O número secreto é " + numeroGerado + ", acertou com " + numeroTentativas + " tentativas.");
                break;
            } else {
                if (chute > numeroGerado) {
                    System.out.println("Número secreto é menor que " + chute);
                    valorMaximo = chute; // Limita o intervalo superior
                } else {
                    System.out.println("Número secreto é maior que " + chute);
                    valorMinimo = chute; // Limita o intervalo inferior
                }
                tentativasRestantes(numeroTentativas);
            }
        }
        if (chute != numeroGerado) {
            System.out.println("Infelizmente você perdeu, o número secreto era " + numeroGerado);
        }
    }
    public static void tentativasRestantes(int numeroTentativas){
        int tentativasRestantes = 5 - numeroTentativas;
        if (tentativasRestantes > 0) {
            String qtdTentativas = tentativasRestantes > 1 ? " tentativas" : " tentativa";
            System.out.println("Você ainda tem " + tentativasRestantes + qtdTentativas);
        }
    }

    public static void imprimeDeAte(int valorMinimo, int valorMaximo){
            System.out.println("Digite um número de " + valorMinimo + " até " + valorMaximo);
    }
}
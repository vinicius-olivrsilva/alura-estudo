package br.com.alura.parapraticar;

import java.util.Scanner;

public class Aula03A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" =========== Desafio 1");
        System.out.print("Digite um número: ");
        int numeroPositOuNegat = scanner.nextInt();

        String mensagem = (numeroPositOuNegat >= 0) ? "Número Positivo" : "Número Negativo";
        System.out.println(mensagem);

        System.out.println(" =========== Desafio 2");
        System.out.println("Digite 2 números inteiros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        if (numero1 == numero2) {
            System.out.println("Números iguais");
        } else {
            System.out.printf("%d é maior", Math.max(numero1, numero2));
        }

        System.out.println(" =========== Desafio 3");
        System.out.println("1. Calcular área do quadrado & 2. Calcular área do círculo");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("área do quadrado");
                break;
            case 2:
                System.out.println("área do círculo");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println(" =========== Desafio 4");
        System.out.println("Digite um número");
        int numeroTabuada = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            int tabMult = i * numeroTabuada;
            System.out.printf("%d x %d = %d%n", i, numeroTabuada, tabMult);
        }

        System.out.println(" =========== Desafio 5");
        System.out.println("Digite um numero vamos ver se é par ou impar");
        int numeroParImpar = scanner.nextInt();
        if (numeroParImpar % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        System.out.println(" =========== Desafio 6");
        System.out.println("Digite um numero para calcular o fatorial");
        int numeroFatorial = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numeroFatorial + " é: " + fatorial);
    }
}
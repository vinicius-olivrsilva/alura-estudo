package br.com.alura.aulas;

public class Condicional {
    public static void main(String[] args) {
        String nome = "O Senhor dos Anéis";
        int anoDeLancamento;
        boolean incluindoNoPlano = false;
        double notaDoFilme = 8.9;
        String tipoPlano = "plus";

        anoDeLancamento = 2001;

        // IF ELSE
        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que todos curtem");
        } else {
            System.out.println("Filme retrô que vale a pena");
        }

        if (incluindoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Dever pagar o aluguel");
        }

        // Switch case
        int expressao = 1;
        switch (expressao) {
            case 1:
                // código a ser executado se a expressão for igual a valor1
                break;
            case 2:
                // código a ser executado se a expressão for igual a valor2
                break;
            case 3:
                // código a ser executado se a expressão for igual a valor3
                break;
   // ...
            default:
                // código a ser executado se a expressão não for igual a nenhum valor
                break;
        }
    }
}
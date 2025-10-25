package br.com.desafios.excecoes;

public class Desafio1 {
    public static void main(String[] args) {
        double numero1 = 10;
        double numero2 = 0;

        try {
            double resultado  = divideDoisNumeros(numero1, numero2);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Deu ruim: ");
            System.out.println(e.getMessage());
        }
    }

    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Impossível divisão por zero");
        }
    }
}

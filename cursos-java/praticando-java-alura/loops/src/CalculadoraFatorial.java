import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
        System.out.println("O fatorial de 5 é: " + fatorial);
    }
}

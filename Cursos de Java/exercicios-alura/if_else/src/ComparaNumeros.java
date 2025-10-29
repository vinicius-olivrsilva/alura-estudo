import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Digite o 1º número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else if (num1 == num2) {
            System.out.println("ambos são iguais");
        } else {
            System.out.println("O maior número é " + num2);
        }
    }
}

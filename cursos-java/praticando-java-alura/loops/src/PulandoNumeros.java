import java.util.Scanner;

public class PulandoNumeros {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Digite um número: ");
        int valorMax = sc.nextInt();

        for (int i = 1; i <= valorMax; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

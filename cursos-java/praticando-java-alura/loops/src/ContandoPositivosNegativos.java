import java.util.Scanner;

public class ContandoPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        String stNumero;
        int numPositivos = 0;
        int numNegativos = 0;

        while (true) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            stNumero = sc.nextLine();

            if (stNumero.equals("fim")) {
                break;
            }

            try {
                int numero = Integer.parseInt(stNumero);
                if (numero < 0) {
                    numNegativos++;
                } else {
                    numPositivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número (ou 'fim' para encerrar): ");
            }
        }

        System.out.printf("""
                    Números positivos: %d
                    Números negativos: %d
                    """, numPositivos, numNegativos);
    }
}

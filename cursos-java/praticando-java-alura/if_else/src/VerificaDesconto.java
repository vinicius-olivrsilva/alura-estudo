import java.util.Scanner;

public class VerificaDesconto {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            double desconto = valor * 0.10;
            double valorComDesconto = valor - desconto;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$ " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado. \nValor total: R$ " + valor);
        }
    }
}

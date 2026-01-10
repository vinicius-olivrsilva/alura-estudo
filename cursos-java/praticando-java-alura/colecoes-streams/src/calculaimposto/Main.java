package calculaimposto;

import java.util.List;

/**
 * Calculando o total com imposto
 */
public class Main {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double total = Calculador.calcularSoma(precosProdutos);
        System.out.println("Valor total antes do imposto: R$ " + total);

        Double totalComImposto = Calculador.calcularImposto(total);
        System.out.printf("Valor total com imposto de 8%%: %.2f\n", totalComImposto);

        // Lembrar de ESTUDAR e USAR o BigDecimal
    }
}

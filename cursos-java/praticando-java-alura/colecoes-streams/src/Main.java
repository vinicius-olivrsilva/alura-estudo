import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Guia da professora Jaqueline
        // Operações intermediárias
        // Operações terminais

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");

        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .toList();
        System.out.println(funcionariosLetraA);

        // Comissão
        List<Double> valoresVendas = List.of(500.0, 1800.0, 6200.0);

        List<Double> comissao = valoresVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        System.out.println(valoresVendas);
        System.out.println(comissao);

        double totalVendas = valoresVendas.stream()
                .reduce(0.0, Double::sum);
        System.out.println("Total vendas: " + totalVendas);
    }
}
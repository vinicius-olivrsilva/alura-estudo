package calculaimposto;

import java.util.List;

public class Calculador {
    public static Double calcularSoma(List<Double> precosProdutos) {
        return precosProdutos.stream()
                .reduce(0.0, Double::sum);
    }

    public static Double calcularImposto(Double valor) {
        return valor + (valor * 0.08);
    }
}

package calculaquadrado;

import java.util.List;

/**
 * Calculando o quadrado dos números
 */
public class CalculaQuadrado {
    public static List<Integer> calcularQuadrados(List<Integer> numerosList) {
        return numerosList.stream()
                .map(n -> n * n)
                .toList();
    }
}
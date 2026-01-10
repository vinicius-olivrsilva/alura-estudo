package calculaquadrado;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> numQuadrados = CalculaQuadrado.calcularQuadrados(numeros);

        System.out.println("Quadrados dos números: " + numQuadrados);
    }
}

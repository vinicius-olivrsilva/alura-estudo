package selecionando;

import java.util.List;

/**
 * Selecionando funcionários com nomes curtos
 */
public class FuncionariosLista {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> list = funcionarios.stream()
                .filter(c -> c.length() <= 5)
                .toList();

        System.out.println(list);
    }
}

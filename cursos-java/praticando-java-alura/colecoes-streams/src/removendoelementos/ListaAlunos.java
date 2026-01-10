package removendoelementos;

import java.util.ArrayList;
import java.util.List;

/**
 * Removendo elementos
 */
public class ListaAlunos {
    public static void main(String[] args) {
        List<String> listaAlunos = new ArrayList<>(List.of("Joana", "Lucas", "Pedro", "Antônio"));

        System.out.println("Lista inicial: " + listaAlunos);

        listaAlunos.remove("Pedro");

        System.out.println("Lista após a exclusão: " + listaAlunos);
    }
}

package adicionaelementos;

import java.util.ArrayList;
import java.util.List;

/**
 * Adicionando elementos a uma lista
 */
public class ListaFuncionarios {
    private List<String> nomes = new ArrayList<>();

    public void adicionarFuncionario(String nome) {
        nomes.add(nome);
        System.out.println(nome + " adicionado com sucesso!");
    }

    public void imprimirLista() {
        System.out.println(nomes);
    }
}

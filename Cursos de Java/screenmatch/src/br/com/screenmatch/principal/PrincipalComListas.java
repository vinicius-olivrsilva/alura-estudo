package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        var senhorDosAneis = new Filme("O Senhor dos Anéis: As Duas Torres", 2002);
        senhorDosAneis.avalia(8.7);
        Filme duna = new Filme("Duna",2023);
        duna.avalia(8.6);
        Filme matrix = new Filme("Matrix", 1970);
        matrix.avalia(8.3);
        Serie witcher = new Serie("The Witcher", 2019);
        witcher.avalia(7.9);

        ArrayList<Titulo> minhaLista = new ArrayList<>();
        minhaLista.add(senhorDosAneis);
        minhaLista.add(duna);
        minhaLista.add(matrix);
        minhaLista.add(witcher);

        for (Titulo titulo : minhaLista) {
            System.out.println(titulo.getNome());
            // muito usado em código legado ainda
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + (filme.getClassificacao()));
            }
        }

        System.out.println("-------- Método forEach --------");
        minhaLista.forEach(titulo ->
                System.out.println(titulo.getNome() + " (" + titulo.getAnoDeLancamento() + ")"));

        System.out.println("-------- Method Reference --------");
        minhaLista.forEach(System.out::println);

    }
}

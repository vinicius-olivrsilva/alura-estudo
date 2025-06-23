package br.com.screenmatch;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix", 1970);
        matrix.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + matrix.getDuracaoEmMinutos());
        System.out.println("------------------------------------");

        matrix.exibeFichaTecnica();
        matrix.avalia(8);
        matrix.avalia(5);
        matrix.avalia(10);
        System.out.println("Total de avaliações: " + matrix.getTotalDeAvaliacoes());
        System.out.println(matrix.pegaMedia());
        //matrix.somaDasAvaliacoes = 10;
        //matrix.totalDeAvaliacoes = 1;
        //System.out.println(matrix.pegaMedia());
        System.out.println("------------------------------------");

        Serie witcher = new Serie("The Witcher", 2019);
        witcher.exibeFichaTecnica();
        witcher.setTemporadas(10);
        witcher.setEpisodiosPorTemporada(10);
        witcher.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar " + witcher.getNome() + ": " + witcher.getDuracaoEmMinutos());
        System.out.println("------------------------------------");

        Filme duna = new Filme("Duna",2023);
        duna.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(matrix);
        calculadora.inclui(duna);
        calculadora.inclui(witcher);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(matrix);
        filtro.filtra(duna);

        System.out.println("------------------------------------");

        Episodio episodio = new Episodio();
        episodio.setNome("Prólogo");
        episodio.setNumero(1);
        episodio.setSerie(witcher);
        episodio.setTotalVisualizacoes(325);
        filtro.filtra(episodio);

        System.out.println("------------------------------------");

        var senhorDosAneis = new Filme("O Senhor dos Anéis: As Duas Torres", 2002);
        senhorDosAneis.setDuracaoEmMinutos(223);
        senhorDosAneis.setDiretor("Peter Jackson");
        senhorDosAneis.setIncluidoNoPlano(true);
        senhorDosAneis.avalia(8.7);
        senhorDosAneis.exibeFichaTecnica();

        senhorDosAneis.setNome("O Senhor dos Anéis: O retorno do Rei");
        System.out.println("------------------------------------");

        // Curso Alura - Java: Trabalhando com listas e coleções de dados
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(senhorDosAneis);
        listaDeFilmes.add(duna);
        listaDeFilmes.add(matrix);
        System.out.println("Tamanho da Lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Lista:\n" + listaDeFilmes);
    }
}

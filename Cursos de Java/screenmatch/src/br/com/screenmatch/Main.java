package br.com.screenmatch;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie witcher = new Serie();
        witcher.setNome("The Witcher");
        witcher.setAnoDeLancamento(2000);
        witcher.exibeFichaTecnica();
        witcher.setTemporadas(10);
        witcher.setEpisodiosPorTemporada(10);
        witcher.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar The Witcher: " + witcher.getDuracaoEmMinutos());

        Filme duna = new Filme();
        duna.setNome("Duna");
        duna.setAnoDeLancamento(2023);
        duna.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(duna);
        calculadora.inclui(witcher);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(duna);

        Episodio episodio = new Episodio();
        episodio.setNome("Prólogo");
        episodio.setNumero(1);
        episodio.setSerie(witcher);
        episodio.setTotalVisualizacoes(325);
        filtro.filtra(episodio);
    }
}

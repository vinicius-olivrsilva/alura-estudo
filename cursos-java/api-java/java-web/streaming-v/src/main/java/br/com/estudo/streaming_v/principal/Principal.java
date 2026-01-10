package br.com.estudo.streaming_v.principal;

import br.com.estudo.streaming_v.model.DadosSerie;
import br.com.estudo.streaming_v.model.DadosTemporada;
import br.com.estudo.streaming_v.service.ConsumoAPI;
import br.com.estudo.streaming_v.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);
    private final String API_KEY = System.getenv("OMDB_API_KEY");
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private ConsumoAPI consomeApi = new ConsumoAPI();
    private ConverteDados serializador = new ConverteDados();

    public void exibeMenu() {
        System.out.print("Digite o nome da série para busca: ");
        String busca = scanner.nextLine();
        String endereco = ENDERECO + busca.replace(" ", "+") + "&apikey=" + API_KEY;
        var json = consomeApi.obterDados(endereco);
        DadosSerie dadosSerie = serializador.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            json = consomeApi.obterDados(
                    ENDERECO + busca.replace(" ", "+") + "&season=" + i + "&apikey=" + API_KEY);
            DadosTemporada dadosTemporada = serializador.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}

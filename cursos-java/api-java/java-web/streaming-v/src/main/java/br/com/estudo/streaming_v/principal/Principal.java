package br.com.estudo.streaming_v.principal;

import br.com.estudo.streaming_v.model.DadosEpisodio;
import br.com.estudo.streaming_v.model.DadosSerie;
import br.com.estudo.streaming_v.model.DadosTemporada;
import br.com.estudo.streaming_v.model.Episodio;
import br.com.estudo.streaming_v.service.ConsumoApi;
import br.com.estudo.streaming_v.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    Scanner scanner = new Scanner(System.in);

    private final String API_KEY = System.getenv("OMDB_API_KEY");
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados serializador = new ConverteDados();

    public void exibeMenu() {
        System.out.print("Digite o nome da série para busca: ");
        String busca = scanner.nextLine();
        String endereco = ENDERECO + busca.replace(" ", "+") + "&apikey=" + API_KEY;
        String json = consumoApi.obterDados(endereco);

        // Obtendo dados da Série
        DadosSerie dadosSerie = serializador.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        // Obtendo dados de uma Temporada completa da Série
        System.out.println("A série " + dadosSerie.titulo() + " tem " + dadosSerie.totalTemporadas() + " temporadas");
        List<DadosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            json = consumoApi.obterDados(
                    ENDERECO + busca.replace(" ", "+") + "&season=" + i + "&apikey=" + API_KEY);
            DadosTemporada dadosTemporada = serializador.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
//
//        for (int i = 0; i < dadosSerie.totalTemporadas(); i++) {
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size() ; j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
//
//        System.out.println("----------------------------");
//        temporadas.forEach(t -> t.episodios()
//                .forEach(e -> System.out.println(e.titulo())));

        System.out.println("------------ Exibe o titulo de todos os episodios ----------------");
        temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .map(DadosEpisodio::titulo)
                .forEach(System.out::println);

        // Cria e armazena uma lista com todos os episodios
        List<DadosEpisodio> dadosEpisodioList = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        // Usa a lista anterior para filtrar e exibir os 5 melhores episodios (Comparado por avaliação)
        System.out.println("------------- TOP 5 EPISÓDIOS ---------------");
        dadosEpisodioList.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .peek(e -> System.out.println("Primeiro filtro(N/A) " + e))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .peek(e -> System.out.println("Ordenação " + e))
                .limit(5)
                .peek(e -> System.out.println("Limite " + e))
                .map(e -> e.titulo().toUpperCase())
                .peek(e -> System.out.println("Mapeamento " + e))
                .forEach(System.out::println);

        // Exite todas as temporadas e seus episódios
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);

//        System.out.println("A partir de que ano você deseja ver os episódios: ");
//        var ano = scanner.nextInt();
//        scanner.nextLine();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println("Temporada: " + e.getTemporada() +
//                        " - Episódio: " + e.getTitulo() +
//                        ", Data lançamento: " + e.getDataLancamento().format(formataData)));

        // Encontra episódio por alguma palavra (trecho)
//        System.out.println("Digite o título do episódio ou parte dele para ser encontrado: ");
//        String trechoTitulo = scanner.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//        if (episodioBuscado.isPresent()){
//            System.out.println("Episodio encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        } else {
//            System.out.println("Episodio não encontrado");
//        }

        // cria um Map, onde a chave é a temporada e o valor é a média das avaliações dos episódios
        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada, Collectors.averagingDouble(Episodio::getAvaliacao)));
        System.out.println(avaliacoesPorTemporada);

        DoubleSummaryStatistics estatisticas = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
        System.out.println("Média: " + estatisticas.getAverage());
        System.out.println("Pior episódio: " + estatisticas.getMin());
        System.out.println("Melhor episódio: " + estatisticas.getMax());
        System.out.println("Quantidade: " + estatisticas.getCount());
    }
}

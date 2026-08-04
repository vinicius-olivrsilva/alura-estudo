package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.*;
import br.com.alura.screenmatch.repository.SerieRepository;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    private List<DadosSerie> dadosSerie = new ArrayList<>();

    private SerieRepository repositorio;

    private List<Serie> series = new ArrayList<>();

    public Principal(SerieRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {

            var menu = """
                    1 - Buscar séries
                    2 - Buscar episódios
                    3 - Listar séries buscadas
                    4 - Busca série pelo tútulo
                    5 - Buscar série por ator
                    6 - Listar Top 5
                    7 - Buscar séries por categoria
                    8 - Filtrar séries
                    9 - Buscar episódio por trecho
                    
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    listarSeriesBuscadas();
                    break;
                case 4:
                    buscarSeriePeloTitulo();
                    break;
                case 5:
                    buscarSeriePorAtor();
                    break;
                case 6:
                    buscarTopCintoSerie();
                    break;
                case 7:
                    buscarSeriesPorCategoria();
                    break;
                case 8:
                    buscarPorMaxTemporadasEAvaliacao();
                    break;
                case 9:
                    buscarEpisodiosPorTrecho();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        Serie serie = new Serie(dados);
//        dadosSerie.add(dados);
        repositorio.save(serie);
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarEpisodioPorSerie() {
        System.out.println("####### Séries cadastradas ########");
        listarSeriesBuscadas();
        System.out.println("Qual série deseja buscar? ");
        var nomeSerie = leitura.nextLine();

        // busca a séria desejada pelo usuário
        Optional<Serie> serie = series.stream()
                .filter(s -> s.getTitulo().toLowerCase().contains(nomeSerie.toLowerCase()))
                .findFirst();

        // verifica se existe
        if (serie.isPresent()) {
            // pega o Optional Serie e facilita usando apenas Serie
            var serieEncontrada = serie.get();

            // Cria uma lista de temporadas, gera a url de cada temporada e retorna o número da temporada com seus episódios,
            // depois serializa em dadosTemporada e depois adiciona dadosTemporada na lista criada
            List<DadosTemporada> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumo.obterDados(ENDERECO + serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
                temporadas.add(dadosTemporada);
            }
            temporadas.forEach(System.out::println);
            // usa stream em temporadas, usando flatmap para acessar os episódios que existe dentro de DadosTemporada,
            // usando stream em episódios e transformando(map) criando cada novo Episodio com
            // o número da temporada e os dados de DadosEpisodio e incluindo cada um na lista episódios que foi criada,
            // setando a lista episodios em serieEncontrada e depois salvando serieEncontrada no banco de dados com o repositorio.save
            List<Episodio> episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream()
                            .map(e -> new Episodio(d.numero(), e)))
                    .collect(Collectors.toList());

            serieEncontrada.setEpisodios(episodios);
            repositorio.save(serieEncontrada);
        } else {
            System.out.println("Série não encontrada!");
        }
    }

    private void listarSeriesBuscadas() {
//        List<Serie> seriesList = dadosSerie.stream()
//                .map(d -> new Serie(d))
//                .collect(Collectors.toList());

        series = repositorio.findAll();

        System.out.println("########### DADOS DAS SÉRIES ##############");
        series.stream()
                .sorted(Comparator.comparing(Serie::getGenero))
                .forEach(System.out::println);
        System.out.println("#######################################");
    }

    private void buscarSeriePeloTitulo() {
        System.out.println("####### Séries cadastradas ########");
        listarSeriesBuscadas();
        System.out.println("Qual série deseja buscar? ");
        var nomeSerie = leitura.nextLine();

        Optional<Serie> serieEncontrada = repositorio.findByTituloContainingIgnoreCase(nomeSerie);

        if (serieEncontrada.isPresent()) {
            System.out.println("Dados da Série: " + serieEncontrada.get());
        } else {
            System.out.println("Série não encontrada!");
        }
    }

    private void buscarSeriePorAtor() {
        System.out.println("Qual ator deseja buscar? ");
        var nomeAtor = leitura.nextLine();
        System.out.println("Avaliação a partir de que valor? ");
        var avaliacao = leitura.nextDouble();
        List<Serie> seriesEncontradas = repositorio.findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(nomeAtor, avaliacao);

        if(seriesEncontradas.isEmpty()) {
            System.out.println("Nenhuma série encontrada");
        } else {
            System.out.println("Séries em que " + nomeAtor + " trabalhou:");
            seriesEncontradas.forEach(s -> System.out.println(s.getTitulo() + " - Avaliação: " + s.getAvaliacao()));
        }
    }

    private void buscarTopCintoSerie() {
        System.out.println("##### TOP 5 #####");
//        listarSeriesBuscadas(); // OBS: Com stream tenho que carregar os dados da lista séries
//        List<Serie> collect = series.stream()
//                .sorted(Comparator.comparingDouble(Serie::getAvaliacao).reversed())
//                .limit(5)
//                .collect(Collectors.toList());
//
//        collect.forEach(s ->
//                System.out.println(s.getTitulo() + " - Nota: " + s.getAvaliacao()));

        List<Serie> topSeries = repositorio.findTop5ByOrderByAvaliacaoDesc();

        topSeries.forEach(s ->
                System.out.println(s.getTitulo() + " - nota: " + s.getAvaliacao()));
    }

    private void buscarSeriesPorCategoria() {
        System.out.println("Qual o genero da série? ");
        var genero = leitura.nextLine();
        Categoria categoria = Categoria.fromPortuguesBr(genero);
        List<Serie> seriesPorCategoria = repositorio.findByGenero(categoria);
        System.out.println("Séries da categoria " + categoria.getCategoriaPortuguesBr());
        seriesPorCategoria.forEach(System.out::println);
    }

    private void buscarPorMaxTemporadasEAvaliacao() {
        System.out.println("Até quantas temporadas a série deve ter? ");
        var limiteTemporadas = leitura.nextInt();
        System.out.println("Qual a avaliação mínima a série deve ter? ");
        var avaliacao = leitura.nextDouble();

        // Usando derived queries
        List<Serie> seriesEncontradas = repositorio.
                seriesPorTemporadaEAvaliacao(limiteTemporadas, avaliacao);

        seriesEncontradas.forEach(s -> System.out.println(s.getTitulo() + " nota: " + s.getAvaliacao()));
    }

    private void buscarEpisodiosPorTrecho() {
        System.out.println("Qual episódio deseja buscar? ");
        var nomeEpisodio = leitura.nextLine();
        List<Episodio> episodiosEncontrados = repositorio.episodioPorTrecho(nomeEpisodio);
        episodiosEncontrados.forEach(e ->
            System.out.printf("Série: %s - S%sE%s - %s\n",
                    e.getSerie().getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo()));
    }
}
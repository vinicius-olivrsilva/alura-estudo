package br.com.screenmatch.principal;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import br.com.screenmatch.exception.ErroSerelizacaoException;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        List<Titulo> titulosList = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Digite um filme para busca: ");
            var pesquisa = input.nextLine();
            String busca = pesquisa.trim().replace(" ", "+");

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + System.getenv("OMDB_API_KEY");
            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body(); // atribui o corpo resposta a uma variavel string
                System.out.println("json da API" + json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); // transforma a resposta json no meu Objeto record
                System.out.println("meuTituloOmdb: " + meuTituloOmdb);                  // imprime meu Objeto serializado
                Titulo meuTitulo = new Titulo(meuTituloOmdb);       // atribui do Objeto serializado para meu Objeto Titulo
                System.out.println("Após conversão");
                System.out.println(meuTitulo);                      // imprime Titulo após a Serialização

                titulosList.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu esse erro aqui: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Aconteceu esse erro de argumento na busca: ");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Coleção: " + titulosList);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulosList));
        escrita.close();

        System.out.println("Fim do programa, Tudo Certo!");
    }
}

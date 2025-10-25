package br.com.desafios.consumindoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsomeGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        final String API_KEY = "API KEY....";
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Título do livro");
        var busca = input.nextLine().trim();
        String search = busca.replaceAll("\\s", "");

        String url = "https://www.googleapis.com/books/v1/volumes?q=" + search + "&key=" + API_KEY;

        System.out.println(search);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println("Meu teste da API");
        System.out.println(response);
    }
}

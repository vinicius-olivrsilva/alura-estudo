package br.com.desafios.gson;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        // conversão de uma string JSON para um objeto Java
        // Chamada tambem de desserialização
        String json = """
            {
                "nome": "Jeangela",
                "idade": 28,
                "Genero": Feminino
            }
            """;

        Gson gson = new Gson();
        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);
        System.out.println("Desserialização - JSON para Objeto");
        System.out.println(pessoa1);

        // Convertendo um Objeto em Json (Serialização)
        Pessoa pessoa2 = new Pessoa("Vinicius", 30, null, "Masculino");
        String json2 = gson.toJson(pessoa2);
        System.out.println("\nSerialização - Objeto para JSON");
        System.out.println(json2);

        // Exercício 2
        String json3 = """
            {
                "nome": "Oliveira"
            }
            """;

        Pessoa pessoa3 = gson.fromJson(json3, Pessoa.class);
        System.out.println("Tarefa 2:");
        System.out.println(pessoa3);

        // Exercício 3
        String json4 = """
                {
                "titulo": "Java para Iniciantes",
                "autor": "João Silva",
                "editora": {
                    "editora": "TechBooks",
                    "cidade": "São Paulo"
                    }
                }
                """;

        Livro livro = gson.fromJson(json4, Livro.class);
        System.out.println(livro);
    }
}

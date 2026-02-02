package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloum;

import com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloum.contador.Tarefa;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.ConverteDados;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.Pessoa;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.SalvaLeArquivo;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MainCapUm {
    public void principal() throws IOException {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(" 1 - contador");
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt();
//        for (int i = 1; i <= numero; i++) {
//            System.out.println(i);
//        }

        System.out.println(" 2 - descrever como usaria o gson");
        // baixar e adicionar na estrutura do projeto ou copiar a dependência e atualizar o pom.xml

        System.out.println(" 3 - Criar classe tabela e praticar com jackson");
        System.out.println(" 4 - instanciar tarefa e salvar em arquivo.json");
        Tarefa tarefa = new Tarefa("Estudar Java", false, "Vinicius");

        File arquivo = new File("data/tarefa.json");
        // Garante que o diretório "data" existe
        arquivo.getParentFile().mkdirs();

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(arquivo, tarefa);
            System.out.println("Arquivo salvo em " + arquivo.getAbsolutePath());
        } catch (IIOException e) {
            System.err.println("Erro ao manipular o arquivo JSON: " + e.getMessage());
        }

        System.out.println(" 5 - ler arquivo e salvar em novo objeto");
        try {
            Tarefa novaTarefa = mapper.readValue(arquivo, Tarefa.class);
            System.out.println("Arquivo lido: " + novaTarefa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" 6 - Criar classe generica");


        // Testando json com interface e classe
        ConverteDados json = new ConverteDados();
        Pessoa eu = new Pessoa("Vinicius", "masculino",30);

        // serializar - Obj -> json
        String jsonEu = json.serializador(eu);
        System.out.println(jsonEu);

        SalvaLeArquivo.salvarNoArquivo("data/vinicius.json", jsonEu);

        // Processo de leitura e desserialização de um arquivo
        String conteudo = Files.readString(Path.of("data/bruna.json"));
        Pessoa bruna = json.desserializador(conteudo, Pessoa.class);

        System.out.println("Nome: " + bruna.getNome());
        System.out.println("Sexo: " + bruna.getSexo());
        System.out.println("Idade: " + bruna.getIdade());

        // O mesmo processo anterior, mas do metodo estático da classe SalvaLeArquivo
        String nomeArquivo = "vinicius2";
        String conteudoArquivo = SalvaLeArquivo.lerArquivo(nomeArquivo);
        Pessoa pessoa = json.desserializador(conteudoArquivo, Pessoa.class);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

package com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SalvaLeArquivo {
    public static void salvarNoArquivo(String caminho, String  conteudo) {
        try {
            File arquivo = new File(caminho);
            arquivo.getParentFile().mkdirs(); // crai a pasta se não existir
            Files.writeString(arquivo.toPath(), conteudo);
            System.out.println("Arquivo gerado com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     public static String lerArquivo(String nomeArquivo) {
         try {
             String caminho = "data/" + nomeArquivo + ".json";
             return Files.readString(Path.of(caminho));
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}

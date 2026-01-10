package br.com.desafios.persistearquivos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DesafioDoiseTres {
    public static void main(String[] args) {
        TituloDesafDois titulo = new TituloDesafDois("João e Maria", 2010);

        Gson gson = new Gson();
        String jsonString = gson.toJson(titulo);
        System.out.println("Após serialização");
        System.out.println(jsonString);

        TituloDesafDois tituloB = new TituloDesafDois("Quarteto Fantastico", 2025);

        Gson gsonB = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String jsonStringB = gsonB.toJson(titulo);
        System.out.println("Após serialização");
        System.out.println(jsonStringB);

        List<TituloDesafDois> lista = new ArrayList<>();
        lista.add(titulo);
        lista.add(tituloB);

        // Bonus
        try {
            FileWriter file = new FileWriter("desafio_arquivos.json");
            file.write(gsonB.toJson(lista));
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

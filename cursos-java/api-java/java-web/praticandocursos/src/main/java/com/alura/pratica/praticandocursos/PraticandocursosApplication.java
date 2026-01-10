package com.alura.pratica.praticandocursos;

import com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo1.MainCap1;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo1.contador.Tarefa;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo2.MainCap2;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.ConverteDados;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.Pessoa;
import com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto.SalvaLeArquivo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.imageio.IIOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

@SpringBootApplication
public class PraticandocursosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PraticandocursosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        MainCap1 main1 = new MainCap1();
//        main1.principal();

        MainCap2 main2 = new MainCap2();
        main2.principal();
    }
}

package com.alura.pratica.praticandocursos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticandocursosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PraticandocursosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Curso Java: Lambda, Streams e Web sem Spring");
//        MainCap1 main1 = new MainCap1();
//        main1.principal();

//        MainCap2 main2 = new MainCap2();
//        main2.principal();

//        MainCapQuatro main4 = new MainCapQuatro();
//        main4.principal();

        System.out.println("Curso Java: Persistência de Dados e Consultas com Spring Data JPA");
//        MainUm.principal();

//        MainDois.principal2();

//        MainTres.principal3();

//        MainCinco.principal();

//        MainSeis.principal();

//        MainSete.principal();
    }
}

package com.alura.pratica.praticandocursos;

import com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloquatro.MainCapQuatro;
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
//        MainCap1 main1 = new MainCap1();
//        main1.principal();

//        MainCap2 main2 = new MainCap2();
//        main2.principal();

        MainCapQuatro main4 = new MainCapQuatro();
        main4.principal();
    }
}

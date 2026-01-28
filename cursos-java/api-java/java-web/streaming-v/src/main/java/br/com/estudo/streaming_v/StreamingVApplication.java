package br.com.estudo.streaming_v;

import br.com.estudo.streaming_v.principal.Principal;
import br.com.estudo.streaming_v.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamingVApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamingVApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal menu = new Principal();
		menu.exibeMenu();
	}
}
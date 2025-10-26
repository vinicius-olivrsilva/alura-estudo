package br.com.estudo.streaming_v;

import br.com.estudo.streaming_v.service.ConsumoAPI;
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
        ConsumoAPI consumoApi = new ConsumoAPI(); // Instancia a minha classe

        String busca = "the-witcher";
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=" + busca + "&apikey=");

        System.out.println(json);
    }
}

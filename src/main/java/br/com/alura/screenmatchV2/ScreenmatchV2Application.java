package br.com.alura.screenmatchV2;

import br.com.alura.screenmatchV2.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchV2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchV2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=dd235501");
		System.out.println(json);
	}
}

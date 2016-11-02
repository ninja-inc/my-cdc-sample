package jp.co.ninja.reservation.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReservationEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationEngineApplication.class, args);
	}
	
	@Bean
	public RestOperations restOperations() {
		return new RestTemplate();
	}
}

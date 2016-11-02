package jp.co.ninja.reservation.step;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReservationStepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationStepApplication.class, args);
	}
	
	@Bean
	public RestOperations restOperations() {
		return new RestTemplate();
	}
}

package jp.co.ninja.reservation.step;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestOperations;

@Controller
@ResponseBody
public class ReservationStepController {
	@Autowired
	private RestOperations restOperations;
	
	@RequestMapping(
			value = "/reservationCompleted",
			method = GET)
	public String reservationCompleted() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		
		// "http://localhost:8090/reservation-engine/reservations/R12345"
		// https://github.com/spring-cloud/spring-cloud-contract/issues/117
		ResponseEntity<String> response = restOperations.postForEntity(
				"http://localhost:8090/reservations/R12345",
				new HttpEntity<>(
						ReservationEngineRq.builder()
							.guestName("ninja-inc")
							.amount(1200L)
							.build(),
						httpHeaders),
				String.class);
		return "Reservation was completed! reservationId:" + response.getBody();
	}
}

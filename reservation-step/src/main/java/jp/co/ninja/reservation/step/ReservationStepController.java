package jp.co.ninja.reservation.step;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value = "/reservationCompleted", method = GET)
	public String reservationCompleted() {
		ResponseEntity<String> response = restOperations.postForEntity(
				"http://localhost:8090/reservation-engine/reservations/R12345",
				ReservationEngineRq.builder()
									.guestName("ninja-inc")
									.amount(12000L)
									.build(),
				String.class);
		return "Reservation was completed! reservationId:" + response.getBody();
	}
}

package jp.co.ninja.reservation.engine;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationEngineController {
	@RequestMapping(
			value = "/reservations/{reservationId}",
			method = POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> reservation(
			@PathVariable("reservationId") String reservationId,
			@RequestBody ReservationEngineRq request) {
		if (! reservationId.startsWith("R")) {
			return new ResponseEntity<>(reservationId, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(reservationId, new HttpHeaders(), HttpStatus.OK);
	}
}

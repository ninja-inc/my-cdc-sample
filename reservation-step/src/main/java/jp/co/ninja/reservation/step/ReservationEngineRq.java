package jp.co.ninja.reservation.step;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ReservationEngineRq {
	private String guestName;
	private long amount;
}

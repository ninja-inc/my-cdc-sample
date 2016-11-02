package jp.co.ninja.reservation.engine;

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

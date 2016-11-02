package jp.co.ninja.reservation.engine;

import org.junit.Before;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

public class ReservationStepBase {

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new ReservationEngineController());
	}

	public void assertThatRejectionReasonIsNull(Object rejectionReason) {
		assert rejectionReason == null;
	}
}

package jp.co.ninja.reservation.step;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"jp.co.ninja:reservation-engine:+:stubs:8090"}, workOffline = true)
public class ReservationStepControllerTest {
	
	@Autowired
	private ReservationStepController testLogic;
	
	@Test
	public void test() {
		String actual = testLogic.reservationCompleted();
		
		assertThat(actual)
				.isEqualTo("");
	}

}

package parking_gt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import application.ParkingGlobalTechApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ParkingGlobalTechApplication.class)
@WebAppConfiguration
public class ParkingGlobalTechApplicationTests {

	@Test
	public void contextLoads() {
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBasicPlan {

	@Test
	public void testGetBasicPay() {
		Plan bscpy = new BasicPlan();
		assertEquals(1000,bscpy.getBasicPay());		
	}

}

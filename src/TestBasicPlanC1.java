import static org.junit.Assert.*;

import org.junit.Test;

public class TestBasicPlanC1 {

	@Test
	public void testGetBasicPayC1() {
		Plan bscpy = new BasicPlan();
		Plan bscpyc1 = new BasicPlanC1(bscpy);
		bscpy = null;
		assertEquals(1100,bscpyc1.getBasicPay());
	}
	
	@Test
	public void testGetBasicPayC1_constractor() {
		Plan bscpy = new BasicPlan();
		Plan bscpyc1 = new BasicPlanC1(bscpy);
		bscpy = null;
		assertEquals(1100,bscpyc1.getBasicPay());
	}


}

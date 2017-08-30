import static org.junit.Assert.*;

import org.junit.Test;

public class TestBasicPlanE1 {

	@Test
	public void testGetBasicPayE1_constractor_case1() {
		Plan bscpy = new BasicPlan();
		Plan bscpye1 = new BasicPlanE1(bscpy);
		bscpy = null;
		assertEquals(1200,bscpye1.getBasicPay());
	}

	@Test
	public void testGetBasicPayE1_constractor_case2() {
		Plan bscpy = new BasicPlan();
		Plan bscpyc1 = new BasicPlanC1(bscpy);
		bscpy = null;
		assertEquals(1100,bscpyc1.getBasicPay());
		Plan bscpye1 = new BasicPlanE1(bscpyc1);
		bscpyc1 = null;
		assertEquals(1300,bscpye1.getBasicPay());
	}

}

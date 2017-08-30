import static org.junit.Assert.*;

import org.junit.Test;

public class TestCallForBasicPlan  {

	@Test
	public void testGetCallPayForMinute() {
		CallPay call = new CallPayForBasic();
		assertEquals(20,call.getCallPayForMinute());
	}

	@Test
	public void testGetTotalPayForOneCall() {
		CallPay call = new CallPayForBasic();
		assertEquals(200,call.getTotalPayForOneCall(10));
	}
	
	@Test
	public void testGetTotalForOneCall() {
		CallPay call = new CallPayForBasic();
		assertEquals(200,call.getTotalPayForOneCall(10));
	}
	
	@Test
	public void testGetBasicTotalPay() {
		CallPay call = new CallPayForBasic();
		assertEquals(200,call.getTotalPayForOneCall(10));
		call.calucBasicTotalPay(10);
		assertEquals(200,call.getBasicTotalPay());
	}
	
	
}

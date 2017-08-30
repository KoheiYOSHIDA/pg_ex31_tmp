import static org.junit.Assert.*;

import org.junit.Test;

public class TestCallForE1Plan {

	@Test
	public void testIsStartTime() {
		CallPay call = new CallPayForE1Plan();
		assertTrue(((CallPayForE1Plan) call).isStartCall(945));
	}
	
	@Test
	public void testGetCallE1PayForMinute() {
		CallPay call = new CallPayForE1Plan();
		assertEquals(15,((CallPayForE1Plan) call).getCallE1PayForMinute(945));
		assertEquals(20,((CallPayForE1Plan) call).getCallE1PayForMinute(759));
		assertEquals(15,((CallPayForE1Plan) call).getCallE1PayForMinute(800));
		assertEquals(15,((CallPayForE1Plan) call).getCallE1PayForMinute(1759));
		assertEquals(20,((CallPayForE1Plan) call).getCallE1PayForMinute(1800));
	}

	@Test
	public void testIsRegistNumber() {
		CallPay callc1 = new CallPayForC1Plan();
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5678");
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5000");
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5001");
		CallPay calle1 = new CallPayForE1Plan(callc1);
		assertTrue(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5678"));
		assertTrue(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5000"));
		assertFalse(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5001"));
		assertEquals(7,((CallPayForE1Plan) calle1).getCallPayForMinuteForC1E1("090-1234-5000",900));
		assertEquals(10,((CallPayForE1Plan) calle1).getCallPayForMinuteForC1E1("090-1234-5000",500));
		assertEquals(20,((CallPayForE1Plan) calle1).getCallPayForMinuteForC1E1("090-1234-5001",500));
		assertEquals(15,((CallPayForE1Plan) calle1).getCallPayForMinuteForC1E1("090-1234-5001",1000));

	}
	
	@Test
	public void testGetTotalPayForOneCall() {
		CallPay callc1 = new CallPayForC1Plan();
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5678");
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5000");
		((CallPayForC1Plan) callc1).setRegistNumber("090-1234-5001");
		CallPay calle1 = new CallPayForE1Plan(callc1);
		assertTrue(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5678"));
		assertTrue(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5000"));
		assertFalse(((CallPayForC1Plan) calle1).isRegistNumber("090-1234-5001"));
		assertEquals(200,((CallPayForE1Plan) calle1).getTotalPayForOneCall("090-1234-5001",500,10));
		assertEquals(200,((CallPayForE1Plan) calle1).calucE1TotalPay("090-1234-5001",500,10));
		assertEquals(100,((CallPayForE1Plan) calle1).getTotalPayForOneCall("090-1234-5000",500,10));
		assertEquals(300,((CallPayForE1Plan) calle1).calucE1TotalPay("090-1234-5000",500,10));
		assertEquals(70,((CallPayForE1Plan) calle1).getTotalPayForOneCall("090-1234-5000",1000,10));
		assertEquals(370,((CallPayForE1Plan) calle1).calucE1TotalPay("090-1234-5000",1000,10));
	}
}

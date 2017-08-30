import static org.junit.Assert.*;

import org.junit.Test;

public class TestCallForC1PlanTest {

	@Test
	public void testIsRegistNumber() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		assertEquals("090-1234-5678",((CallPayForC1Plan)call).RegistNumber[0]);
	}
	@Test
	public void testIsRegistNumberCase2() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");	
		assertEquals("090-1234-5678",((CallPayForC1Plan)call).RegistNumber[0]);
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5679");
		assertEquals("090-1234-5679",((CallPayForC1Plan)call).RegistNumber[1]);
	}
	
	@Test
	public void testIsRegistNumberCase1() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		assertTrue(((CallPayForC1Plan) call).isRegistNumber("090-1234-5678"));
	}

	@Test
	public void testIsRegistNumberCase3() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		assertFalse(((CallPayForC1Plan) call).isRegistNumber("090-1234-0000"));
	}

	@Test
	public void testIsRegistNumberCase4() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5679");
		((CallPayForC1Plan) call).setRegistNumber("090-1234-0000");
		assertFalse(((CallPayForC1Plan) call).isRegistNumber("090-1234-0000"));
		assertTrue(((CallPayForC1Plan) call).isRegistNumber("090-1234-5678"));
		assertTrue(((CallPayForC1Plan) call).isRegistNumber("090-1234-5679"));
	}
	
	@Test
	public void testgetCallPayForMinuteCase1() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		assertTrue(((CallPayForC1Plan) call).isRegistNumber("090-1234-5678"));
		assertEquals(10,((CallPayForC1Plan) call).isCallPayChargeForMinute("090-1234-5678"));
		assertEquals(20,((CallPayForC1Plan) call).isCallPayChargeForMinute("090-1234-0000"));	
	}
	
	@Test
	public void testCalucC1TotalPay() {
		CallPay call = new CallPayForC1Plan();
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5678");
		assertEquals(100,((CallPayForC1Plan) call).getTotalPayForOneCall("090-1234-5678",10));
		assertEquals(100,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5678",10));
		assertEquals(200,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5678",10));
		assertEquals(300,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5678",10));
		assertEquals(400,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5678",10));
		((CallPayForC1Plan) call).setRegistNumber("090-1234-5679");
		assertEquals(500,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5679",10));
		assertEquals(700,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-0000",10));
		assertFalse(((CallPayForC1Plan) call).isRegistNumber("090-1234-0000"));
		assertEquals(800,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5679",10));
		assertEquals(1100,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5623",15));
		assertEquals(1400,((CallPayForC1Plan) call).calucC1TotalPay("090-1234-5612",15));
	}
}

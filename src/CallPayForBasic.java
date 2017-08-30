
public class CallPayForBasic implements CallPay {
	
	final int CALL_BASICPLAN_PAY_FOR_MINUTE = 20;
	int ChargeTotal = 0;
	int BasicPerMinute = 0;
	
	CallPayForBasic() {
		BasicPerMinute = CALL_BASICPLAN_PAY_FOR_MINUTE;
	}

	@Override
	public int getCallPayForMinute() {
		return this.BasicPerMinute;
	}

	@Override
	public void calucBasicTotalPay(int time) {
		ChargeTotal += getTotalPayForOneCall(time);	
	}

	@Override
	public int getTotalPayForOneCall(int time) {
		return this.getCallPayForMinute() * time;
	}
	
	@Override
	public int getBasicTotalPay () {
		return this.ChargeTotal;
	}
}

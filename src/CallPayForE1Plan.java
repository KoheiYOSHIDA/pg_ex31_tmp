
public class CallPayForE1Plan extends CallPayForC1Plan implements CallPay {

	int E1ChargeTotal = 0;
	final int DISCOUNT_E1_PER_MINUTE = 5;
	
	CallPayForE1Plan() {
		for(int i=0;i<this.RegistNumber.length;i++) {
			this.RegistNumber[i] = "";
		}
	}
	
	CallPayForE1Plan(CallPay c1) {
		for(int i=0;i<((CallPayForC1Plan) c1).RegistNumber.length;i++) {
			this.RegistNumber[i] = ((CallPayForC1Plan) c1).RegistNumber[i];
		}
	}
	
	public boolean isStartCall(int startTime) {
		if(800 <= startTime && startTime <=1759) {
			return true;
		}
			return false;
	}
	
	public int getCallE1PayForMinute(int startTime) {
		if(isStartCall(startTime)) {
			return super.getCallPayForMinute() - DISCOUNT_E1_PER_MINUTE;
		} else {
			return super.getCallPayForMinute();
		}
	}
		
	public int getCallPayForMinuteForC1E1(String number,int startTime) {
		if(this.isRegistNumber(number)) {
			return this.getCallC1PayForMinute(this.getCallE1PayForMinute(startTime));
		} else {
			return getCallE1PayForMinute(startTime);
		}
	}
	
	public int calucE1TotalPay(String number,int startTime,int time) {
		this.ChargeTotal += this.getTotalPayForOneCall(number,startTime,time);
		return this.ChargeTotal;
	}
	
	public int getTotalPayForOneCall(String number,int startTime,int time) {
		return this.getCallPayForMinuteForC1E1(number,startTime) * time;
	}
}
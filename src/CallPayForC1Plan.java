
public class CallPayForC1Plan extends CallPayForBasic implements CallPay {
	public String RegistNumber[];
	
	CallPayForC1Plan() {
		RegistNumber = new String[2];
		for(int i=0;i<this.RegistNumber.length;i++) {
			RegistNumber[i] = "";
		}
	}
	
	public void setRegistNumber(String number) {
		if(isRegistNumber(number)) return;
		for(int i=0;i<this.RegistNumber.length;i++) {
			if("".equals(RegistNumber[i])) {
				this.RegistNumber[i] = number;
				break;
			}
		}
	}
	
	public boolean isRegistNumber(String number) {
		for(int i=0;i<this.RegistNumber.length;i++) {
			if(number.equals(this.RegistNumber[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int getCallC1PayForMinute(int currentPay) {
		return currentPay/2;
	}
		
	public int isCallPayChargeForMinute(String number) {
		if(isRegistNumber(number)) {
			return this.getCallC1PayForMinute(super.getCallPayForMinute());
		} else {
			return super.getCallPayForMinute();
		}
	}

	
	public int calucC1TotalPay(String number,int time) {
		if(isRegistNumber(number)) {
			this.ChargeTotal += this.getTotalPayForOneCall(number,time);
		} else {
			super.calucBasicTotalPay(time);
		}
		return this.ChargeTotal;
	}
	
	public int getTotalPayForOneCall(String number,int time) {
		return isCallPayChargeForMinute(number) * time;
	}
	
}


public class BasicPlan implements Plan {

	int totalBasicPay=0;
	final int BASIC_PAY = 1000;
	
	BasicPlan() {
		this.totalBasicPay = BASIC_PAY;
	}
	@Override
	public int getBasicPay() {
		return this.totalBasicPay;
	}
	
}

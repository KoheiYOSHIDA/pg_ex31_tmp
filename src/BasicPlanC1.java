
public class BasicPlanC1 extends BasicPlan implements Plan {
	
	int ADD_BASIC_PAY_C1 = 100;
	
	BasicPlanC1(Plan Ins) {
		this.totalBasicPay = Ins.getBasicPay() + ADD_BASIC_PAY_C1;
	}
}

public class BasicPlanE1 extends BasicPlan implements Plan {
	
	int ADD_BASIC_PAY_E1 = 200;

	
	BasicPlanE1(Plan Ins) {
		this.totalBasicPay = Ins.getBasicPay() + ADD_BASIC_PAY_E1;
	}
}

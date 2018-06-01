package com.app;

public class App {

	private static final double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8} ;

	public static void main(String[] args) {

		FunctionOverTime sales=FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);
		FunctionOverTime fixedCosts=FunctionOverTime.polynomial(new double[] {15.0});
		FunctionOverTime incrementalCosts=FunctionOverTime.polynomial(new double[] {15.0,0.15});
		FunctionOverTime profit=FunctionOverTime.getProfit(fixedCosts,sales,incrementalCosts, (s,f,i)->s-(f+i));

		double total=0;
		for (int j = 1; j <=12; j++) {
			total+=profit.valueAt(j);
		}
		System.out.println(total);
		
	}

}

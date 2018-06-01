package com.ce;

public class ExampleFP_v2 {

	private static final double[] EXPECTED_SALES_JAN_TO_DEC = new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7, 58.0,
			57.3, 62.0, 60.3, 71.2, 88.8 };

	public static void main(String[] args) {

		final FunctionOverTime sales = FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);
		final FunctionOverTime fixedCosts = FunctionOverTime.constant(15.0);
		final FunctionOverTime incrementalCosts = FunctionOverTime.line(5.1, 0.15);

		// final FunctionOverTime profit =
		// (time)->sales.valueAt(time)-(fixedCosts.valueAt(time)+incrementalCosts.valueAt(time));

		final FunctionOverTime profit = FunctionOverTime.combinationOf3(
				sales, 
				fixedCosts,
				incrementalCosts,
				(a, b, c) -> a - (b + c));

		Double totalProfit = 0.0;
		for (int time = 1; time <= 12; time++) {
			totalProfit += profit.valueAt(time);
		}

		System.out.println("Projected profit for the year: " + totalProfit);

	}

}

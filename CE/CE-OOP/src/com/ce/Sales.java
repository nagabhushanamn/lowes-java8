package com.ce;

public class Sales extends MonthByMonthQuantity {

	public Sales(double[] values) {
		super(values);
	}

	@Override
	public String getName() {
		return "sales";
	}

}

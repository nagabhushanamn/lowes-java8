package com.ce;

public abstract class MonthByMonthQuantity implements QuantityOfInterest {

	private double[] values;

	public MonthByMonthQuantity(double[] values) {
		super();
		this.values = values;
	}

	@Override
	public double valueAt(int time) {
		return values[time - 1];
	}

}

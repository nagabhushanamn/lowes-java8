package com.ce;

public class FixedCosts extends PolynomialQuantity {

	public FixedCosts(double value) {
		super(new double[] { value });
	}

	@Override
	public String getName() {
		return "fixed cost";
	}

}

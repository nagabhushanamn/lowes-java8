package com.app;

/*
 * 
 * function valueAt(){
 *  return 100.00
 * }
 * 
 */

@FunctionalInterface
public interface FunctionOverTime {

	double valueAt(int time);

	static FunctionOverTime monthByMonth(double[] expectedSalesJantoDec) {
		return time -> expectedSalesJantoDec[time - 1];
	}

	// static FunctionOverTime constant(double d) {
	// return time -> d;
	// }
	// static FunctionOverTime line(double d,double e) {
	// return time -> d +(time*e);
	// }

	static FunctionOverTime polynomial(double[] coefficients) {
		return (time) -> {
			Double sum = 0.0;
			for (int i = 0; i < coefficients.length; i++) {
				sum += Math.pow(time, i) * coefficients[i];
			}
			return sum;
		};
	}

	interface InternalFI {
		double apply(double sales, double fixed, double inc);
	}

	static FunctionOverTime getProfit(
			FunctionOverTime sales,
			FunctionOverTime fixedCosts,
			FunctionOverTime incrementalCosts,
			InternalFI fi) {
		return time -> {
			return fi.apply(sales.valueAt(time), fixedCosts.valueAt(time), incrementalCosts.valueAt(time));
		};
	}

}

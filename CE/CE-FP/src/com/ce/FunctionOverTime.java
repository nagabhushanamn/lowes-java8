package com.ce;

@FunctionalInterface
interface FunctionOf3 {
    public double apply(double a, double b, double c);
}

@FunctionalInterface
public interface FunctionOverTime {

	double valueAt(int time);

	static FunctionOverTime monthByMonth(double[] expectedSalesJanToDec) {
		return time -> expectedSalesJanToDec[time - 1];
	}

	// static FunctionOverTime constant(double d) {
	// return time -> d;
	// }
	//
	// static FunctionOverTime line(double d, double e) {
	// return time->d+(time*e);
	// }

	static FunctionOverTime constant(double d) {
		return polynomial(new double[] { d });
	}

	static FunctionOverTime line(double d, double e) {
		return polynomial(new double[] { d, e });
	}

	static FunctionOverTime polynomial(final double[] coefficients) {
		return (time) -> {
			Double sum = 0.0;
			for (int i = 0; i < coefficients.length; i++) {
				sum += Math.pow(time, i) * coefficients[i];
			}
			return sum;
		};
	}
	
   
    
    static FunctionOverTime combinationOf3(
    			final FunctionOverTime a,
            final FunctionOverTime b,
            final FunctionOverTime c,
            final FunctionOf3 combination) {
    	
		    return (time) -> combination.apply(
						    			a.valueAt(time),
						            b.valueAt(time),
						            c.valueAt(time));
}
    
}

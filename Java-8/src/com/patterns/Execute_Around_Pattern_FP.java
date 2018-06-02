package com.patterns;

import java.util.function.Function;

// OO style

public class Execute_Around_Pattern_FP {

	public static int executeDuration(Function<Integer, Integer> function, int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// perform computation
			result = function.apply(value);
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration - " + duration);
		return result;
	}

	public static int withLog(int value) {
		System.out.println("Operation logged for " + value);
		return value;
	}

	public static int executeWithLog(Function<Integer, Integer> function, int value) {
		System.out.println("Operation logged for " + value);
		return function.apply(value);
	}

	public static void main(String[] args) {

		// System.out.println(executeDuration(x -> x * x, 5));
		// System.out.println(executeDuration(x -> x * x * x, 5));

		// System.out.println(executeWithLog(x->x*x, 5));
		// Function<Integer, Integer> computeSquare = x -> x * x;
		// System.out.println(executeWithLog(computeSquare, 5));

		// int result = executeDuration(x -> x * x, 5);
		// System.out.println(withLog(result));
		//
		// System.out.println(executeDuration(x -> x * x, withLog(5)));

	}

}

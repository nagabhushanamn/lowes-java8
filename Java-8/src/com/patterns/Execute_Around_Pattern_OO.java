package com.patterns;

// OO style

public class Execute_Around_Pattern_OO {

	public static int executeImperativeSquareSolution(int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// perform computation
			result = value * value;
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration - " + duration);
		return result;
	}

	public static int executeImperativeCubeSolution(int value) {
		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// perform computation
			result = value * value * value;
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration - " + duration);
		return result;
	}

	public static void main(String[] args) {

		System.out.println(executeImperativeSquareSolution(5));
		System.out.println(executeImperativeCubeSolution(5));

	}

}

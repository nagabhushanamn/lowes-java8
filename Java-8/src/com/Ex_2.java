package com;

class Employee {
	double salary;
}

public class Ex_2 {

	public static void main(String[] args) throws InterruptedException {

		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		for (int i = 0; i < 10_00_000; i++) {
			Employee employee = new Employee();
		}
		System.out.println(runtime.freeMemory());
		runtime.gc();
		Thread.sleep(2000);
		System.out.println(runtime.freeMemory());

	}

}

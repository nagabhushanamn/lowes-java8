package com.demo;

import java.util.function.Consumer;

/*
 *  closure
 *  ---------
 *  
 *  A closure is a function having access to the parent scope, 
 *  even after the parent function has closed.
 * 
 */

public class Ex_8 {

	public static Consumer<String> doTeach(String sub) {
		System.out.println("teaching " + sub);
		String notes = sub + "-notes"; // effective final variable
		Consumer<String> consumer = work -> {
			String newNotes = notes;
			System.out.println(work + " : working with " + notes);
		};
		// notes="bla bla ";
		return consumer;
	}

	public static void main(String[] args) {

		Consumer<String> workFunc = doTeach("java-8");
		workFunc.accept("work-1");
	}

}

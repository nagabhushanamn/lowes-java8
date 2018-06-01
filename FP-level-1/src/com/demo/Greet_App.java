package com.demo;

interface Greeting {
	void greet();
}

class EnglishGreeting implements Greeting {
	@Override
	public void greet() {
		System.out.println("Hello...");
	}
}

class KAGreeting implements Greeting {
	@Override
	public void greet() {
		System.out.println("Namaskara...");
	}
}

public class Greet_App {

	// main greet-logic
	static void greet(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {

		greet(new EnglishGreeting());
		greet(new KAGreeting());

		greet(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Ola..");
			}
		});

		// ------------------------------------------

		// How to write function in java-lang? using 'Lmbda Expression'
		/*
			Greeting en=() -> System.out.println("Hello..."); 
		 */

		Greeting en=() -> System.out.println("Hello..."); 
		greet(en);
		
		
	}

}

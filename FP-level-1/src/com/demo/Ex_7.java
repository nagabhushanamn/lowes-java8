package com.demo;

import java.util.function.Consumer;

public class Ex_7 {

	static String staVar = "im static variable..";
	String insVar = "im ins variable";

	public Consumer<String> insMethod() {
		String localVar = "im local variable";
		// localVar = "im local, but modified";
		Consumer<String> consumer = msg -> {
			System.out.println("consuming the message : " + msg);
			System.out.println(staVar);
			System.out.println(insVar);
			System.out.println(localVar);
		};
		// consumer.accept("hello..");
		return consumer;
	}

	public static void main(String[] args) {

		Consumer<String> consumer = new Ex_7().insMethod();

	}

}

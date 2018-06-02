package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

interface I {
	private void priMethod() {
		System.out.println("I::pri()");
	}

	public default void deMethod() {
		priMethod();
	}
}

class MyClass implements I {

}

public class Ex1 {

	public static void main(String[] args) throws FileNotFoundException {
		MyClass class1 = new MyClass();
		class1.deMethod();

		// ------------------------------------

		FileReader fileReader = new FileReader("");
		FileReader fileReader2 = new FileReader("");
		try (fileReader; fileReader2) {

		} catch (Exception e) {
		}

	}

}

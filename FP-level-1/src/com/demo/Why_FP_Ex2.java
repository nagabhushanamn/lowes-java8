package com.demo;

import java.time.LocalTime;
import java.util.Objects;

// FP ==> for lazy evaluation

public class Why_FP_Ex2 {

	public static void main(String[] args) {

		System.out.println(composeHashCodes2("hello", null));

	}

	// slow.......
	public static String getApplicationState() {
		System.out.println("getApplicationState");
		return "It's " + LocalTime.now();
	}

	private static int composeHashCodes(String string1, String string2) {
		Objects.requireNonNull(string1, "string1 may not be null! " + getApplicationState());
		Objects.requireNonNull(string2, "string2 may not be null! " + getApplicationState());
		return string1.hashCode() ^ string2.hashCode();
	}

	private static int composeHashCodes2(String string1, String string2) {
		Objects.requireNonNull(string1, () -> "string1 may not be null! " + getApplicationState());
		Objects.requireNonNull(string2, () -> "string2 may not be null! " + getApplicationState());
		return string1.hashCode() ^ string2.hashCode();
	}

}

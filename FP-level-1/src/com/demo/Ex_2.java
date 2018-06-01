package com.demo;

import java.util.Comparator;

interface I {
	int VALUE = 10;
	void m();
	default void deMethod() {
	}
	static void staMethod() {
	}
}

class Impl1 implements I {
	@Override
	public void m() {
	}
}

public class Ex_2 {

	public static void main(String[] args) {

		Comparator<String> strCompare = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		//System.out.println(strCompare.compare("abc", "Abc"));
		Comparator<String> reverseStrCompare=strCompare.reversed();
		System.out.println(reverseStrCompare.compare("abc", "Abc"));

	}
}

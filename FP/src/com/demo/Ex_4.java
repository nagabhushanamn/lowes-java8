package com.demo;

import java.util.Comparator;

class Person implements Comparable<Person> {
	String name;

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}

public class Ex_4 {

	public static void main(String[] args) {

		Person person1=new Person(); // comparable
		person1.name="Nag";
		
		Comparator<String> strComparator=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		};
		
	}

}

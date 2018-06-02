package com;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

import com.model.Employee;
import com.model.Gender;

public class Ex_1 {

	public static void main(String[] args) {

		// Comparator<Employee> byName = (o1, o2) ->
		// o1.getName().compareTo(o2.getName());

		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
		Comparator<Employee> byNameAndSalary = byName.thenComparing(bySalary);

		Employee employee1 = new Employee(123, "abc", 100.00, Gender.MALE);
		Employee employee2 = new Employee(123, "Abc", 200.00, Gender.MALE);

		int diff = byNameAndSalary.compare(employee1, employee2);
		System.out.println(diff);

		// ----------------------------------------------------------------------

		// FUnction composition

		Function<String, String> upperFunc = s -> {
			return s.toUpperCase();
		};

		Function<String, String> lowerFunc = s -> {
			return s.toLowerCase();
		};

		// Higher-order programming
		Function<Function<String, String>, Function<String, String>> logBeforeWrapper = inputFunc -> {
			return s -> {
				System.out.println("log before");
				return inputFunc.apply(s);
			};
		};

		// Function<String, String> upperFuncWithLog =
		// logBeforeWrapper.apply(upperFunc);
		// String upperString = upperFuncWithLog.apply("hello");
		// System.out.println(upperString);

		System.out.println(logBeforeWrapper.apply(upperFunc).apply("hello"));

		// ----------------------------------------------------------------------
	}

}

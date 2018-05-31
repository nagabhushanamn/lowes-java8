package com.demo;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.demo.model.Employee;
import com.demo.model.Manager;

interface Adder {
	double add(double d1, double d2);
}

interface Joiner {
	String join(String s1, String s2);
}

class Util {
	public static void test(Adder adder) {
		double a = 12;
		double b = 13;
		System.out.println(adder.add(a, b));
	}

	public static void test(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(joiner.join(s1, s2));
	}
}

public class Ex_6 {

	// public static <T> void m(T t) {
	// System.out.println(t);
	// }

	public Supplier<String> get() {
		return () -> "pizaa.";
	}

	public static void main(String[] args) {

		// before java-5
		// List<String> list=new ArrayList<String>();

		// after java-5 : Type inference ( compiler detects missing type )
		// List<String> list = new ArrayList<>();

		// m("hello");

		// ---------------------------------------------
		// Adder adder = (double x, double y) -> x + y;
		// or
		// Adder adder = (x, y) -> x + y; // RHS context
		// Util.testAdd(adder);

		// or
		// Util.test((double x, double y) -> x + y); // Parameter context
		// Util.test((Joiner) (x, y) -> x + y); // Parameter context

		// -----------------------------------------------

		// Standard syntax
		// Consumer<String> c1 = msg -> System.out.println(msg.length()); // RHS context

		// Compile-time error: not enough info
		// Object x1 = msg -> System.out.println(msg.length());

		// Compile-time error: not enough info
		// Object x2 = (String msg) -> System.out.println(msg.length());

		// OK: cast added
		// Object x3 = (Consumer<String>) ((String msg) ->
		// System.out.println(msg.length()));
		// if(x3 instanceof Consumer) {
		// Consumer<String> consumer=(Consumer<String>)x3;
		// consumer.accept("hello");
		// }

		// OK: but inferred parameter type is Object
		// Consumer<?> c2 = msg -> System.out.println(msg);

		// Compile-time error: Inference is *not* based on body of lambda
		// Consumer<?> c3 = msg -> System.out.println(msg.length());

		// OK: added manifest type to parameter
		// Consumer<?> c4 = (String msg) -> System.out.println(msg.length());

		// UnaryOperator<Manager> doubleBonus = manager ->
		// new Manager(manager.getName(), manager.getSalary(), 2*manager.getBonus());

		// Manager manager=doubleBonus.apply(new Manager("Nag", 1000,100));
		// System.out.println(manager.getBonus());

		// Manager test1 = testWithNull(doubleBonus);

		// Manager test2 = testWithNull(manager ->
		// new Manager(manager.getName(), manager.getSalary(), 2*manager.getBonus()));

		// Compile-time error: Inference is not based on body of lambda
		// Employee test3 = testWithNull(
		// manager -> new Manager(manager.getName(), manager.getSalary(), 2 *
		// manager.getBonus()));

	}

	public static <T extends Employee> T testWithNull(UnaryOperator<T> transformer) {
		return transformer.apply(null);
	}

}

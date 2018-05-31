package com;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// Method-reference  like function-pointer in C-lang

class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	static String getInfo() {
		return "Im Employee class sta-method";
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class Ex_1 {

	// public static String getSomething() {
	// return "let know, wat u need";
	// }

	public static void main(String[] args) {

		// Supplier<String> supplier = () -> getSomething();
		// or
		// Supplier<String> supplier = Ex_1::getSomething;

		// Supplier<String> supplier = Employee::getInfo;
		// System.out.println(supplier.get());

		// Employee e1 = new Employee(123, "Mike");
		// Supplier<String> function=e1::getName;
		// System.out.println(function.get());
		//
		// Employee e2=new Employee(234234, "Nag");
		// Employee e3=new Employee(452343, "Someone");
		//
		// Function<Employee, String> function2=Employee::getName;
		// System.out.println(function2.apply(e2));
		// System.out.println(function2.apply(e3));

		// Supplier<Employee> supplier=Employee::new;
		// Employee employee=supplier.get();

		// ----------------------------------------------------

		// Static method
		Supplier<Thread> s1 = Thread::currentThread;
		ThreadSupplier supplier = Thread::currentThread;

		// Instance method (instance specified)
		Employee frank = new Employee("Frank", 3000);

		Integer i = frank.getSalary(); //
		Supplier<Integer> s2 = frank::getSalary;

		// A common instance method (instance specified)
		Consumer<String> c1 = System.out::println;

		// An instance method (instance not specified)
		Function<Employee, Integer> f1 = Employee::getSalary;

		Integer frankSalary = f1.apply(frank);

		Comparator<Employee> byName = Comparator.comparing(Employee::getName);

		Comparator<Employee> byName2 = Comparator.comparing(e -> e.getName());

		//

	}

	interface ThreadSupplier {
		Thread giveMeAThread();
	}

}

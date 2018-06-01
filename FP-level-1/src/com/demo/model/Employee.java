package com.demo.model;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name + ": " + salary;
	}
	
	public static final Employee[] SOME = {
			new Employee("Mike", 2500),
			new Employee("Frank", 3000),
			new Employee("Hannah", 2500),
			new Employee("Rajeev", 2000),
			new Employee("Jessica", 1500),
			new Employee("Doug", 2000),
			new Employee("Chen", 3500),
			new Employee("Krish", 2200),
			new Employee("Louie", 800)
		};
	
	
}
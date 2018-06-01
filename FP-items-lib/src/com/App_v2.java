package com;

import java.util.Arrays;
import java.util.List;

import com.model.Employee;
import com.model.Gender;
import com.util.ItemsLib;

public class App_v2 {
	
	public static void main(String[] args) {
		
		List<Employee> employees=Arrays.asList(
				new Employee(3234234, "e1", 1000.00, Gender.MALE),
				new Employee(2234236, "e2", 2000.00, Gender.MALE),
				new Employee(1234238, "e3", 3000.00, Gender.FEMALE),
				new Employee(4234233, "e4", 4000.00, Gender.MALE),
				new Employee(5234234, "e5", 5000.00, Gender.FEMALE));

		List<Employee> filterList = ItemsLib.filter(employees, item ->item.getSalary()>3000);
		List<String> empNames=ItemsLib.map(filterList, item->item.getName());
		ItemsLib.forEach(empNames, item->System.out.println(item));
		
		System.out.println("------");
		
		// using Stream API
//		employees
//		.stream()
//		.filter(item ->item.getSalary()>3000)
//		.map(item->item.getName())
//		.forEach(item->System.out.println(item));
		

	}

}

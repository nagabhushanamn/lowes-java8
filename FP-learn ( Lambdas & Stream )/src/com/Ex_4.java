package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Employee;
import com.model.Gender;

public class Ex_4 {

	public static void main(String[] args) {

		Employee[] employees = Employee.SOME;
		Stream<Employee> stream = Arrays.stream(employees);

		// Map<String,Employee> maleEmployees=stream
		// .filter(e->e.getGender()==Gender.MALE)
		//// .collect(()->new ArrayList<>(), (list,e)->list.add(e),
		// (list1,list2)->list1.addAll(list2));
		// .collect(Collectors.toMap(e->e.getName(), e->e));

		Map<Boolean, List<Employee>> brackets = stream
				.collect(Collectors.partitioningBy(e -> e.getGender() == Gender.MALE));

		System.out.println(brackets);

	}

}

package com.sathya.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectToString {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Sathya"));
		empList.add(new Employee(2, "Sathvika"));
		empList.add(new Employee(11, "Karthi"));
		// Getting employee names from list objects
		List<String> empNameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("List of names from employee:" + empNameList);
		
		List<Integer> empNameIdList = empList.stream().map(Employee::getId ).collect(Collectors.toList());
		List<Employee> employees = empNameIdList.stream().map(i -> new Employee(i, "Karthi")).collect(Collectors.toList());
		System.out.println("List of names from employee:" + employees);
	}

}

package com.te.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortBySalaryAndPutInAMap {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(23, "Nilim", 23000), new Employee(31, "Nilim", 20000),
				new Employee(20, "Nilim", 21000));
		LinkedHashMap<Integer, Employee> map = employees.stream()
				.sorted((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))
				.collect(Collectors.toMap(Employee::getId, Employee -> Employee, (s, a) -> s, LinkedHashMap::new));
		System.out.println(map);
	}
}

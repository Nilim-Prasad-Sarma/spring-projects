package com.te.javabasics.abstraction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "Nilim"));
		arrayList.add(new Employee(2, "Lilim"));
		arrayList.add(new Employee(3, "Silim"));
		arrayList.add(new Employee(4, "Zilim"));

		Comparator<Employee> comparator = (o1, o2) -> {
			return o2.getId() - o1.getId();
		};
		List<Employee> list = arrayList.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println(list);

	}
}

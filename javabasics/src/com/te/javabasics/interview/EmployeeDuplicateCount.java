package com.te.javabasics.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDuplicateCount {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("A1001", "Nilim", "HR"));
		empList.add(new Employee("A1002", "Nilim", "Dev"));
		empList.add(new Employee("A1003", "Rohan", "HR"));
		empList.add(new Employee("A1004", "Pradeep", "HR"));

		Map<String, Long> collect = empList.stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

		Set<Entry<String, Long>> entrySet2 = collect.entrySet();
		for (Entry<String, Long> entry : entrySet2) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println("-------------------------");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		int count = 1;
		for (Employee employee : empList) {
			if (!hashMap.containsKey(employee.getName())) {
				hashMap.put(employee.getName(), 1);
			} else {
				hashMap.put(employee.getName(), count + 1);
			}
		}

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

	}
}

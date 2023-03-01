package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(20, "Rohit");
		Employee employee2 = new Employee(10, "Sateesh");
		Employee employee3 = new Employee(40, "Raghav");
		Employee employee4 = new Employee(19, "Yamini");

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee);
		arrayList.add(employee2);
		arrayList.add(employee3);
		arrayList.add(employee4);

		System.out.println("Before sorting");
		for (Employee employee5 : arrayList) {
			System.out.println(employee5);
		}
		System.out.println("After sorting");
		Collections.sort(arrayList, new CompareById());
		for (Employee employee5 : arrayList) {
			System.out.println(employee5);
		}
		
		
		System.out.println("After sorting by name");
		Collections.sort(arrayList, new CompareByName());
		for (Employee employee5 : arrayList) {
			System.out.println(employee5);
		}
		
	}
}

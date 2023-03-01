package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFeatures {
	public static void main(String[] args) {
//		ArrayList<Employee> arrayList = new ArrayList<Employee>();
//		arrayList.add(new Employee("Nilim", 20000));
//		arrayList.add(new Employee("Taher", 30000));
//		arrayList.add(new Employee("Rohan", 10000));
//
//		List<Integer> collect = arrayList.stream().map(Employee::getSalary).collect(Collectors.toList());
//		System.out.println(collect);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

		arrayList2.add(30);
		arrayList2.add(40);

		ArrayList<List<Integer>> arrayList3 = new ArrayList<>();
		arrayList3.add(arrayList);
		arrayList3.add(arrayList2);

		System.out.println(arrayList3);
		ArrayList<Object> arrayList4 = new ArrayList<>();
		for (List<Integer> list : arrayList3) {
			arrayList4.addAll(list);
		}
		System.out.println(arrayList4);
		
		
		List<String> asList = Arrays.asList("I" , "love" , "java");
		String collect = asList.stream().collect(Collectors.joining("-", "(", ")"));
		System.out.println(collect);
		
		
		
		
		
		
		
		
		

//		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
//
//		for (List<Integer> list : arrayList3) {
//			for (Integer integer : list) {
//				arrayList4.add(integer);
//			}
//		}
//		System.out.println(arrayList4);
		
		

	}
}

package com.te.javabasics.interview;

import java.util.HashMap;

public class SortingValuesInHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "nilim");
		hashMap.put(200, "vinay");
		hashMap.put(300, "alom");
		hashMap.put(400, "akram");

		hashMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
				.forEach(System.out::println);
	}
}

package com.te.javabasics.interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInAString {
	public static void main(String[] args) {
		String s1 = "I am am learning java java";
		String[] strings = s1.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String string : strings) {
			if (hashMap.get(string) != null) {
				hashMap.put(string, hashMap.get(string) + 1);
			} else {
				hashMap.put(string, 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println("-------------------------------------------");
		for (int i = 0; i < strings.length - 1; i++) {
			if (strings[i].equals(strings[i + 1])) {
				strings[i] = strings[i + 1];
			}
		}
		for (int i = 0; i < strings.length - 1; i++) {
			System.out.println(strings[i]);
		}

	}
}

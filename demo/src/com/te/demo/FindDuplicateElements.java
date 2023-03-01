package com.te.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 2, 3, 2, 4, 5 };
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i : array) {
			Integer count = hashMap.get(i);
			if (count == null) {
				hashMap.put(i, 1);
			} else {
				count = count + 1;
				hashMap.put(i, count);
			}
		}

		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}

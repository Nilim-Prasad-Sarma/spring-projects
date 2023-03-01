package com.te.javabasics.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 100);
		hashMap.put("B", 200);
		hashMap.put("C", 300);

		System.out.println(hashMap+"--------->");

		Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getKey().equals("A") && entry.getKey().equals("B")) {
				entry.setValue(1000);
			}
			System.out.println(entry);
		}

	}
}

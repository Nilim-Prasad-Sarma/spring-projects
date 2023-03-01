package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceOfString {
	public static void main(String[] args) {
		String string = "I am am a java java developer and I have joined this company";
		int count = 1;
		String[] words = string.split(" ");
		HashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
		for (String string2 : words) {
			if (!hashMap.containsKey(string2)) {
				hashMap.put(string2, count);
			} else {
				hashMap.put(string2, count + 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}

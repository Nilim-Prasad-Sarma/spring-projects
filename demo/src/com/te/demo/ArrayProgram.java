package com.te.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayProgram {
	public static void main(String[] args) {
		int[] a = { 1, 1, 5, 3, 2, 4, 4, 4, 2, 2 };

		Map<Integer, Integer> map = new LinkedHashMap();

		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] % 2 == 0 && a[i] == a[j] && a[j] != Integer.MAX_VALUE) {
					count++;
					a[j] = Integer.MAX_VALUE;
				}
			}
			if (a[i] % 2 == 0) {
				map.put(a[i], count);
			}
			count = 1;
		}

		if (map.entrySet().stream().count() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(map.entrySet().stream().sorted((e1, e2) -> e1.getKey() - e2.getKey())
					.max((e1, e2) -> e1.getValue() - e2.getValue()).get().getKey());
		}
	}
}

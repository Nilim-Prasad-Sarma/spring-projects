package com.te.demo;

import java.util.HashSet;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 5, 7, 8, 0 };
		missingNumbers(array);
	}

	public static void missingNumbers(int[] a) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (Integer num : a) {
			hashSet.add(num);
		}
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (!hashSet.contains(i)) {
				System.out.println(i);
			}
		}
	}
}

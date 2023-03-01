package com.te.demo.prac;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 1, 3 };
//		approach 1
//		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//		
//		for (int i : array) {
//			hashMap.put(i, count++);
//		}
//		hashMap.forEach((i,j)->{
//			System.out.println(i + ""+ j);
//		});

//		approach 2
		Arrays.sort(array);
		int j = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}
		array[j] = array[array.length - 1];
		for (int i = 0; i <= j; i++) {
			System.out.println(array[i]);
		}

	}
}

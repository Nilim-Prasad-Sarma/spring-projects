package com.te.demo;

import java.util.HashSet;

public class RemoveDuplicateElementsFromAnArray {
	public static void main(String[] args) {
//		for sorted array
		int[] array = { 1, 2, 2, 3, 4, 5, 5 };
		int j = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}
		array[j] = array[array.length - 1];
		for (int i = 0; i < j + 1; i++) {
			System.out.println(array[i]);
		}

//		for unsorted array
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 2, 3, 2, 2, 4, 5, 5 };
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		for (int i = 0; i < array.length; i++) {
//			hashSet.add(array[i]);
//
//		}
//		for (Integer integer : hashSet) {
//			System.out.println(integer);
//		}
	}

}

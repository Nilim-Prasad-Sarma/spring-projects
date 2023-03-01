package com.te.javabasics.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SndHighestElement {
	public static void main(String[] args) {
		int[] array = { 1, 3, 4, 2, 3, 4, 21 };
		Integer integer = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer);
	}
}

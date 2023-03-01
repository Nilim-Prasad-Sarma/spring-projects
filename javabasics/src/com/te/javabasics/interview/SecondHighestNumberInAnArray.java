package com.te.javabasics.interview;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberInAnArray {
	public static void main(String[] args) {
		int array[] = { 2, 10, 23, 12, 1, 3 };

		Integer integer = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("The 2nd largest number in the array is :" + integer);
		
	}

}

package com.te.demo;

public class MicroFocusQuestions {
	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 10, 4 };
		for (int i = 0; i < array.length; i++) {
			int product = 1;
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					product = product * array[j];
				}

			}
			System.out.println("The products:" + product);
		}
	}
}

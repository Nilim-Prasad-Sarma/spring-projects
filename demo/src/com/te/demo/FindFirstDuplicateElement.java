package com.te.demo;

import java.util.Scanner;

public class FindFirstDuplicateElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of element you wish to enter");
		int noOfElements = scanner.nextInt();
		int[] array = new int[noOfElements];
		System.out.println("Enter the elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length - 1; i++) {
			int temp = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("The first duplicate element is: " + array[i]);
					temp += 1;
					break;
				}
			}
			if (temp > 0) {
				break;
			}
		}
	}
}
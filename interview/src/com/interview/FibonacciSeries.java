package com.interview;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = scanner.nextInt();
		int result = 0;

		System.out.print("Numbers are " + a + ", " + b);
		for (int i = 1; i <= range; i++) {
			result = a + b;
			System.out.print(", " + result);
			a = b;
			b = result;
		}
	}
}

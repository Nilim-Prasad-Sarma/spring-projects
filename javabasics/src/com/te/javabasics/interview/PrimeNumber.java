package com.te.javabasics.interview;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 9;
		int count = 0;
		if ((number == 0) || (number == 1)) {
			System.out.println("Not a prime number");
		}

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				System.out.println("Not a prime number");
				count += 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Prime number");
		}

	}
}

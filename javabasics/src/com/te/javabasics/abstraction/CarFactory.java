package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {

	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the car name:");
		String carName = scanner.next();
		if (carName.equalsIgnoreCase("audi")) {
			return new Audi();
		} else if (carName.equalsIgnoreCase("bmw")) {
			return new Bmw();
		} else {
			throw new RuntimeException("invalid car");
		}
	}
}

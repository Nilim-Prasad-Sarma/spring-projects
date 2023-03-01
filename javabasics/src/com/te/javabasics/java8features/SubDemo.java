package com.te.javabasics.java8features;

public class SubDemo {
	public static void main(String[] args) {
		Demo demo = a -> System.out.println("Lambda example" + a + " ");

		demo.stuff(10);
	}
}

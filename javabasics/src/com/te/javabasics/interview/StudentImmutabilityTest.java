package com.te.javabasics.interview;

public class StudentImmutabilityTest {
	public static void main(String[] args) {

		Address address = new Address("Guwahati", "Assam");

		StudentImmutability student = new StudentImmutability(1, "Nilim", address);
		System.out.println(student);

		student.getAddress().setCity("Blr");
		student.getAddress().setState("karnataka");

		System.out.println("----------------------------");
		System.out.println(student);

	}
}

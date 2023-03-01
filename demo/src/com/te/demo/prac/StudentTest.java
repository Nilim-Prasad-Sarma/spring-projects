package com.te.demo.prac;

public class StudentTest {
	public static void main(String[] args) {
		Address address = new Address("12/A", "Bengaluru");

		Student student = new Student(1, "Nilim", address);
		System.out.println(student);

		student.getAddress().sethNo("12/D");
		student.getAddress().setCity("Guwahati");
		
		System.out.println(student);
	}
}

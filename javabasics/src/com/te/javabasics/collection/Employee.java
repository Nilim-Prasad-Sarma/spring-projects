package com.te.javabasics.collection;

public class Employee implements Comparable<Employee>{

	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
}

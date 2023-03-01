package com.te.empwebapp.service;

import java.util.List;

import com.te.empwebapp.entity.Employee;

public interface EmployeeService {
	boolean register(Employee employee);

	Employee authenticate(Employee employee);
	
	boolean deleteData(String employeeId);

	List<Employee> getAll();
	
}

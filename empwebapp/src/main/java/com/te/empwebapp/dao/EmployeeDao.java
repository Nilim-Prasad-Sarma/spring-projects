package com.te.empwebapp.dao;

import java.util.List;

import com.te.empwebapp.entity.Employee;

public interface EmployeeDao {
	boolean register(Employee employee);

	Employee authenticate(Employee employee);

	boolean deleteData(String empId);

	List<Employee> getAll();
}

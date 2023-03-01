package com.te.empwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empwebapp.dao.EmployeeDao;
import com.te.empwebapp.entity.Employee;
import com.te.empwebapp.exception.EmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean register(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.register(employee);
		} else {
			return false;
		}

	}

	@Override
	public Employee authenticate(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employee);
		}
		throw new EmployeeException("Your Id should start with TYC");
	}

	@Override
	public boolean deleteData(String employeeId) {
		if (employeeId.startsWith("TYC")) {
			return dao.deleteData(employeeId);
		}
		return false;
	}

	@Override
	public List<Employee> getAll() {
		return dao.getAll();
	}

}

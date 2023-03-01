package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotations.pojo.Address;
import com.te.springcoreannotations.pojo.Employee;

@Configuration
//@ComponentScan(basePackages = "com.te.springcoreannotations")
public class EmployeeConfig {

	@Bean("employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId(100);
		employee.setEmpName("John");
		return employee;
	}

	@Bean
	@Primary
	public Address getAddress() {
		Address address = new Address();
		address.setHNo("201/qw");
		address.setState("Karnataka");
		address.setStreet("7th cross");
		return address;
	}

	@Bean
	public Address getAddress1() {
		Address address = new Address();
		address.setHNo("201/A");
		address.setState("Karnataka");
		address.setStreet("9th cross");
		return address;
	}

}

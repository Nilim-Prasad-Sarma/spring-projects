package com.te.springcoreannotations.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee {
	private int empId;
	private String empName;
	@Autowired
	@Qualifier("getAddress")
	private Address address;

}

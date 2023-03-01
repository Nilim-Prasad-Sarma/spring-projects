package com.te.empwebapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "employee_info")
public class Employee {

	@Id
	private String empId;
	private String empName;
	private String emailId;
	private String designation;
	private String password;
}

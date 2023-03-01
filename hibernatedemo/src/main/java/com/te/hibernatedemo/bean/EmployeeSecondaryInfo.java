package com.te.hibernatedemo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeSecondaryInfo {

	@Id
	private String panNo;
	private Long aadharNo;
	private String fatherName;
	private String motherName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private EmployeePrimaryInfo info;
	
}

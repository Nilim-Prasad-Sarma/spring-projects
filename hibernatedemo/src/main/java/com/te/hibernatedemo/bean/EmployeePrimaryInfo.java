package com.te.hibernatedemo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "emp_age")
	private int empAge;
	@Column(name = "emp_desig")
	private String designation;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "info")
	private EmployeeSecondaryInfo secondaryInfo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "info")
	private List<EmployeeAddressInfo> addressInfo;

}

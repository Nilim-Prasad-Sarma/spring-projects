package com.te.hibernatedemo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmployeeAddressInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;

	private String addressType;
	private String city;
	private String country;

	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo info;
}

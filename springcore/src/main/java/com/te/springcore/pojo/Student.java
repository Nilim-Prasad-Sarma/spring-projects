package com.te.springcore.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Student {

	@Value("100")
	private int studentId;
	@Value("Ross")
	private String studentName;
	@Autowired
	private Address address;
}

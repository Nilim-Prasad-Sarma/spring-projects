package com.te.springcoreannotations.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet {
	private String petName;
//	@Autowired
//	@Qualifier("cat")
	private Animal animal;
}

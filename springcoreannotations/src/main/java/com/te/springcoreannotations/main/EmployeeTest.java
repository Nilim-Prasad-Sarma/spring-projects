package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.config.EmployeeConfig;
import com.te.springcoreannotations.pojo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}
}

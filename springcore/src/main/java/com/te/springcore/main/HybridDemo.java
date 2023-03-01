package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.pojo.Student;

public class HybridDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hybrid.xml");
		Student student = context.getBean("student" , Student.class);
		System.out.println(student);
	}
}

package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.pojo.Address;
import com.te.springcore.pojo.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.hashCode());
	}
}

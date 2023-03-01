package com.te.springcore.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.pojo.LifeCycleDemo;

public class DemoMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		context.registerShutdownHook();
		LifeCycleDemo demo = (LifeCycleDemo) context.getBean("demo");
		System.out.println(demo);
	}
}

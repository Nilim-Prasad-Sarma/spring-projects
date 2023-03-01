package com.te.springcore.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.ToString;

@ToString
public class LifeCycleDemo implements InitializingBean, DisposableBean {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.err.println("Id setter");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");
	}

}

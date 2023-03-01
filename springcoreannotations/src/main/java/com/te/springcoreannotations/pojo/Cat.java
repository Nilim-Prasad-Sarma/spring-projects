package com.te.springcoreannotations.pojo;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat drinks milk");

	}

	@Override
	public void speak() {
		System.out.println("Meow meow");
	}

}

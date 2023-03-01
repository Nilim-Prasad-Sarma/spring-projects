package com.te.springcoreannotations.pojo;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats pedigree");
	}

	@Override
	public void speak() {
		System.out.println("Bow bow");
	}

}

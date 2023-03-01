package com.te.javabasics.abstraction;

public class Audi implements Car {

	@Override
	public void accelarate() {
		System.out.println("Audi is accelarating");
	}

	@Override
	public void brakes() {
		System.out.println("Audi has stopped");
	}

	@Override
	public void gear() {
		System.out.println("Audi is shifting gears");
	}

	@Override
	public void airBag() {
		System.out.println("Audi has airbags");
	}

}

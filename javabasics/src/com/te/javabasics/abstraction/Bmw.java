package com.te.javabasics.abstraction;

public class Bmw implements Car {

	@Override
	public void accelarate() {
		System.out.println("Bmw is accelarating");
	}

	@Override
	public void brakes() {
		System.out.println("Bmw has been parked");
	}

	@Override
	public void gear() {
		System.out.println("Bmw is shifting gears");
	}

	@Override
	public void gps() {
		System.out.println("Bmw has gps");
	}

}

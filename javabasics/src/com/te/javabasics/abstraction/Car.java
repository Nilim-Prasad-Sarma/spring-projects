package com.te.javabasics.abstraction;

public interface Car {
	void accelarate();

	void brakes();

	void gear();

	default void airBag() {

	}

	default void gps() {

	}
}

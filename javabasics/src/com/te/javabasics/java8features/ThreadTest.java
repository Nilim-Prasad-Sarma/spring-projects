package com.te.javabasics.java8features;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable runnable = new MyThread();
		Runnable runnable1 = new MyThread1();

		Thread thread = new Thread(runnable);
		Thread thread1 = new Thread(runnable1);
		thread.start();
		thread1.start();
	}
}

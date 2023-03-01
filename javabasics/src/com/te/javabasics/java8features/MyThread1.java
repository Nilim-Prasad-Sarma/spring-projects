package com.te.javabasics.java8features;

public class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ch + "--->" + Thread.currentThread().getName());
		}
	}
}

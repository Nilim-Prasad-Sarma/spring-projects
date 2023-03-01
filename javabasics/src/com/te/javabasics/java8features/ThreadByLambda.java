package com.te.javabasics.java8features;

public class ThreadByLambda {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + "--->" + Thread.currentThread().getName());
			}
		};

		Runnable runnable2 = () -> {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(ch + "--->" + Thread.currentThread().getName());
			}
		};
		Thread thread = new Thread(runnable);
		
		
		Thread thread1 = new Thread(runnable2);

		thread.start();
		thread1.start();

	}
}

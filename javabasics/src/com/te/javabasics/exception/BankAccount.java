package com.te.javabasics.exception;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (this.balance > amount) {
			System.out.println("Your balance is :" + this.balance);
			this.balance -= amount;
			System.out.println(amount + " Rs. withdrawn");
			System.out.println("Remaining balance :" + this.balance);
		}
		else {
			throw new InsufficientBalanceException("Insufficient balance!!!");
		}
	}

}

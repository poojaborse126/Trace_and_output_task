package com.construct1;

public class Account {

	int balance;

	Account() {

		this(1000);
		System.out.println("Basic account");
	}

	Account(int balance) {
		this.balance = balance;
		System.out.println("Balance: " + this.balance);
	}
}

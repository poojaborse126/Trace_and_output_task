package com.construct2;

public class Account {

	static int totalAccounts = 0;
	int balance;

	Account(int balance) {
		this.balance = balance;
		totalAccounts++;
	}

	void display() {
		System.out.println(balance + " " + totalAccounts);
	}
}

package com.constrct;

public class Account {

	String holder;
	double balance;

	Account(String holder, double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	void display() {
		System.out.println(holder + ": " + balance);
	}
}

package com.construct1;

public class BankAccount {
	int balance = 1000;

	{
		balance += 500;
		System.out.println(balance);
	}

	BankAccount() {
		balance += 100;
		System.out.println(balance);
	}
}

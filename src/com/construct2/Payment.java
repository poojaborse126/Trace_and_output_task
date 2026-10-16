package com.construct2;

public class Payment {
	Payment() {
		System.out.println("Payment created");
	}

	Payment(int amount) {
		System.out.println("Amount: " + amount);
	}

	void pay(int amount) {
		System.out.println("Cash: " + amount);
	}

	void pay(String method) {
		System.out.println("Method: " + method);
	}
}

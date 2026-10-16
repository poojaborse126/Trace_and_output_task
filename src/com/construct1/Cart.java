package com.construct1;

public class Cart {
	int items;
	int amount;

	Cart() {
		this(2);
		System.out.println("Default cart");
	}

	Cart(int items) {
		this(items, 500);
		System.out.println("Items: " + items);
	}

	Cart(int items, int amount) {
		this.items = items;
		this.amount = amount;
		System.out.println("Amount: " + amount);
	}
}

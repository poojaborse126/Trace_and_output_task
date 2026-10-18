package com.construct2;

public class Product {
	static {
		System.out.println("Product static block");
	}

	int price = 100;

	{
		System.out.println("Product instance block: " + price);

	}

	Product() {
		this(200);
		System.out.println("Product default constructor");
	}

	Product(int price) {
		this.price = price;
		System.out.println("Product constructor: " + this.price);
	}

	void display() {
		System.out.println("Product price: " + price);
	}
}

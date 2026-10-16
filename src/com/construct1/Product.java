package com.construct1;

public class Product {

	int price = 1000;

	Product(int price) {
		price = price + 500;
		System.out.println("Local price: " + price);
		System.out.println("Object price: " + this.price);
	}
}

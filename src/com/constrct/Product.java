package com.constrct;

public class Product {

	Product() {
		System.out.println("Product not selected");
	}

	Product(String name) {
		System.out.println("Selected: " + name);
	}
}

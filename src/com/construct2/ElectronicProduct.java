package com.construct2;

public class ElectronicProduct extends Product{
	static {
		System.out.println("Electronic static block");
	}

	int price = 500;

	{
		System.out.println("Electronic instance block: " + price);
	}

	ElectronicProduct() {
		super();
		System.out.println("Electronic constructor: " + price);
	}

	@Override
	void display() {
		System.out.println("Electronic price: " + price);
		System.out.println("Parent price: " + super.price);
	}
}

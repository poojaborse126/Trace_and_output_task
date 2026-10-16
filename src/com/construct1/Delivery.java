package com.construct1;

public class Delivery {
	static int count = 10;
	int id = 100;

	{
		id += count;
		count++;
		System.out.println("Block: " + id);
	}

	Delivery() {
		System.out.println("Constructor: " + id);
	}

}

package com.construct2;

public class Product1 {
	int price = 100;

	{
		price = price + 50;
		System.out.println("Block: " + price);
	}

	Product1() { 
	 
	 
	        price = price * 2; 
	        System.out.println("Constructor: " + price); 
	    }
}

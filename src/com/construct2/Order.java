package com.construct2;

public class Order {

	static int count; 
	 
    static { 
        count = 5; 
        System.out.println("Initial count: " + count); 
    } 
 
    Order() { 
        count++; 
        System.out.println("Order count: " + count); 
    }
}

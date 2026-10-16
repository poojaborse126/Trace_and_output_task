package com.construct2;

public class Employee1 extends Person {

	Employee1() {
		this("Rahul");
		System.out.println("Default employee");
	}

	Employee1(String name) { 
	        super(name); 
	        System.out.println("Employee: " + name); 
	    }
}

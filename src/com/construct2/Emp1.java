package com.construct2;

public class Emp1 {
	static int count = 0;
	int id;

	Emp1() { 
	        count++; 
	        id = count; 
	        System.out.println("Created employee " + id); 
	    }
}

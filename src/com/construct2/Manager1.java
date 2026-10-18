package com.construct2;

public class Manager1 extends Emp2 {
	{
		System.out.println("Manager block");
	}

	Manager1() { 
	        super(3000); 
	        System.out.println("Manager constructor"); 
	    }
}

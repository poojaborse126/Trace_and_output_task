package com.construct2;

public class B1 extends A1{
	B1() { 
	        this(5); 
	        System.out.println("B"); 
	    }

	B1(int x) { 
	        super(x); 
	        System.out.println("B " + x); 
	    }
}

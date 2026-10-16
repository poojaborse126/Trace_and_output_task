package com.construct2;

public class A {
	 static { 
	        System.out.println("A static"); 
	    } 
	 
	    { 
	        System.out.println("A block"); 
	    } 
	 
	    A() { 
	        System.out.println("A constructor"); 
	    }
}

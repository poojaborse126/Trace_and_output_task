package com.construct2;

public class B extends A{
	static { 
        System.out.println("B static"); 
    } 
 
    { 
        System.out.println("B block"); 
    } 
 
    B() { 
        System.out.println("B constructor"); 
    } 
}
	
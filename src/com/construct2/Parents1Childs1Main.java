package com.construct2;

public class Parents1Childs1Main {
	public static void main(String[] args) { 
        new Childs1(); 
        System.out.println(Parents1.x); 
 
        new Childs1(); 
        System.out.println(Childs1.x); 
    }
}

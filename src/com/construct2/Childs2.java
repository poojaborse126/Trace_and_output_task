package com.construct2;

public class Childs2 extends Parents2 { 
    static { 
        System.out.println("Child static"); 
    } 
 
    int x = 100; 
 
    { 
        x += 50; 
        System.out.println("Child block: " + x); 
    } 
    Childs2() { 
        System.out.println("Child constructor: " + x); 
    } 

}

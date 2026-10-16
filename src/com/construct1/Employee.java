package com.construct1;

//public class Employee {
//	 Employee() { 
//	        this("Riya"); 
//	        System.out.println("No-argument constructor"); 
//	    } 
//	 
//	    Employee(String name) { 
//	        System.out.println("Employee: " + name); 
//	    } 
//}


public class Employee { 
    static int count = 0; 
 
    Employee() { 
        count++; 
        System.out.println(count); 
 
 
    } 
} 
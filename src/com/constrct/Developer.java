package com.constrct;

//public class Developer extends Employee1 { 
//    String role = "Developer"; 
// 
// 
// 
//    void display() { 
//        System.out.println(role); 
//        System.out.println(super.role); 
//    } 
//
//}


public class Developer extends Employee1 { 
    Developer() { 
        salary += 10000; 
        System.out.println("Developer salary: " + salary); 
    } 
} 

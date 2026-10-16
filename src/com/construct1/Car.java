package com.construct1;

public class Car extends Vehicl { 
    int price = 800000; 
 
    void displayPrice() { 
        super.displayPrice(); 
        System.out.println("Car price: " + price); 
    }
}
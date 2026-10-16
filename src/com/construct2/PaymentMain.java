package com.construct2;

public class PaymentMain {

	public static void main(String[] args) { 
        Payment p = new Payment(2000); 
        p.pay(500); 
        p.pay("UPI"); 
    } 
}

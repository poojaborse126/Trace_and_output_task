package com.constrct;

public class Ticket {

	Ticket() {
		this(100);
		System.out.println("Default ticket");
	}

	Ticket(int price) {
		System.out.println("Price: " + price);
	}
}

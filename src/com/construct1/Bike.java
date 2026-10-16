package com.construct1;

public class Bike extends Vehicle{
	String type = "Bike";

	Bike() {
		System.out.println(this.type);
		System.out.println(super.type);
	}
}

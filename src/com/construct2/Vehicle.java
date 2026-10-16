package com.construct2;

public class Vehicle {
	int speed = getSpeed();

	int getSpeed() {
		System.out.println("Getting speed");
		return 40;
	}

	{
		speed += 10;
		System.out.println("Block speed: " + speed);
	}

	Vehicle() {
		speed += 20;
		System.out.println("Final speed: " + speed);
	}
}

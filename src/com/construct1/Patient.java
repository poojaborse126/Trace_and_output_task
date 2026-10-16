package com.construct1;

//public class Patient {
//
//	{
//		System.out.println("Patient record initialized");
//	}
//
//	Patient() {
//		System.out.println("Patient constructor");
//	}
//}

class Patient {
	int bill = 1000;

	{
		bill += 200;
		System.out.println("Block 1: " + bill);
	}

	{
		bill += 300;
		System.out.println("Block 2: " + bill);
	}

	Patient() {
		bill += 500;
		System.out.println("Final bill: " + bill);
	}
}
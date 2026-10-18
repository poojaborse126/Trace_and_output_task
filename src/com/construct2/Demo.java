package com.construct2;

public class Demo {
	Demo() {
		this(show());
		System.out.println("Default");
	}

	Demo(int x) {
		System.out.println("Parameterized: " + x);
	}

	static int show() {
		System.out.println("Method called");
		return 50;
	}
}

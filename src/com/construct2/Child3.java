package com.construct2;

public class Child3 extends Parent3 {
	int number = 20;

	{
		number = 30;
	}

	void print() {
		System.out.println(number);
	}

}

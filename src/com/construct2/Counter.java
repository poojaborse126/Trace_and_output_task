package com.construct2;

public class Counter {
	static int count = 0;
	int value = 5;

	Counter() {
		count++;
		value += count;
	}

	void display() {
		System.out.println(count + " " + value);
	}
}

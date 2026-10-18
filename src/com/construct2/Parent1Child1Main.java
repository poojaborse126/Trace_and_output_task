package com.construct2;

public class Parent1Child1Main {
	public static void main(String[] args) {
		
		Parent1 p = new Child1();

		System.out.println(((Child1) p).value);
	}
}

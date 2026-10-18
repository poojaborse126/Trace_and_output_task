package com.construct2;

public class Emp1Main {
	public static void main(String[] args) {
		Emp1[] emp= new Emp1[3];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Emp1();
		}

		System.out.println("Total: " + Emp1.count);
	}
}

package com.construct2;

public class Manager3 extends Employee3 {
	int salary = 20000;

	void display() {
		int salary = 30000;

		System.out.println(salary);
		System.out.println(this.salary);
		System.out.println(super.salary);
	}

}

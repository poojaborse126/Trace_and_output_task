package com.construct2;

public class Manager extends Emp {
	int id = 202;

	Manager(int id) {
		this.id = id;
		System.out.println(this.id);
		System.out.println(super.id);
	}

}

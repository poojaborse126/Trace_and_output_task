package com.construct2;

public class Student {

	int marks = 10;

	{
		marks *= 2;
	}

	Student(int marks) {
		this.marks += marks;
	}

	void display() {
		System.out.println(marks);
	}
}

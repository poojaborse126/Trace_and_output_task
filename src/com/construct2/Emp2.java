package com.construct2;

public class Emp2 {
	int salary = 10000;

	{
		salary += 2000;
		System.out.println("Employee block: " + salary);
	}

	Emp2(int bonus) { 
        salary += bonus; 
        System.out.println("Employee constructor: " + salary); 
    }
}

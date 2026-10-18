package com.construct2;

public class Emp3 {
	static int companyBonus;

	static {
		companyBonus = 1000;
		System.out.println("Company bonus: " + companyBonus);
	}

	int salary = 20000;

	{
		salary += 2000;
		System.out.println("Employee block: " + salary);
	}

	Emp3() { 
        this(3000); 
        System.out.println("Employee default constructor"); 
 
 
    }

	Emp3(int bonus) { 
        salary += bonus; 
        System.out.println("Employee bonus: " + salary); 
    }
}

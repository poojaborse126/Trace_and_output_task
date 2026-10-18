package com.construct2;

public class Parents2 {
	static {
		System.out.println("Parent static");
	}

	int x = 10;

	{
		x += 5;
		System.out.println("Parent block: " + x);
	}

	Parents2() { 
        this(20); 
        System.out.println("Parent default: " + x); 
    }

	Parents2(int x) { 
        this.x += x; 
        System.out.println("Parent parameterized: " + this.x); 
    }
}

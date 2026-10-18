package com.construct2;

public class Database {
	static int version = 1;

	static {
		version += 2;
		System.out.println("Database: " + version);
	}
}

package com.construct2;

public class Application extends Database{
	static {
		version *= 2;
		System.out.println("Application: " + version);
	}

	Application() {

		System.out.println("Version: " + version);
	}
}

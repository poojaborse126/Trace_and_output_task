package com.construct2;

public class Report {

	void generate() {
		System.out.println("Generating basic report");
	}
}

class SalesReport extends Report {

	@Override
	void generate() {
		super.generate();
		System.out.println("Adding sales data");
	}
}

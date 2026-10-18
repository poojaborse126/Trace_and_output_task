package com.construct2;

public class Bus extends Transport {

	Bus() {
		super();
		System.out.println("Bus ready");
	}

	@Override
	void start() {
		System.out.println("Bus starts");
	}
}

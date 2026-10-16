package com.construct1;

public class EmailNotification extends Notification {
	String message = "Email sent";

	@Override
	void send() {
		System.out.println(message);
	}

}

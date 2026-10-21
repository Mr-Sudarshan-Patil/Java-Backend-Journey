package com.question19;

public class Notification {
	public void send() {
		System.out.println("Send notification");
	}
}

class EmailNotification extends Notification {
	public void send() {
		System.out.println("Send Email Notification");
	}
}

class SMSNotification extends Notification {
	public void send() {
		System.out.println("Send SMS Notification");
	}
}
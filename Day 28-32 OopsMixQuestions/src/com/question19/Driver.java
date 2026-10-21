package com.question19;

public class Driver {

	public static void main(String[] args) {
		EmailNotification email = new EmailNotification();
		SMSNotification sms = new SMSNotification();
		
		email.send(); //Send Email Notification
		sms.send(); //Send SMS Notification

	}

}

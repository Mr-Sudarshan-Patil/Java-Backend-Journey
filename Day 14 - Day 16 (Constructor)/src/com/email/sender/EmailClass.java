package com.email.sender;

public class EmailClass {
	public void sendNotification(String str) {
		if(str.equalsIgnoreCase("sms")) {
			sentSms();
		}else if(str.equalsIgnoreCase("email")) {
			sentEmail();
		}else {
			sentWhatsapp();
		}
	}
	
	private static void sentSms() {
		System.out.println("Enter in sms");
		
		System.out.println("end in sms");
	}
	private static void sentEmail() {
		System.out.println("Enter in sentEmail() ");
		
		System.out.println("end in sentEmail() ");
	}
	private static void sentWhatsapp() {
		System.out.println("Enter in sentWhatsapp()");
		
		System.out.println("end in sentWhatsapp()");
	}
}

package com.constructor2;

public class NotificationService {
	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");
		if(_type.equalsIgnoreCase("sms"))
		{
			sendSms();
		}
		else if(_type.equalsIgnoreCase("email")){
			sendEmail();
		}
		else{
			sendWhatsApp();
				
		}
		
	}
	
	private void sendSms() {
		System.out.println("Enter in send sms");
		
		System.out.println("End sms");
	}
	
	private void sendEmail() {
		System.out.println("Enter in send email");
		
		System.out.println("End emai");
	}
	
	private void sendWhatsApp() {
		System.out.println("Enter in send whatsapp");
		
		System.out.println("End whatsapp");
	}
	
}

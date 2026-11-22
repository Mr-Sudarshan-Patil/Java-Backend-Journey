package com.email.sender;

public class SenderUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailClass obj = new EmailClass();
		obj.sendNotification("sms");
		obj.sendNotification("email");
		obj.sendNotification("whatsapp");
	}

}

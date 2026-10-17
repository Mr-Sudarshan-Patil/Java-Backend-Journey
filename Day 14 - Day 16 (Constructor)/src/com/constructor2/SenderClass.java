package com.constructor2;

public class SenderClass {

	public static void main(String[] args) {
		NotificationService obj = new NotificationService();
		obj.sendNotification("sms");
		obj.sendNotification("email");
		obj.sendNotification("whatsapp");
	}

}

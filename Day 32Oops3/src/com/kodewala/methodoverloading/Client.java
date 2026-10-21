package com.kodewala.methodoverloading;

public class Client {
	public static void main(String args[]) {
		Login log = new Login();
		
		//method 1 : call email only
		log.doLogin("mr.sudarsh@gmail.com");
		
		
		//method2: call mobile and otp directly
		log.doLogin("7875412671", 987643);
		
		//method2 : call email and password
		log.doLogin("mr.sudarsh@gmail.com", "Sp@12345");
	}
}

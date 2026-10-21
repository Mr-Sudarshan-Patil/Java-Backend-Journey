package com.kodewala.methodoverloading;

public class Login {
	
	public void doLogin(String email, String password) {
		System.out.println("Login with : " + email + " Password: " + password);
	}
	
	public void doLogin(String email) {
		System.out.println("Login with : " + email);
	}
	
	void doLogin(String mobileNo, int otp) {
		System.out.println("Login with mobilNo and otp: " + mobileNo + " " + otp);
	}
	
}

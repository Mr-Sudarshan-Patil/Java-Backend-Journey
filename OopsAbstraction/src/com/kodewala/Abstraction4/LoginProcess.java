package com.kodewala.Abstraction4;

public class LoginProcess {
	public void login(String username, String password) {
		helperMethod(username, password);
	}
	
	private void helperMethod(String username, String password) {
		if((username.trim() != "") && (password.trim() != "")) {
			System.out.println("Username: " + username);
		}else {
			System.out.println("input get empty");
		}
	}
	
}



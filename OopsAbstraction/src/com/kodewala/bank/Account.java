package com.kodewala.bank;

public class Account {
	
	public boolean openAccount(String name, String pan) {
		connectDB();
		System.out.println(validateName(name));
		System.out.println(validatePan(pan));
		return true;
	}
	
	
	//Core funcationalites 
	
	private void connectDB() {
		System.out.println("Connecting to Database");
	}
	
	private boolean validateName(String name) {
		System.out.println(name);
		if(name.length() > 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean validatePan(String pan) {
		System.out.println(pan);
		if(pan.length() == 7 ) {
			return true;
		}
		else {
			return false;
		}
	}
}

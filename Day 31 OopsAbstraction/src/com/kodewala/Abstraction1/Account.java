package com.kodewala.Abstraction1;

public class Account {
	
	public void openAccount() {  //abstract
		System.out.println("Open Account...");
		connectDB();
		validateName();
	}
	
	
	//core funcationalities Hide
	
	private void connectDB() {
		System.out.println("Connect Database... connectDB");
	}
	
	private void validateName() {
		System.out.println("Validate Name...");
	}
}

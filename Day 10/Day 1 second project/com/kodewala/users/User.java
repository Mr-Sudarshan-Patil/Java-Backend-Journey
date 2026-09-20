package com.kodewala.users;

public class User
{
	//Instance variables
	public String name = "Sudarshan Patil";
	private String password = "sf4$3sdfs";
	
	public void showUsers(){
		//Created object
		User obj = new User();
		
		//Printing details
		System.out.println("====User Details =========");
		System.out.println("Name: " + obj.name);
		System.out.println("Password: " + obj.password);
	}
}
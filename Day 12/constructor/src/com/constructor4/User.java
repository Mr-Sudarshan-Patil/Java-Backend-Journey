package com.constructor4;

class SuperUser extends Object
{
	SuperUser(){
		System.out.println("Parent constructor calling");
	}	
}
public class User extends SuperUser {
	String userName, userId, mobile;
	
	
	User(String _userName, String _userId, String _mobile)
	{
//		this();//this will call the same class constructors
		super();
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
}
//	
//	User()
//	{
//		System.out.println("Default Constructor");
//	}
//	
//	User(String _userName){
//		System.out.println("Overload constructor:" + _userName );
//	}
	
	void printDetails() {
		System.out.println("===================");
		System.out.println("User Name: " + userName);
		System.out.println("User ID: " + userId);
		System.out.println("Mobile No: " + mobile);
		System.out.println("===================");
	}
	
	void printUser() {
		System.out.println("===================");
		System.out.println("User Name: " + userName);
		System.out.println("===================");
	}
}

package com.users;

public class User 
{
	public static void printDetails() {
		System.out.println("Inside the user class");
		System.out.println("I am here : sudarshan");
		System.out.println("End the user class");
		
	   DoSomething.doSomething();
	}
}


class DoSomething
{ 
	public static void doSomething() {
		System.out.println("Do Something");
	}
}
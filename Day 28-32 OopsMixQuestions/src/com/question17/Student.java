package com.question17;

//this is well encapsulated with inheritance
public class Student {

	public static void main(String[] args) {
		Person obj = new Person();
		//obj.name = "Sagar"; 
		//Student set there name: setter is use to modify name of private variable
		obj.setName("Sudarshan Patil");
		
		//getName to access the private variable name : only for read
		System.out.println("Name: " + obj.getName());

	}

}

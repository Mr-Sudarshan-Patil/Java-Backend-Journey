package com.constructor.amzon;

public class User {
	String name, type, country;
	
	//param constructor
	User(String _name, String _type, String _country){
		this.name = _name;
		this.type = _type;
		this.country = _country;
	}
	
	User(){
		this("guest", "guest", "india");
	}
	
	void printLoginDetail() {
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Country: " + country);
	}
	
}

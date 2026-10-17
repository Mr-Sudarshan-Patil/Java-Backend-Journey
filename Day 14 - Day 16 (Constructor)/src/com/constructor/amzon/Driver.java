package com.constructor.amzon;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup def = new Signup();
		def.doSignus();
		User user = new User("Sudarshan", "Admin", "India");
		user.printLoginDetail();
	}

}

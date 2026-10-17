package com.kodewal.string;

public class StringClass {

	public static void main(String[] args) {
		String city1 = "Bangalore";
		String city2 = "Bangalore";
		String s1 = " ";
		
		System.out.println(city1.equals(city2));
		
		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		
		System.out.println(user1.equals(user2));

	}

}

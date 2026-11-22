package com.kodewala.exception4;

public class Driver {
	public static void main(String args[]) {
		System.out.println("Driver.main().. Start");
		try {
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			String address = null;
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println(address.length());
		}catch(NullPointerException e) {
			System.out.println("address is null");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("all parmeter not pass");
			e.printStackTrace();
		}catch(NumberFormatException e) {
			System.out.println("Age is number not a string");
			e.printStackTrace();
		}
		
		
		System.out.println("Driver.main().. End");
		
	}
}

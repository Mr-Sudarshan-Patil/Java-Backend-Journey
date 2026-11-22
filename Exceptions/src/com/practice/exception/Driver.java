package com.practice.exception;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver is Start");
		String email = null;

		Driver d = new Driver();
		try {
			d.validateEmail(email);
		} catch (EmailNotValidException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println("email is null");
			e.printStackTrace();
		}
		
		System.out.println("Driver is End");
	}

	public void validateEmail(String email) throws EmailNotValidException {

		if (email.endsWith("@gmail.com")) {
			System.out.println("Email is Correct");
		} else {
			throw new EmailNotValidException("User entered inccorect Email");
		}
	}

}


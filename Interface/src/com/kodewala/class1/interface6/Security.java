package com.kodewala.class1.interface6;

public class Security {
	public static void checkSecurity(Object obj) {
		if(obj instanceof Authorised) {
			System.out.println("Authoride employee , give access detail");
		}else {
			System.out.println("Non authorised employee");
		}
	}
}

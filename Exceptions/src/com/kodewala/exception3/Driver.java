package com.kodewala.exception3;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Driver.main() .. Start");
		
//		String studName = "Sudarshan";
		
		String studName = null;
		
		//if student Name is null then we handle the exception and other code smoothly run

		try {
			System.out.println(studName.length());			
		}
		catch(NullPointerException e) {
			System.out.println("Student Name is Null");
			//System.out.println(e);
			//java.lang.NullPointerException: Cannot invoke "String.length()" because "studName" is null
			e.printStackTrace();
		}
		
		
		
		System.out.println("Driver.main()....End");
	}

}

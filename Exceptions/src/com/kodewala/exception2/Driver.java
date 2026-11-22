package com.kodewala.exception2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main().. START");
		Driver d = new Driver();
		d.doSomething();
		
		System.out.println("Driver.main().. END");

	}
	
	public void doSomething() {
		System.out.println("Driver.doSomething().. START");
		String name = "Sudarshan";
		int ammount = 100;
		try {			
			System.out.println(name.length());
//			System.out.println("After length()");
			ammount = ammount /2;
			
		}
		catch(NullPointerException e) 
		{
			System.out.println("Name is Null");
//			System.out.println(e);
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception result : Ammount Cannot Divide By Zero");
			e.printStackTrace();
		}
		System.out.println("Driver.doSomething().. END");
	}

}

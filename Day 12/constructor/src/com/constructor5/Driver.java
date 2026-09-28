package com.constructor5;

public class Driver extends Test {
	
	 void callPrint() 
	 {
	        super.printTest();
	 }
	 
	public static void main(String args[]) 
	{
	
       Driver d = new Driver();
       d.callPrint();
	}
}

package com.kodewala.class2.interface1;

public class BusBooking implements IBooking 
{

	@Override
	public void book() {
		System.out.println("BusBooking.book()....book ticket");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("BusBooking.checkStatus()....checkStatus");
		
	}

	@Override
	public void cancelTicket() {
		System.out.println("BusBooking.cancelTicket()....cancelTicket");
		
	}

	//this introduce new after few years in interface and not required other class still forcefully we have to add in all the class 
	@Override
	public void autoTicketUpgrade() {
		//dummy method
		
	}
	
	
	//Calls 3 : Interface programm in java 8 introduce static method
	
	
	public void printTicket() {
			//150 lines of code
		
		
		//use that static method here
		
		IBooking.printTicket("BusBooking");
		}
	
	
}

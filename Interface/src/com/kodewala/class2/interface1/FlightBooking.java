package com.kodewala.class2.interface1;



// There one more another way to create new method to add withought default method
//To create another interface and extend the current one and that class implement the new created interface
//Example : i create ibooking2 interface and implement in class that perticulaer method required


public class FlightBooking implements IBooking{

	@Override
	public void book() {
		System.out.println("FlightBooking.book()....book ticket");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("FlightBooking.checkStatus()....checkStatus");
		
	}

	@Override
	public void cancelTicket() {
		System.out.println("FlightBooking.cancelTicket()....cancelTicket");
		
	}
	
	
	//===========================Java 7 (use dummy method)==========================
	//this introduce new after few years in interface and not required other class still forcefully we have to add in all the class 
	@Override
	public void autoTicketUpgrade() {
		//dummy method
	}
	
	
	//==========================Java 8 (use default method)==================
	
	@Override
	public void changeFilghtTicketDate() {
		System.out.println("FlightBooking.changeFlightTicketDate... ChangeFlightTicketDate");
	}
	
	
	
	
	//Calls 3 : Interface programm in java 8 introduce static method
	
	
	public void printTicket() {
		//150 lines of code
		
		//use that static method here
		
		IBooking.printTicket("FlightBooking");
	}
}

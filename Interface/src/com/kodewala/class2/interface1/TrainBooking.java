package com.kodewala.class2.interface1;

public class TrainBooking implements IBooking {
	@Override
	public void book() {
		System.out.println("TrainBooking.book()....book ticket");

	}

	@Override
	public void checkStatus() {
		System.out.println("TrainBooking.checkStatus()....checkStatus");

	}

	@Override
	public void cancelTicket() {
		System.out.println("TrainBooking.cancelTicket()....cancelTicket");

	}

	@Override
	public void autoTicketUpgrade() {
		System.out.println("TrainBooking.autoTicketUpgrade()...Upgrade the ticket");

	}
	
	
	//Calls 3 : Interface programm in java 8 introduce static method
	
	
	public void printTicket() {
			//150 lines of code
		
		//use that static method here
		
		IBooking.printTicket("TrainBooking");
		}
}

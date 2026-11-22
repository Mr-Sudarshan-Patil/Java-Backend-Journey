package com.kodewala.class2.interface1;

public class RapidoBook implements IBooking2 {

	@Override
	public void book() {
		System.out.println("RapidoBook.book()....book RapidoBook");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("RapidoBook.checkStatus()....check RapidoBook Available");
		
	}

	@Override
	public void cancelTicket() {
		System.out.println("RapidoBook.cancelTicket()....cancel RapidoBook");
		
	}

	@Override
	public void autoTicketUpgrade() {
		//dummy
		
	}

	@Override
	public void destination() {
		System.out.println("Destination : Kodewala Academy");
		
	}
	

}

package com.kodewala.class2.interface1;

public class Driver {

	public static void main(String[] args) {
		IBooking obj = new BusBooking();
		IBooking obj1 = new FlightBooking();
		IBooking obj2 = new TrainBooking();
		
		
//=============================================================BusBooking===============================================
		obj.book();
		obj.cancelTicket();
		obj.checkStatus();

		BusBooking BB = (BusBooking) obj; //downcasting because that method belong to child and currently upcasting   happen above parent type refer child object 
	//==========java 8 static method=========
		BB.printTicket();
	//=======================================
	
		
//		BusBooking.book()....book ticket
//		BusBooking.cancelTicket()....cancelTicket
//		BusBooking.checkStatus()....checkStatus

// static method output
		
//		BusBooking.printTicket... BusBooking
//============================================================BusBooking End ===========================================
		
		
		System.out.println();
		
//========================================================FlightBooking Start ================================================
		obj1.book();
		obj1.cancelTicket();
		obj1.checkStatus();
		
		//=========Java 8 Default method===========
		obj1.changeFilghtTicketDate();
		//=========================================
		
		FlightBooking FB = (FlightBooking) obj1; //downcasting because that method belong to child and currently upcasting   happen above parent type refer child object 
	//==========java 8 static method=========
		FB.printTicket();
	//=======================================
	
//		FlightBooking.book()....book ticket
//		FlightBooking.cancelTicket()....cancelTicket
//		FlightBooking.checkStatus()....checkStatus
		
//Default method output
//		FlightBooking.changeFlightTicketDate... ChangeFlightTicketDate
//Static method output
//		FlightBooking.printTicket... FlightBooking
		
//========================================================FlightBooking end ================================================
		System.out.println();
		

//========================================================TrainBooking Start ================================================
		obj2.book();
		obj2.cancelTicket();
		obj2.checkStatus();
		
		//====Java 7=========
		obj2.autoTicketUpgrade();
		//===================
		
//		TrainBooking.book()....book ticket
//		TrainBooking.cancelTicket()....cancelTicket
//		TrainBooking.checkStatus()....checkStatus
//		TrainBooking.autoTicketUpgrade()...Upgrade the ticket
		
		TrainBooking TB = (TrainBooking) obj2; //downcasting because that method belong to child and currently upcasting   happen above parent type refer child object 
	//==========java 8 static method=========
		TB.printTicket();
	//=======================================
		
//========================================================TrainBooking end ================================================	
		
		
//========================================================Rapido Booking Start ================================================
		IBooking2 RB = new RapidoBook();
		//Rapido Book
		RB.book();
		RB.cancelTicket();
		RB.checkStatus();
		RB.destination();
//		
//		RapidoBook.book()....book RapidoBook
//		RapidoBook.cancelTicket()....cancel RapidoBook
//		RapidoBook.checkStatus()....check RapidoBook Available
//		Destination : Kodewala Academy

	}

}

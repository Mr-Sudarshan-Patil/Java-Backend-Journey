package com.kodewala.class2.interface1;



/*
 * in 2020  : version 1.7 or 7
 */

public interface IBooking {
	
	public abstract void book();
	public abstract void checkStatus();
	public abstract void cancelTicket();
	
	//========================java 7=====================================
	//Java 7 after year if new method introduce
	
	public abstract void autoTicketUpgrade();
	//it will force to add in all class forcefully
	//but thins method only implemt for 1 class not for all class
	//So i have to put dummy method in all the classes and that is disadvantage of interface version 7
	//suppose ther having 100 class so i have to create dummy method in all class

	
	//==========================java 8===================================
	//In java 8 introduce default method that not need to implement forcefully in all the classes
	
	//but that is not abstract method
	
	//suppose the one method that only for filghtBooking not for other class
	//this is optional
	 public default void changeFilghtTicketDate() {
		 
		 //java 9
		 connectDB(); // connect to database
		
	}
	 
	 // There one more another way to create new method to add withought default method
	 //To create another interface and extend the current one and that class implement the new created interface
	 //Example : i create ibooking2 interface and implement in class that perticulaer method required
	 
	 
	 
	 //==================Static method========================
	 //introduce because common implemenation want every class and every class write is own method but that simllar to other
	 //e.g printTicket is common for all and it will happen dupplicsy in all the class
	 //we have to write code again and again that why java introduce static method to write commont code and utility in intereface and use in implement classes
	 
	 
	 static void printTicket(String className) {
		 System.out.println(className + ".printTicket... " + className);
	 }
	 
	 
	 //============================Java 9 (Private Method)=====================
	 //suppose i have commont functionality that is connect to database and that i want to every method so i will write code every one method and that not required to other classes 
	 //and that code visible to all here came the private method that introduce in java 9
	 
	 //Private method not access outside the class and that is the good practice because connect DB is my core functionality
	 
	 
	 private void connectDB() {
		 System.out.println("Connecting to Database");
	 }
	 
	 public default void sendNotification() {
		 connectDB();
	 }
}

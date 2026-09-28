package com.library;

public class Main {

	public static void main(String[] args) {
		
		//Default
		BookSelf book1 = new BookSelf();
		book1.printBookDetails();
		
		//Overloaded constructor
		BookSelf book = new BookSelf("java" , "Sudarshan");
		book.printBook();
		
		//Parameterized constructor;
		BookSelf book2 = new BookSelf("Java Backend", "Sudarshan Patil", 200, 160);
		book2.printBookDetails();
	}

}

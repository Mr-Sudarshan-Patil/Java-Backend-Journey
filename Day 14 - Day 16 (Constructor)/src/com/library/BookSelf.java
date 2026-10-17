//Problem 2 — Constructor Overloading (3 versions)
//Create a class Book with fields: title (String), author (String), price (double), pages (int).
//Tasks:
//1. Constructor 1: no arguments (default).
//2. Constructor 2: takes only title and author.
//3. Constructor 3: takes all four fields.
//Also do: In main(), create 3 Book objects — one using each constructor — and print each one's details.

package com.library;

public class BookSelf {
	String title;
	String author;
	double price;
	int pages;
	
	//Default constructor
	
	BookSelf(){
		
	}
	
	//overloaded constructor 
	BookSelf(String _title, String _author){
		this.title = _title;
		this.author = _author;
	}
	
	//Parameterized constructor
	BookSelf(String _title, String _author, double _price, int _pages){
		this.title = _title;
		this.author = _author;
		this.price = _price;
		this.pages = _pages;
	}
	
	//This method for overloaded constructor (only title+author)
	void printBook() {
		System.out.println("==================");
		System.out.println("Book Name: " + title);
		System.out.println("Author name: " + author);
		System.out.println("==================");
	}
	
	void printBookDetails() {
		System.out.println("==================");
		System.out.println("Book Name: " + title);
		System.out.println("Author name: " + author);
		System.out.println("Book Price: " + price+"Rs.");
		System.out.println("Book Page: " + pages+" pages.");
		System.out.println("==================");
	}
}

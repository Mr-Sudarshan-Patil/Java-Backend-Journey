package com.kodewala.interface3;
//programm 1 comment
//@FunctionalInterface  // this keyword is optional : but its safer than ignore it make some restrictions to make it functional interface (single abstract method) sam

//programm 2 comment when extends the parent
//@FunctionalInterface // IAccount is not a functional interface
public interface IAccount extends IAccountMgmt{ 

//programm 2 comment
//because when we extends IAccountMgmt parent class then that abstract method also reliy in I Account 
//if we remove functionl Interface then keyword then they ignore error and tell that normal interface
	
	
	//Programm  1
	//only one abstract method in function Interface
	//abstract method: OpenAccount() //without body
	void openAccount();
	
	// void openAccount() {}; // gives error because not abstract method
	
	//this is not abstract method
	default void closeAccount() {
		
	}
	
}

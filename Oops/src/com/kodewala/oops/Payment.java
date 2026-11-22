package com.kodewala.oops;
//encapsulation: Encapsulation means wrapping data (variables) and methods into a single class and protecting data from direct access by making variables private.
//A single Payment class can manage payment-related operations like credit, debit, and balance checking instead of managing them separately.

//control access means minus balance not allow to creadint 
// e.g if(_creditAmmount > 0) 
public class Payment {
	private int ammount; // with the help of encapsulation with 
	
	Payment(int _ammount){
		super();
		this.ammount = _ammount;
	}
	
	//setter : modify the data
	public void doDebit(int _ammount) {
		ammount = ammount - _ammount;
	}
	
	public void doCredit(int _ammount) {
		ammount = ammount + _ammount;
	}

	
	
	//getter : read the data
	
	public int getAmmount() {
		return ammount;
	}

	
}

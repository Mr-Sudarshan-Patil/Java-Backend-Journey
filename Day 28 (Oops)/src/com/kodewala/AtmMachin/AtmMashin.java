package com.kodewala.AtmMachin;
//ATM System: Create an ATM class with a private pin variable. Allow the user to change the PIN only when the old PIN is correct.
public class AtmMashin {
	private String pin;
	
	 AtmMashin(String _pin){
		this.pin = _pin;
	}
	
	//setter : to set pin
	
	public void setPin(String newPin) {
		this.pin = newPin;
	}
	
	//getter
	
	public String getPin() {
		return pin;
	}
}

package com.inheritance.multilevel1;

//15. Device, Phone and Smartphone
//Create Device with powerOn(), Phone with call() and Smartphone with browseInternet(). Call
//all three methods using a Smartphone object.

class Device {
	public void powerOn() {
		System.out.println("Power On");
	}
}

class Phone extends Device{
	public void call() {
		System.out.println("Call");
	}
 }

class SmartPhone extends Phone
{
	public void browseInternet() {
		System.out.println("Browse the Internet");
	}
}

public class Driver {

	public static void main(String[] args) {
		//Object Create of SmartPhone
		SmartPhone obj = new SmartPhone();
		obj.powerOn();
		obj.call();
		obj.browseInternet();
		
	}

}

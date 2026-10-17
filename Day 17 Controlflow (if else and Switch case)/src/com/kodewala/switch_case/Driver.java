package com.kodewala.switch_case;

public class Driver {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		int day = Integer.parseInt(args[0]);
		driver.identifyDay(day);
	}
	
	public void identifyDay(int number) {
		switch(number) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wen");
			break;
		case 4:
			System.out.println("Thus");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid 0-7");
			break;
		}
	}

}

package com.kodewala.AtmMachin;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		AtmMashin ap = new AtmMashin("3453");
		Scanner sc = new Scanner(System.in);
		
		String oldPin = ap.getPin();
		System.out.println("Pin is: " + oldPin);
		
		int i = 1; 
		boolean isCorrectPin = false;
		while(i<4) {
			System.out.println("Enter pin");
			String enterPin = sc.nextLine();
			if(oldPin.equals(enterPin)) {
				System.out.println("Password match");
				isCorrectPin = true;
				break;
			}else {
				isCorrectPin = false;
			}
			i++;
		}
		
		if(isCorrectPin==false){
			System.out.println("Set new pin: ");
			String newPin = sc.nextLine();
			ap.setPin(newPin);
			System.out.println(ap.getPin());
		}
	}

}

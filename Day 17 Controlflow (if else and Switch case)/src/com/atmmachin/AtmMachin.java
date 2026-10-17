package com.atmmachin;

import java.util.Scanner;
public class AtmMachin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AccountDetail acc1 = new AccountDetail("Sudarshan Patil", "39273243034", 25000);
		acc1.printAccountDetails();
		
		printScreen();
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		while(choice != 4) {
			switch(choice){
			case 1:
				System.out.println("=================================");
				System.out.println("Your Total Balance is : " + acc1.balance);
				System.out.println("=================================");
				
				printScreen();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				break;
				
			case 2:
				
				System.out.println("=================================");
				System.out.println("Please Enter Deposit Ammount: ");
				int depositAmmount = sc.nextInt();
				if(depositAmmount == 0) {
					System.out.println("Invalid Transcation, you entered Zero");
				}else {
					acc1.balance += depositAmmount;
					acc1.printAccountDetails();
				}
				System.out.println("=================================");
				
				
				printScreen();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				break;
			case 3:
				
				System.out.println("=================================");
				System.out.println("Please Enter Deposit Ammount: ");
				int withdrawAmmount = sc.nextInt();
				if(withdrawAmmount > acc1.balance) {
					System.out.println("Insufficient Balance");
				}else {
					acc1.balance -= withdrawAmmount;
					acc1.printAccountDetails();
				}
				System.out.println("=================================");
				
				printScreen();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				break;
			default:
				System.out.println("Invalid Input - Invalid Transaction");
				printScreen();
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				break;
			}
		}
		
	}
	
	public static void printScreen() {
		System.out.println("======================");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		System.out.println("======================");
	}
}

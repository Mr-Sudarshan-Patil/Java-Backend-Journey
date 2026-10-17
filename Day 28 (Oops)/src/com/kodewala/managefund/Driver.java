package com.kodewala.managefund;

public class Driver {

	public static void main(String[] args) {
		FundTransfer obj = new FundTransfer("Sudarshan", "343523234", 200);
		//funder transfer ammount in below method
		obj.doDebit(23);
		obj.printDetail();
		System.out.print("Remaning balance : " + obj.getBalance());

	}

}

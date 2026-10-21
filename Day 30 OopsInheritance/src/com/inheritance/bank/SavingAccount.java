package com.inheritance.bank;

public class SavingAccount extends Account {
	public void openSavingAccount(String name, String address, String type) {
		accountOpen(name, address, type);
	}
}

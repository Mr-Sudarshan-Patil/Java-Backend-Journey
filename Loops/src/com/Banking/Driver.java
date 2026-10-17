package com.Banking;

public class Driver {

	public static void main(String[] args) {
		AccountClass user1 = new AccountClass("Sudarshan", "2342342", 200);
		AccountClass user2 = new AccountClass("Ravi", "23433442342", 2100);
		AccountClass user3 = new AccountClass("chandan", "672342342", 500);
		AccountClass user4 = new AccountClass("Aadarsh", "8972342342", 3500);

		AccountClass users[] = new AccountClass[4];
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		//add new to git
		
		for(int i=0; i<users.length; i++) {
			if(users[i].balance > 2000) {
				System.out.println("==========================================");
				System.out.println("Account Holder Name: " + users[i].accountHolder);
				System.out.println("Account Number: " + users[i].accountNo);
				System.out.println("==========================================");
			}
		}
		
	}

}

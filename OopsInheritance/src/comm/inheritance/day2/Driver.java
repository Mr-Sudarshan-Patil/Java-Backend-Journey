package comm.inheritance.day2;

class Account {
	public void openAccount(String userId) {
		System.out.println("Open Account : Normal");
	}
}

class SavingAccount extends Account {
	
	@Override
	public void openAccount(String userId) {
		System.out.println("Open Account Saving Account");
	}
}

class SrAccount extends SavingAccount{
	
	@Override
	public void openAccount(String userId) {
		System.out.println("Open Account Sr Account");
	}
}

class PainsionAccount extends SrAccount{
	
	@Override
	public void openAccount(String userId) {
		System.out.println("Open Account painsion Account");
	}
}

public class Driver {
	public static void main(String args[]) {
		PainsionAccount newAc = new PainsionAccount();
		newAc.openAccount("id334");
	}
}

package class3.com.exception;

public class Driver {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		int result = d.calDiscount(100, 10);
		System.out.println(result);
	}
	
	public int calDiscount(int ammount, int disc) {
		
		int finalAmmount = 0;
		
		try {
			finalAmmount = ammount - (ammount * disc / 100);
			return finalAmmount;
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			finalAmmount = 110;
			System.out.println("I am inside finally block");
		}
		return finalAmmount;
		
	}

}

class Driver
{
	public static void main(String arsg[])
	{
		System.out.println("Start main method in driver class");
		
		
		//creating object to call public method in OrderManagement
		OrderManagement om = new OrderManagement();
		om.placeOrder("Asus Laptop");
		
		
		
		System.out.println("e main method in driver class");
	}
}

/*
Start main method in driver class
Entering placeOrder method
Order placed : Asus Laptop
Ammount: 2000   // this is private till access because it will access permission in own class and ther we accessing in public method and that public method we are calling inside 
End placeOrder method
e main method in driver class
*/


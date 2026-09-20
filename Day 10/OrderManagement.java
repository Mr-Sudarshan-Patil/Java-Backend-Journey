class OrderManagement
{
	//Trying with public modifier
	private int ammount = 2000;
	
	public void placeOrder(String itemName)
	{
		System.out.println("Entering placeOrder method");
		
		System.out.println("Order placed : " + itemName);
		
		System.out.println("Ammount: " + ammount);  // Ammount: 2000  
	
		System.out.println("End placeOrder method");
	}
	

	//Tring with private class 
	
	/*
	private void placeOrder(String itemName)
	{
		System.out.println("Entering placeOrder method");
		
		System.out.println("Order placed : " + itemName);
		
		System.out.println("End placeOrder method");
	}
	
	*/
	
	//error : Driver.java:10: error: placeOrder(String) has private access in OrderManagement
    //            om.placeOrder("Asus Laptop");
	
}
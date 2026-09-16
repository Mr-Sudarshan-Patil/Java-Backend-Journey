/*

Use case : 
-	Zepto/amazon  get free delivery if order value is more than 500.
-	Same day delivery if you are amazon prime user
-	3% transaction changes if transaction amount is more than 2000

	-	Zepto/amazon  get free delivery if order value is more than 500.
	    - 500 above means every one can access it
		-- every one having instance object 
			- name
			- adreeS
			- orderid
			- also discount 
			-non static method to print all details 
*/

class ZeptoOrder
{
	//Instance variable
	
	String name;
	String address;
	int purcaseAmmount;
	
	//Static Variable
	static int orderId;
	
	
	ZeptoOrder(){
		orderId++;
	}
	
	public static void main(String args[]){
		
		//User 1
		ZeptoOrder user1 = new ZeptoOrder();
		user1.name = "Sudarshan Patil";
		user1.address = "BTM, Stage 2";
		user1.purcaseAmmount = 650;
		user1.printDetails();
		
		
		//User 2
		ZeptoOrder user2 = new ZeptoOrder();
		user2.name = "Ravi Patil";
		user2.address = "BTM, Stage 2";
		user2.purcaseAmmount = 450;
		user2.printDetails();
		
	}
	
	void printDetails(){
	    System.out.println("===========Order details===========");
		System.out.println("Order Id: " + orderId);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		if(purcaseAmmount > 500){
			System.out.println("Free Delivery To Your Product");
		}else{
			System.out.println("Free Delivery Not Available");
		}
	}
}



/*

===========Order details===========
Order Id: 1
Name: Sudarshan Patil
Address: BTM, Stage 2
Free Delivery To Your Product
===========Order details===========
Order Id: 2
Name: Ravi Patil
Address: BTM, Stage 2
Free Delivery Not Available

*/
public class ProductAvailability
{
	public static void main(String arr[])
	{
		String productName = arr[0];
		float price = Float.parseFloat(arr[1]);
		boolean availability = Boolean.parseBoolean(arr[2]);
		
		System.out.println("============================");
		System.out.println("=======Product Check========");
		System.out.println("============================");
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		if(availability == true)
		{
			System.out.println("Status: Product is Available");
		}
		else
		{
			System.out.println("Status: Product is Not Available");
		}
		System.out.println("============================");
		
	}
}
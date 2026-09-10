public class ShoppingBill
{
	public static void main(String arr[])
	{
		String productName = arr[0];
		int price = Integer.parseInt(arr[1]);
		byte quantity = Byte.parseByte(arr[2]);
		
		System.out.println("=====================================");
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("====================================");
	}
}
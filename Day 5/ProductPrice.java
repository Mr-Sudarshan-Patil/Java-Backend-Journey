public class ProductPrice
{
	public static void main(String args[])
	{
		String productName = args[0];
		int price = Integer.parseInt(args[1]);
		byte quantity = Byte.parseByte(args[2]);
		
		System.out.println("Product Name: " + productName);
		System.out.println("Price per item : " + price);
		System.out.println("Quantity : " + quantity);
		
		int tax = price * 18 / 100;
		System.out.println("Your tax is 18% on price of product : " + tax);
		System.out.println("Your toal price after tax : " + (price + tax));
	}
}
public class MovieTicket
{
	public static void main(String args[])
	{
		String movieName = args[0];
		byte age = Byte.parseByte(args[1]);
		int ticketPrice = Integer.parseInt(args[2]);
		
		System.out.println("Movie Name: " + movieName);
		System.out.println("Age is : " + age);
		System.out.println("Original Ticket Price : " + ticketPrice);
		
		if(age < 10) {
			
			int discount = (ticketPrice * 10) / 100;
			System.out.println("You got discount 10% on ticketPrice: " + discount);
			System.out.println("After getting discount, Your ticket price is : " + (ticketPrice-discount));
		}else{
			System.out.println("No Discount Available");
		}
	}
}
public class MobileData
{
	public static void main(String args[])
	{
		String userName = args[0];
		float dailyUsageGB = Float.parseFloat(args[1]);
		byte days = Byte.parseByte(args[2]);
		float totalDataUse = Float.parseFloat(args[3]);
		
		System.out.println("Username: " + userName);
		System.out.println("Daily Usages in GB: " + dailyUsageGB);
		System.out.println("Days: " + days);
		System.out.println("Total Data Use: " + totalDataUse);
		
		if(totalDataUse > 300){
			System.out.println("Your Monthly Data limit reached");
		}
		else
		{
			System.out.println("Your Monthly Data Balance Remaining: " + (300 - totalDataUse));
		}
	}
}
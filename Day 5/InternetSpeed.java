public class InternetSpeed
{
	public static void main(String args[])
	{
		String provider = args[0];
		int downloadSpeed = Integer.parseInt(args[1]);
		int uploadSpeed = Integer.parseInt(args[2]);
		int latency = Integer.parseInt(args[3]);
		
		System.out.println("Your Internet Provide Is: " + provider);
		System.out.println("Download Speed Is : " + downloadSpeed);
		System.out.println("Upload Speed Is : " + uploadSpeed);
		System.out.println("Latency Is : " + latency);
		
		if(downloadSpeed > 60)
		{
			System.out.println("Excellent");
		}
		else if(downloadSpeed>40 && downloadSpeed<59)
		{
			System.out.println("Good");
		}
		else if(downloadSpeed>30 && downloadSpeed<39)
		{
			System.out.println("Average");
		}
		else
		{
			System.out.println("Poor");
		}
		
	}
}
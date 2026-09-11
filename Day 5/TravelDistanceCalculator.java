public class TravelDistanceCalculator
{
	public static void main(String args[])
	{
		String destination = args[0];
		int distance = Integer.parseInt(args[1]);
		int speed = Integer.parseInt(args[2]);
		System.out.println("Destination : " + destination);
		System.out.println("Distance : " + distance);
		System.out.println("Speed : " + speed);
	}
}
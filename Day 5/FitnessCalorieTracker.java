public class FitnessCalorieTracker
{
	public static void main(String args[])
	{
		String name = args[0];
		int steps = Integer.parseInt(args[1]);
		int caloriesBurned = Integer.parseInt(args[2]);
		int exerciseHourse = Integer.parseInt(args[3]);
		System.out.println("Name: " + name);
		System.out.println("Steps you run: " + steps);
		System.out.println("Calories Burned Today: " + caloriesBurned);
		System.out.println("You have excercise " + exerciseHourse + " Hours Today");
		
		if(steps > 8000)
		{
			System.out.println("Target Reached");
		}else
		{
			System.out.println("Your remaining step to target: " + (8000 - steps));
		}
		
	}
}
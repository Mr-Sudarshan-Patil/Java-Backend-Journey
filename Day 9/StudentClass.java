class StudentClass
{
	public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String college = args[2];
		
		//Calling method
		StudentClass.printDetails(name,age,college);
	
	}
	
	//Create a method: it is printing the data about student
	
	static void printDetails(String name, int age, String college)
	{
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("College : " + college);
	}
}

/*
Name is: Sudarshan
Age is: 27
College : R C Patel Institute of Technology
*/
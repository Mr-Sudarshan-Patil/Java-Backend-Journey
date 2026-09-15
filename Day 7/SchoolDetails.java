/*
 Student Details

Create a Student class with:

name → instance variable
age → instance variable
marks → instance variable

schoolName → static variable

Create a method displayStudent() that prints all the details.

Create 2 student objects and observe which values are shared and which are different.
*/

class SchoolDetails
{
	//Every Student has own identities 
	private String name; //instance variable
	byte age;  //instance variable
	int rollNo; //instance variable
	int marks; //instatnce variable
	
	
	//Static variable
	static String schoolName = "Kodewala School"; //common for all students, same value carry forword to entier class
	
	public static void main(String args[])
	{
		System.out.println("\n===========================\n");
		System.out.println("School Name is: " + SchoolDetails.schoolName);
		System.out.println("\n===========================\n");
		
		System.out.println("\n===========================\n");
		
		//Student 1
		SchoolDetails student1 = new SchoolDetails();
		student1.name = "Sudarshan Patil";
		student1.age = 27;
		student1.rollNo = 55;
		student1.marks = 92;
		student1.displayStudent();
		
		System.out.println("\n===========================\n");
		
		//Student 2
		SchoolDetails student2 = new SchoolDetails();
		student2.name = "Sagar Patil";
		student2.age = 27;
		student2.rollNo = 56;
		student2.marks = 86;
		student2.displayStudent();
		
		System.out.println("\n===========================\n");
	}
	
	void displayStudent()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll No: " + rollNo);
	}
}
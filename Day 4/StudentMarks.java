public class StudentMarks
{
	public static void main(String args[])
	{
		String studentName = args[0];
		int marksSub1 = Integer.parseInt(args[1]);
		int marksSub2 = Integer.parseInt(args[2]);
		int marksSub3 = Integer.parseInt(args[3]);
		
		System.out.println("===================================");
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Science: " + marksSub1);
		System.out.println("Math: " + marksSub2);
		System.out.println("English: " + marksSub3);
		
		float totalMarks = marksSub1 + marksSub2 + marksSub3;
		
		System.out.println("Total Marks of Science + Math + English is : " + totalMarks);
		
		float Average = (marksSub1 + marksSub2 + marksSub3) / 3;

		System.out.println("Average is: " + Average);
		System.out.println("=====================================");
		
	}
}	
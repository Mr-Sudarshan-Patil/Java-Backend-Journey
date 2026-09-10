public class EmployeeSalary
{
	public static void main(String arr[])
	{
		String employeeName = arr[0];
		float salary = Float.parseFloat(arr[1]);
		int bonus = Integer.parseInt(arr[2]);
		
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Salary: " + salary + "Rs.");
		System.out.println("Bonus is: " + bonus);
		System.out.println("========================================");
		System.out.println("Your Total Sallary is: " + (salary + bonus));
		System.out.println("=========================================");
		
	}
}
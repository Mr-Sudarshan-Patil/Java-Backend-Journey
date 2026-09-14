class ItEmployeeProgramme
{
	public static void main(String args[]){
		
		int empId = Integer.parseInt(args[0]);
		String department = args[1];
		
		switch(empId){
			case 1: 
				System.out.println("Chandan Shaw");
				break;
			case 2: 
				System.out.println("Ravi Bhaishya");
				break;
			case 3:
				System.out.println("Sudarshan Patil");
				switch(department){
					case "IT":
						System.out.println("IT Department");
						break;
					case "Sales":
						System.out.println("Sales Department");
						break;
					case "Testing":
						System.out.println("Testing Department");
						break;
				}
				break;
			case 4:
				System.out.println("Sagar Patil");
				break;
			default:
				System.out.println("Invalid Employee ID: ");
				break;
		}
		
		
	}
}
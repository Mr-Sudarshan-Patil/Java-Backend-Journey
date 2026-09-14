class OptimizeEmployeeCode
{
	public static void main(String args[]){
		int empId = Integer.parseInt(args[0]);
		String department = args[1];
	
		switch(empId){
			case 1 -> System.out.println("Ravi Bhai");
			case 2 -> System.out.println("Chandan Bhai");
			case 3 -> {
					System.out.println("Sudarshan Patil");
					switch(department){
						case "IT" -> System.out.println("IT Department");
						case "Sales" -> System.out.println("Sales Department");
						case "Testing" -> System.out.println("Testing Department");
						default -> System.out.println("Invalid department");
					}
				}
			default -> System.out.println("Invalid Input");
		}
	}
}
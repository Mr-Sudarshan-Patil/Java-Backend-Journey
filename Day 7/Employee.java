class Employee {
    // instance variable
    String name;

    // static variable
    static String company = "ABC Pvt Ltd";
	static int empObjectCount = 0;
	
	Employee(){
		empObjectCount +=1;
	}
	
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		emp1.name = "Sudarshan Patil";
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.name = "Chandankumar Shaw";
		emp2.display();
		
		Employee emp3 = new Employee();
		emp3.name = "Ravi Baishya";
		emp3.display();
		
		
	}
	
	
    // Non-static method
    void display() 
	{
		Employee e = new Employee(); //use to access stativ variable is non static method
        
		
		// local variable
        int bonus = 5000;
		System.out.println("id: " + e.empObjectCount);
		// print name, company and bonus
		System.out.println("Employee Name : "  + name);  // instance variable
		System.out.println("Company Name: " + e.company); //static variable access with class object
		System.out.println("Bonus: " + bonus); // local variable for this method
        
    }
}
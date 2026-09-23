class StudentInfo {
    public static void main(String[] args) {

		//Calling static method
        collegeName();

		//calling non static method with creating object
        Student s = new Student();
        s.studentName();

    }
	
	//Creating Static Method
	static void collegeName() {
        System.out.println("RCPIT College");
    }
	
	//Creating Non Static Method
    void studentName() {
        System.out.println("Student: Sudarshan Patil");
    }
}
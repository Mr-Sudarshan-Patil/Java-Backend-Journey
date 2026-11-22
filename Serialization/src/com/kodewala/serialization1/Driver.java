package com.kodewala.serialization1;

import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException {
		//Serialization
		Student stud1 = new Student(1, "Sudarshan Patil", 45.6);
		FileOutputStream fio = new FileOutputStream("student.ser");
		ObjectOutputStream ois = new ObjectOutputStream(fio);
		ois.writeObject(stud1);
		
		System.out.println("Done");
		
		fio.close();
		ois.close();

	}

}

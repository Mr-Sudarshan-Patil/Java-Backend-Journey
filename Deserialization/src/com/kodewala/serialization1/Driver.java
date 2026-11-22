package com.kodewala.serialization1;

import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "/home/sudarshan-patil/snap/eclipse/common/eclipse-workspace/Serialization/student.ser/";
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		
		System.out.println(student.getName());

	}

}

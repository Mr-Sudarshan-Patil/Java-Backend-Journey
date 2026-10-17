package com.Array1;
import java.util.Arrays;
public class Driver {

	public static void main(String[] args) {
		
		User user1 = new User("Sudarshan", "7895464456");
		User user2 = new User("Ravi", "5634534523");
		User user3 = new User("Chandan", "6767678678567");
		
		User users[] = new User[3];
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		System.out.println(Arrays.toString(users));
		System.out.println(users[0]);
		System.out.println(users[1]);
		System.out.println(users[2]);
	}

}

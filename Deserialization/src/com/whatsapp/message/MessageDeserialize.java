package com.whatsapp.message;

import java.io.*;

public class MessageDeserialize {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		String path = "/home/sudarshan-patil/snap/eclipse/common/eclipse-workspace/Serialization/message.ser/";
		FileInputStream fio = new FileInputStream(path);
		ObjectInputStream obs = new ObjectInputStream(fio);
		Message message = (Message) obs.readObject();

		fio.close();
		obs.close();
		String result = message.getMessage();
		
		System.out.println("Deserialize message : " + result);
		System.out.println("Message Id: " + message.getMessageId());
	}
}

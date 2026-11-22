package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		MessageSerialize serialize = new MessageSerialize();
		Message message = new Message("Msg1", "Testing..");
		serialize.serializeMessage(message);
		System.out.println("Done");
	}

}

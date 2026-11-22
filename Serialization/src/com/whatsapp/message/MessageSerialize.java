package com.whatsapp.message;

import java.io.*;

public class MessageSerialize {
	public void serializeMessage(Message message) throws IOException {
		FileOutputStream fio = new FileOutputStream("message.ser");
		ObjectOutputStream obs = new ObjectOutputStream(fio);
		obs.writeObject(message);
		fio.close();
		obs.close();
	}

}

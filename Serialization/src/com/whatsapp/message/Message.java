package com.whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	private transient String messageId;
	private String message;
	
	public Message(String messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}

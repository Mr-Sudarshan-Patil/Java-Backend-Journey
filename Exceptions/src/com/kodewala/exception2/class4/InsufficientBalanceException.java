package com.kodewala.exception2.class4;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

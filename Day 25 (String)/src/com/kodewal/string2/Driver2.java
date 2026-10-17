package com.kodewal.string2;

public class Driver2 {
	String s3;
	Driver2(String s3){
		this.s3 = s3;
	}
	String intern() {
		return s3.intern(); // scp reference
	}
}

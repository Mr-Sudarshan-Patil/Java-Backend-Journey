package com.kodewal.string5;

public class ValidString {
	public static void main(String args[]) {
		String str = "(){}[]";
		boolean result = isValid(str);
		System.out.println("String valid or not: " + result);
	}
	
	public static boolean isValid(String s) {
		boolean isValid = true;
		for (int i = 0; i < s.length() / 2; i++) {
			int start = passAscii(s.charAt(i));
			int end = passAscii(s.charAt(s.length() - i - 1));
			int operation = end - start;
			if ((operation == 1 || operation ==2)) {
				isValid = true;
			} else {
				isValid = false;
				break;
			}
		}

		return isValid;
	}

	static int passAscii(char s) {
		int av = (int) s;
		return av;
	}
}

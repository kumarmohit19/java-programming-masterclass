package com.problem;

import java.util.Scanner;

class InvalidMessageException extends Exception {
	public InvalidMessageException(String message) {
		super(message);
	}
}

class Encrypter {
	public static String encryptMessage(String message) throws InvalidMessageException {
		boolean status = Validator.validate(message);
		if (status) {
			message = message.toLowerCase();
			StringBuffer str = new StringBuffer(message);
			return str.reverse().toString();
		} else {
			// return "InvalidMessageException";
			throw new InvalidMessageException("Try again with valid message");
		}
	}
}

class Validator {
	public static boolean validate(String message) {
		return message.matches("[A-Za-z0-9 ]+");
	}
}

public class Solution {
	private static final Scanner INPUT_READER = new Scanner(System.in);

	public static void main(String[] args) {
		String message = INPUT_READER.nextLine();

		try {
			String encrypted_message = Encrypter.encryptMessage(message);
			if (!encrypted_message.startsWith("InvalidMessageException"))
				System.out.println(encrypted_message);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
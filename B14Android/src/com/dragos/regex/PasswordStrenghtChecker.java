package com.dragos.regex;

public class PasswordStrenghtChecker {
	
	public static String checkPasswordStrength(String password) {
		String msg = "Your Password is too weak!";
		int strength = 0;
		String lowerCaseCheck = ".*[a-z]+.*";
		String upperCaseCheck = ".*[A-Z].*";
		String numberExistenceCheck = ".*[0-9]+.*";
		String symbolExistenceCheck = ".*[!.#$@_+,?-]+.*";
		String validPassword = "[A-Za-z0-9!.#$@_+,?-]{8,50}";
		// checking valid characters and length for password
		if (password.matches(validPassword)) {
			// checking for existence of upper case letter
			if (password.matches(upperCaseCheck))
			strength += 4;
			//checking for existence of lower case letter
				if (password.matches(lowerCaseCheck))
				strength += 4;
				// checking for existence of number
				if (password.matches(numberExistenceCheck))
				strength += 4;
				// checking for existence of symbol
				if (password.matches(symbolExistenceCheck))
				strength += 4;
				if (strength >= 16) {
				msg = "Your Password is Very Strong!";
				} else if (strength >= 12) {
				msg = "Your Password is Strong!";
				} else if (strength >= 8) {
				msg = "Your Password is Normal!";
				} else if (strength >= 4) {
				msg = "Your Password is weak!";
				} else {
				msg = "Your Password is too weak!";
			}
		}
		return msg;
	}

}

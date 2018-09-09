package com.dragos.regex;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		
		
		
		// Your Password is too weak!
		System.out.println(PasswordStrenghtChecker.checkPasswordStrength("1234"));
		// Your Password is Normal!
		System.out.println(PasswordStrenghtChecker.checkPasswordStrength("OXUS201234"));
		// Your Password is Strong!
		System.out.println(PasswordStrenghtChecker.checkPasswordStrength("OXUS20_2014"));
		// Your Password is Very Strong!
		System.out.println(PasswordStrenghtChecker.checkPasswordStrength("Oxus20_2014"));

	}

	
}

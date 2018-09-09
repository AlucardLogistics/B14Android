package com.dragos.regex;

import java.util.regex.Pattern;

public class UsernameValidator {
	
	private Pattern pattern;
	private Pattern pattern1;
	private Pattern pattern2;
	private Pattern pattern3;
	
	private static final String USERNAME_PATTERN = "^[a-z0-9._\\s-]{3,15}$";
	private static final String MY_PATTERN = "(?i)I study [\\w+\\s]{1,}";
	private static final String SSN_PATTERN = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	private static final String PASSWORD_PATTERN =
			"((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})";
	
	public UsernameValidator() {
		pattern = Pattern.compile(USERNAME_PATTERN);
		pattern1 = Pattern.compile(MY_PATTERN);
		pattern2 = Pattern.compile(SSN_PATTERN);
		pattern2 = Pattern.compile(PASSWORD_PATTERN);		
		System.out.println("Username Validator: contructor");
	}
	
	public boolean validate(final String username) {
		//System.out.println("UsrnameValidator: validate method");
		return pattern.matcher(username).matches();		
	}
	
	public boolean validateMyPatter(final String patt) {
		//System.out.println("UsrnameValidator: validate method");
		return pattern1.matcher(patt).matches();		
	}
	
	public boolean validateSSN(final String ssn) {
		//System.out.println("UsrnameValidator: validate method");
		return pattern2.matcher(ssn).matches();		
	}
	
	public boolean validatePassword(final String pass) {
		//System.out.println("UsrnameValidator: validate method");
		return pattern2.matcher(pass).matches();		
	}

}

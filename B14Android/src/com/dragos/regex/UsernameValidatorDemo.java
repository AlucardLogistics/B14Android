package com.dragos.regex;

public class UsernameValidatorDemo {
	
	public static void main(String[] args) {
		
		String[] test = {"154-85-8754", "154-854-8745"};
		
		UsernameValidator validator = new UsernameValidator();
		
		
		System.out.println(validator.validatePassword("Oxus20.2014")); // true
		System.out.println(validator.validatePassword("Oxus.20_14")); // true
		System.out.println(validator.validatePassword("OXUS20@Herat")); // true
		System.out.println(validator.validatePassword("Oxus20@2014")); // true
		
		System.out.println(validator.validatePassword("Oxus202014")); // false
		System.out.println(validator.validatePassword("Oxus20")); // false
		System.out.println(validator.validatePassword("Oxus@20")); // false
		System.out.println(validator.validatePassword("Oxus20@")); // false
		
		
		//System.out.println(validator.validateMyPatter("I study stuff and more stuff"));
		
//		System.out.println(validator.validateSSN(test[0]));//true
//		System.out.println(validator.validateSSN(test[1]));//false
		
//		System.out.println(validator.validate("absherzad")); //true
//		System.out.println(validator.validate("ab.sherzad")); //true
//		System.out.println(validator.validate("ab-sherzad")); //true
//		System.out.println(validator.validate("ab_sherzad")); //true
//		System.out.println(validator.validate("oxus20")); //true
//		System.out.println(validator.validate("ars")); //true
//		System.out.println(validator.validate("Absherzad")); //false
//		System.out.println(validator.validate("ab sherzad")); //false
//		System.out.println(validator.validate("ab")); //false
//		System.out.println(validator.validate("abdulrahmansherzad")); //false
		}

}

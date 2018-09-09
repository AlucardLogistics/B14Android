package com.dragos.string;

public class SubString {

	public static void main(String[] args) {
		
		String s = " Best String ever!";
		System.out.println(s.substring(6));
		System.out.println(s.substring(0,  6));
		System.out.println(s.trim());
		System.out.println(s.intern());
		String sReplace = s.replace("ever", "never");
		System.out.println(sReplace);
		System.out.println(s.compareTo(sReplace));

	}

}

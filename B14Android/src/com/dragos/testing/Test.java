package com.dragos.testing;

import java.util.Arrays;

import test.main;

public class Test {
	//find duplicates
	public static void main(String[] args) {
		
		String test = "abcdab";
		int n = test.length();
		char[] duplicates = new char[n];
		
		
		for(int i =0;i<n;i++){ //first iteration
			char dup = test.charAt(i);
			//System.out.println("dup " + dup);
			for(int j=i; j<n-1;j++) {	
				if(dup ==  test.charAt(j+1)) {
					duplicates[j] = dup;
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(duplicates));
		
	}

}

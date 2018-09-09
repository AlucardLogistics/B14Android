package com.dragos.assigments;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Assigments4Test {
	
	@Test
	public void sortStringsTest() {
		System.out.println("Sort Strings Testing");
		String[] test = {"cad","abc","a","c","191","1","90"};
		String[] expectedResult = {"1","191","90","a","abc","c","cad"};
		String[] result = Assigments4.sortStringsLong(test);
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void sortZeroTest() {
		System.out.println("Sort Zero Testing");
		int[] test = {0,2,0,1,0,2,1,2,1,0};
		int[] expectedResult = {2,1,2,1,2,1,0,0,0,0};
		int[] result = Assigments4.sortZero(test);
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
    public void testAdd() {
       //count the number of test cases
       System.out.println("No of Test Case = "+ 2);
 		
       //test getName 
       String name = "Assigments Four Class";
       System.out.println("Test Case Name = "+ name);
    }

}

package com.dragos.assigments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssigmentsTest {
	
	

	@Test
	public void fibTest() {
		int actual = Assigments.fib(9);
		int expected = 34;
		assertEquals(expected, actual);
	}
	
	@Test
	public void primeTest() {
		boolean actual = Assigments.isPrime(11);
		assertTrue("Test passed", actual);
		
	}
	
	@Test
	public void palindromeTest() {
	 	assertTrue("Test Passed", Assigments.isPalindrome(141));
	 	assertFalse(Assigments.isPalindrome(123));
		
	}
	
	@Test
	public void factorialTest() {
		int actual = Assigments.factorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}
	
	@Test
	public void armstrongTest() {
	 	assertTrue("Test Passed", Assigments.isArmstrongNumber(371));
	 	assertFalse(Assigments.isArmstrongNumber(112));
		
	}
    
    @Test
    public void testAdd() {
       //count the number of test cases
       System.out.println("No of Test Case = "+ 5);
 		
       //test getName 
       String name = "Assigments One Class";
       System.out.println("Test Case Name = "+ name);
    }

}

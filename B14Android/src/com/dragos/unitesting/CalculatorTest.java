package com.dragos.unitesting;


import org.junit.*;
import junit.framework.TestCase;


public class CalculatorTest extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	@Test
	public void testAdd() {
		int expected = 30;
		int actual = Calculator.add(10, 20);
		assertEquals(actual ,expected);
		
		//count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	      String name = this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName = this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	
	}

}

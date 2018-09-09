package com.dragos.assigments;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class AssigmentsTestSuite {

	public static void main(String[] args) {
		
		TestSuite suite = new TestSuite(AssigmentsTest.class, Assigments2Test.class, Assigments4Test.class, Assigmetnts5Test.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());

	}

}

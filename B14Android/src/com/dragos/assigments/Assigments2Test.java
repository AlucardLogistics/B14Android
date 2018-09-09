package com.dragos.assigments;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assigments2Test {
	
	@Test
	public void bubbleSortTest() {
		System.out.println("Bubble Sort Testing");
		int[] test = {11,3,5,21,4,9,63,2};
		int[] expectedResult = {2,3,4,5,9,11,21,63};
		int[] result = Assigments2.bubbleSort(test);
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void selectionSortTest() {
		System.out.println("Selection Sort Testing");
		int[] test = {11,3,5,21,4,9,63,2};
		int[] expectedResult = {2,3,4,5,9,11,21,63};
		int[] result = Assigments2.selectionSort(test);
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void insertionSortTest() {
		System.out.println("Insertion Sort Testing");
		int[] test = {11,3,5,21,4,9,63,2};
		int[] expectedResult = {2,3,4,5,9,11,21,63};
		int[] result = Assigments2.insertionSort(test);
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void linearSearchTest() {
		System.out.println("Linear Search Testing");
		int[] test = {11,3,5,21,4,9,63,2};
		Assigments2.bubbleSort(test);
		int lenght = 8;
		int value = 21;
		int expectedResult = 6;
		int result = Assigments2.linearSearch(test, lenght, value);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void binarySearchTest() {
		System.out.println("Binary Search Testing");
		int[] test = {11,3,5,21,4,9,63,2};
		Assigments2.bubbleSort(test);
		int value = 21;
		int expectedResult = 6;
		int result = Assigments2.binarySearch(test, value);
		assertEquals(expectedResult, result);
	}
	
	@Test
    public void testAdd() {
       //count the number of test cases
       System.out.println("No of Test Case = "+ 5);
 		
       //test getName 
       String name = "Assigments Two Class";
       System.out.println("Test Case Name = "+ name);
    }

}

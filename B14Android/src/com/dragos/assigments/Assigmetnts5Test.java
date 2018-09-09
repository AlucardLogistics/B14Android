package com.dragos.assigments;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Assigmetnts5Test {
	
	@Test
	public void addMatrixesTest() {
		System.out.println("Bubble Sort Testing");
		int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] arr2 = {{1,1,1}, {3,2,1}, {7,2,4}};
		int[][] expectedResult = {{2,3,4}, {7,7,7}, {14,10,13}};
		int[][] result = Assigments5.addMatrices(arr1, arr2);
		assertArrayEquals(expectedResult, result);
	}

}

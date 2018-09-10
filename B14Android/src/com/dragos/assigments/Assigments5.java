package com.dragos.assigments;

import java.util.Arrays;

public class Assigments5 {
		
		static int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		static int[][] arr2 = {{1,1,1}, {3,2,1}, {7,2,4}};

		/*
		 * NinnYu's Review
		 * Works well. Good. 
		 */
		public static void main(String[] args) {
			
			System.out.println("Print the sum of arr1 and arr2: ");		
			printMatrix(addMatrices(arr1, arr2));
			
			System.out.println("Print arrays with Arrays class: ");
			printMatrixWithArrays(addMatrices(arr1, arr2));//
		}
		
		/**
		 * Add arr1 and arr2
		 * @param arr1
		 * @param arr2
		 * @return result[][] of the 2 arrays
		 */
		public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
			
			int rows = arr1.length;
			int cols = arr1[0].length;
			
			int[][] result = new int[rows][cols];
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					result[i][j] = arr1[i][j] + arr2[i][j];
				}			
			}
			
			return result;
		}
		
		/**
		 * Print the result array to console
		 * @param result
		 */
		private static void printMatrix(int[][] result) {
			
			for(int i = 0; i < result.length; i++) {
				for(int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		/**
		 * Print the result using Arrays class
		 * @param result
		 */
		private static void printMatrixWithArrays(int[][] result) {
			System.out.println(Arrays.deepToString(result));
		} 
	

}

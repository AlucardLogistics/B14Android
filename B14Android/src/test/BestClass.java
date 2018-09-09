package test;

import java.util.Arrays;

public class BestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String[] test = {"cad","abc","a","c","191","1","90"};
		System.out.println("Sorting array of strings: ");
		sortString(test);
		System.out.println("Move ZEROS to the end:");
		int[] arr = {0,2,0,1,0,2,1,2,1,0};
		sortZero(arr);
	}
	
	private static void sortString(String[] test) {
		
		int n = test.length;
		String temp = "";
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(test[j-1].compareTo(test[j]) > 0) {
					temp = test[j-1];
					test[j-1] = test[j];
					test[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(test));
	}
	
	private static void sortZero(int[] test) {
		
		int n = test.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(test[i] !=0) {
				test[count++] = test[i];
			}
						
		}
		
		while(count < n) {
			test[count++] = 0;
		}
		
		System.out.println(Arrays.toString(test));
		
	}

}

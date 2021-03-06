package test;

import java.util.Arrays;

public class Algorithms2 {

	public static void main(String[] args) {
		
		int test[] = {11,3,5,21,4,9,63,2};		
		int value = 21;
		System.out.println("Test Array:");
		System.out.println(Arrays.toString(test));
		System.out.println("Bubble Sort:");
		//bubbleSort(test);
		System.out.println("Selection Sort:");
		//selectionSort(test);
		System.out.println("Insertion Sort:");
		insertionSort(test);
		System.out.println("Linear Search:");
		System.out.println("Return the index of the value " + value + " in the sorted array or '-1' if element is not found: index = " + linearSearch(test, value));
		System.out.println("Binary Search:");
		System.out.println("Return the index of the value " + value + " in the sorted array or '-1' if element is not found: index = " + binarySearch(test, value));
	
		
		
	}
	
	//Bubble Sort is the simplest sorting algorithm that works by 
	//repeatedly swapping the adjacent elements if they are in wrong order
	private static void bubbleSort(int sort[]) {
		
		int n = sort.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(sort[j] > sort[j+1]) {
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(sort));
		
	}
	
	/**
	 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
	 * (considering ascending order) from unsorted part and putting it at the beginning. 
	 * The algorithm maintains two subarrays in a given array.
		1) The subarray which is already sorted.
		2) Remaining subarray which is unsorted.
	 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked
	 *  and moved to the sorted subarray.
	 */
	private static void selectionSort(int select[]) {
		
		int n = select.length;
		int[] arr = new int[n];
		int temp = 1000;
		int index = 0;
		for(int i = 0; i < n; i++) {
			temp = 1000;
			
			for(int j = 0; j < n; j++) {
				
				if(temp > select[j]) {
					temp = select[j];
					index = j;
				}
				
			}
			select[index] = 1000;
			arr[i] = temp;
		}
		
		
		
		
		System.out.println(Arrays.toString(arr));		
	}
	
	/**
	 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
	 */
	private static void insertionSort(int arr[]) {
		
		int n = arr.length;
        for (int i=1; i<n; ++i) {
            int key = arr[i]; //5
            int j = i-1; //1
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j]; //1=0
                j = j-1;
            }
            arr[j+1] = key;
        }
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * Linear Search
	 * @param linear - array
	 * @param n - length of the array
	 * @param x - value to look for inside the array
	 * @return index of value
	 */
	private static int linearSearch(int linear[], int x) {
		
		int n = linear.length;
		for(int i = 0; i < n; i++) {
			//return index of the element if is found
			if(linear[i] == x) {
				return i;
			}
		}
		
		//return -1 if the element is not found
		return -1;
	}
	
	/**
	 * Binary Search
	 * @param binary - array 
	 * @param x - value to look for inside the array
	 * @return index of value
	 */
	private static int binarySearch(int binary[], int x) {
		//l = left most element
		//r = right most element
		//m = middle element
		int l = 0, r = binary.length - 1;
		
		while(l <= r) {
			int m = l + (r-l)/2;
			//check if x is present at mid
			if(binary[m] == x) {
				return m;
			}
			//if x is greater, ignore left half
			if(binary[m] < x) {
				l = m + 1;
			}
			//if x is smaller, ignore right half
			else {
				r = m - 1;
			}
		}
		
		//if element is not present
		return -1;
	}
}



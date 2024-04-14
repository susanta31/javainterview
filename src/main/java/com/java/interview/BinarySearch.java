package com.java.interview;

import java.util.Arrays;

public class BinarySearch {
	
	//12. Implement Binary Search in Java using recursion.
	
	public static void main(String[] arg) {
		
		int[] intArr = {3, 4, 10, 12, 30, 21, 32, 33, 20};
		Arrays.sort(intArr);
		System.out.println("Search binary : " + binarySearch(intArr, 0, intArr.length - 1, 20));
	}
	
	private static boolean binarySearch(int[] arr, int low, int high, int key){
		
		//Calculate mid
		int mid = (low + high) / 2;
		
		if (low > high) return false;
		
		//Checking if the key is found in the middle.
		if (key == arr[mid]) return true;
		
		//Searching on the left half if a key exists there.  
		if (key < arr[mid]) 
			return binarySearch(arr, low, mid - 1, key);
		
		return binarySearch(arr, mid + 1, high, key);	
	 }

}

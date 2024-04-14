package com.java.interview;


public class SelectionSort {
	// BubbleSort
	// Bubble Sort, Selection Sort & Insertion Sort 
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 }; // Example array to sort
		System.out.println("Array before sorting:");
		selectionSort(arr, arr.length - 1);

	}
	
	private static void selectionSort(int[] arr, int lng) {
		if (lng == 1) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr >> i " + (i + 1) + " " + arr[i]);
			}
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i; j <  arr.length; j++) {				
				if (arr[j] < arr[min_index]) {					
					min_index = j;					
				}
			}
			
			int tmp = arr[min_index];
			int tmp1 = arr[i];
			arr[i] = tmp;
			
			
			if (i < arr.length - 1 ) {
				if (arr[i] > arr[i+1]) {
					int e1 = arr[i];
					int e2 = arr[i + 1];
					arr[i] = e2;
					arr[i+1] = e1;	
				} 
			}
		} 
		
		selectionSort(arr, --lng);
		
	}

}

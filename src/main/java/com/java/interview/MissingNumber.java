package com.java.interview;

import java.util.Arrays;

public class MissingNumber {
	
//	5. Given an array of non-duplicating numbers from 1 to n where one number is missing,
//	write an efficient java program to find that missing number.
//	Idea is to find the sum of n natural numbers using the formula and then finding the sum 
//	of numbers in the given array. Subtracting these two sums results in the number that is 
//	the actual missing number. This results in O(n) time complexity and O(1) space complexity.
	
	public static void main(String[] arg) {
		int[] intArray = {1,3,4,6,8,7,5};
		
		System.out.println("Missing number : " + missingNumber(intArray));
		
	}
	
	private static int missingNumber(int[] intArray) {
		
		int n = intArray.length + 1;
		int sumOfNArrays = n * (n + 1) / 2;
		
		int arraySum = 0;
		for (int i = 0; i < intArray.length; i++) {
			arraySum += intArray[i];
		}
		
		return sumOfNArrays - arraySum;
	}


}

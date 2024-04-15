package com.java.interview;

import java.util.Scanner;

//Sum of Digits

public class SumOfDigits {
	
	public static void main (String[] arg) {
		Scanner inp = new Scanner(System.in);
		int nums = 123455;
		sumNumbers(nums);
	}
	
	private static void sumNumbers(int nums) {
		
		int sum = 0;
		while (nums != 0) {
			sum += nums % 10;
			nums /= 10;
		}
		System.out.println("sum : " + sum);
	}
}

package com.java.interview;

import java.util.Scanner;

public class Fibonacciseries {
	
	//2. Write a Java Program to print Fibonacci Series using Recursion.
	// Fibonacci series
	// 0 + 1 = 1
	// 1 + 1 = 2
	// 1 + 2 = 3
	// 2 + 3 = 5
	// 3 + 5 = 8
	// 5 + 8 = 13
	
	public static void main(String[] arg) {	
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter a max length :");
		int mxlng = inp.nextInt();
		printFibonacciSeries(0, 1, mxlng);	
	}
	
	public static void printFibonacciSeries(int val1, int val2, int maxlng) {		
		if (maxlng == 0) return; 		
		System.out.println (val1 + " + " + val2 + " = " + (val1 + val2));
		printFibonacciSeries(val2, val1 + val2, -- maxlng);	
	}
	
	
}

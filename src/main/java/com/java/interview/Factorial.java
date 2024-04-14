package com.java.interview;

import java.util.Scanner;

public class Factorial{
	//Factorial number
	//4. Write a Java Program to find the factorial of a given number.
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = sc.nextInt();
		
		int fn = 1;
		for (int i =1 ; i <= num; i++) {
			fn = fn * i;
		}
		System.out.println(num + " Factorial number " + fn);
	}

}

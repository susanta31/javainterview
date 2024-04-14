package com.java.interview;

import java.util.Scanner;

public class FizzBuzz {
	
	//FizzBuzz 
	//div by 3 - Fizz
	//div by 5 - Buzz  
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = sc.nextInt();
		//String pnum = "";
		for (int i = 1; i <= num; i++) {
			
			if (i % 3== 0 && i % 5== 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3== 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			
		}
		
	}

}

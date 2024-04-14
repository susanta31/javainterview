package com.java.interview;

import java.util.Scanner;

public class Primenumber {

public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter max number : ");
		int max_inp = sc.nextInt();
		Primenumber(max_inp);
	}
	
	private static void Primenumber(int number) {
		
		boolean isPrime = true;
		for (int i = 2 ; i < number; i++) {			
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			                      
		}
		
		if (isPrime) {
			System.out.println(number + " is prime number");
		} else {
			System.out.println(number + " is NOT a prime number");
		}
		
	}
}

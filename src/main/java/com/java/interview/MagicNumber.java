package com.java.interview;

import java.util.Scanner;

public class MagicNumber {

	// 6. Write a Java Program to check if any number is a magic number or not.
	// A number is said to be a magic number if after doing sum of digits in
	// each step and inturn doing sum of digits of that sum, the ultimate
	// result (when there is only one digit left) is 1.

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number : ");
		int num = sc.nextInt();
		
		String num_sr = "" + num;
		System.out.print(num_sr);
		checkMagic(num_sr);

	}

	private static void checkMagic(String num_sr) {
		
		if (Integer.parseInt(num_sr) <= 9) {
			
			if (Integer.parseInt(num_sr) == 1) {
				System.out.print(" is magic number");
			} else {
				System.out.print(" is NOT a magic number");
			}
			
			return;
		}
		int sum_int = 0;
		for (int i = 0; i < num_sr.length(); i++) {
			sum_int += Integer.parseInt("" + num_sr.charAt(i));
		}
		
		
		checkMagic("" + sum_int);
		
	}

}

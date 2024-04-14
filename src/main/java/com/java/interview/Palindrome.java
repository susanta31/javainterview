package com.java.interview;

import java.util.Scanner;

public class Palindrome {

	// Palindrome
	// 11
	// 121
	// 1. Check if a given string is palindrome using recursion.
	public static void main(String[] arg) {
		checkPalindrom();
	}

	private static void checkPalindrom() {
		try {
			Scanner inp = new Scanner(System.in);
			System.out.print("Please enter the number : ");
			int input = inp.nextInt();
			String str_input = "" + input;
			
			String new_str = "";
			int mzxLen = str_input.length();
			for (int i = 1; i <= mzxLen; i++) {
				new_str = new_str + str_input.charAt(mzxLen - i);
			}

			if (new_str.equals(str_input)) {
				System.out.println(new_str + " is a palindrom number");

			} else {
				System.out.println(new_str + " is not a palindrom number");
			}
		} catch (Exception ex) {
			System.out.println("Please enter a valid number.");
		}
	}

}

package com.java.interview;

import java.util.Scanner;

public class Reversestring {
	
	//8. Write a Java program to reverse a string.
	public static void main(String[] arg) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Please enter a max length :");
		String mystr = inp.nextLine();
		
		int strLng = mystr.length();
		reversestring(mystr, strLng);
	}
	
	public static void reversestring(String mystr, int strLng) {
		
		if (strLng == 0) {
			System.out.print(" -- Reverse String");
			return;
		}
		
		System.out.print(mystr.charAt(strLng - 1 ));
		reversestring(mystr, --strLng); 
	}

}

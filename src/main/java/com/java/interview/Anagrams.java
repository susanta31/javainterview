package com.java.interview;

import java.util.Arrays;
import java.util.Scanner;

//Add
public class Anagrams {
	
	//3. Write a Java program to check if the two strings are anagrams.
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		//Input from two strings
		System.out.print("First String: ");
		String first_str = s.nextLine();
		
		System.out.print("Second String: ");
		String second_str = s.nextLine();
		// check for the length
		
		checkAnagrams(first_str, second_str);
	}
	
	private static void checkAnagrams(String first_str, String second_str) {
		char[] first_arr = first_str.toCharArray();
		Arrays.sort(first_arr);
		char[] second_arr = second_str.toCharArray();
		Arrays.sort(second_arr);
		
		boolean isAnagrams = Arrays.equals(first_arr, second_arr);
		System.out.println("First String after sort : " + first_arr.toString());
		System.out.println("Second String after sort : " + second_arr.toString());
		
		System.out.println("--------------------");
		System.out.println("String Anagrams : " + isAnagrams);
		
	}

}

package com.java.interview;

import java.util.Scanner;

//Reversing a string using StringBuilder to consolidate the characters.

public class ReversestringStringBuilder {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string :");
		String ip = sc.nextLine();
		System.out.println("The reverse string : " + reverseStr(ip));
	}
	
	private static String reverseStr(String ip) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = ip.length() - 1; i >= 0; i-- ) {
			
			sb.append(ip.charAt(i));
		}
		return sb.toString();
		
	}

}

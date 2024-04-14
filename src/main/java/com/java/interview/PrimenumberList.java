package com.java.interview;

import java.util.Scanner;

public class PrimenumberList {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter max number : ");
		int max_inp = sc.nextInt();
		System.out.println("-------------------");
		PrimenumberList(max_inp);
	}
	
	private static void PrimenumberList(int number) {
		
		for (int i = 0; i <= number ; i++) {
			boolean flg = true;
			if (i > 1) {
				
				
				for (int j = 2; j <= i; j++) {
					if (i % j == 0 && i != j) {
						flg = false;
					}
				}
				
				if (flg) {
					if (i > 2) System.out.print(",");
					System.out.print(i);
				}
				
			}
			
		}
		
	}

}

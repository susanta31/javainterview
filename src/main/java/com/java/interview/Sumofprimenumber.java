package com.java.interview;

import java.util.Scanner;

public class Sumofprimenumber {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number :");
		int num = sc.nextInt();
		checkPrimeNumber(num);
		
		
	}
	
	private static void checkPrimeNumber(int num) {
		
		for (int i = 2; i < num; i++) {
			
			if (i + (num-i) == num) {
				boolean fp = true;
				for (int j = 2; j < i; j++) {				
					if (i%j == 0 && i != j) {
						fp = false; 
						break;
					}			
				}
				
				if (fp) {
					boolean sp = true;
					for (int k = 2; k < num-i; k++) {				
						if ((num-i)%k == 0 && (num-i) != k) {
							sp = false; 
							break;
						}
					}
					
					if (sp) {
						System.out.println(num + " = "+ (num-i) + " + "+ i);
						return ;
					}
				}
				
			}
			
		}
		
	}

}

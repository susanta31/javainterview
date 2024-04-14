package com.java.interview;

import java.util.Scanner;

public class Clockwise90 {

	// 9. Write a Java program to rotate arrays 90 degree clockwise by taking
	// matrices from user input.

	// 1, 2, 3, 4
	// 5, 6, 7, 8
	// 9, 10, 11, 12
	// 13, 14, 15, 16

	// 13, 9, 5, 1
	// 14, 10, 6, 2
	// 15, 11, 7, 3
	// 16, 12, 8, 4

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int no = sc.nextInt();
		clockwiseArray(no);
	}

	private static void clockwiseArray(int no) {
		int[][] orgArray = new int[no][no];
		int fn = 1;
		// Fill empty array
		for (int r = 0; r < no; r++) {
			for (int c = 0; c < no; c++) {
				orgArray[r][c] = fn;
				fn++;
			}
		}

		// print array
		for (int r = 0; r < orgArray.length; r++) {
			for (int c = 0; c < orgArray[r].length; c++) {
				System.out.println("[R-" + r + "] [C-" + c + "]" + orgArray[r][c]);
			}
		}

		int[][] dstArray = new int[no][no];
		int nr = 0;
		// Update array
		for (int r = (no - 1) ; r >= 0; --r) {
			
			int nc = 0;
			for (int c = 0; c < no; c++) {
				dstArray[nc++][nr] = orgArray[r][c];
				System.out.println("orgArray[r][c] "  + r + ", " + c + ", " + orgArray[r][c]);
			}
			nr++;
		}

		System.out.println("----------------");
		// print array
		for (int r = 0; r < dstArray.length; r++) {
			for (int c = 0; c < dstArray[r].length; c++) {
				System.out.println("[R-" + r + "] [C-" + c + "]" + dstArray[r][c]);
			}
		}

	}

}

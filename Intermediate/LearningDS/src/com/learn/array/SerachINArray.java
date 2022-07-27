package com.learn.array;

import java.util.Scanner;

public class SerachINArray {
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while (testcase > 0) {
			boolean flag = false;
			int n = sc.nextInt();
			int[] inputArray = new int[n];
			for (int i = 0; i < n; i++) {
				inputArray[i] = sc.nextInt();
			}
			int validation = sc.nextInt();

			for (int arr1 : inputArray) {
				if (arr1 == validation) {
//					System.out.println("1");
					flag = true;
					break;
				}
			}

			System.out.println(flag ? "1" : 0);
			testcase--;
		}
	}
}

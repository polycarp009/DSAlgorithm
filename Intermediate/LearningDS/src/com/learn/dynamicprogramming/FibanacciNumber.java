package com.learn.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;
//top down approach
public class FibanacciNumber {
	 static int[] dpArray;
	 public static void main(String[] args) {
		 // YOUR CODE GOES HERE
		 // Please take input and print output to standard input/output (stdin/stdout)
		 // DO NOT USE ARGUMENTS FOR INPUTS
		 // E.g. 'Scanner' for input & 'System.out' for output
		 Scanner sc = new Scanner(System.in);
		 int num=sc.nextInt();
		 dpArray = new int[num+1];
		 Arrays.fill(dpArray, -1);
		 fib(num);
		 System.out.println(fib(num));
	 }

	 public static int fib(int n) {
		 if(n<=1) return n;
		 //if already present return the stored value;
		 if(dpArray[n] != -1) return dpArray[n];
		 //Store it if not present
		 dpArray[n]=fib(n-1)+fib(n-2);

		 return dpArray[n];

	 }
	 
}

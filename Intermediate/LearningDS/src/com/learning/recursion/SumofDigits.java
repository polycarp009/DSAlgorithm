package com.learning.recursion;

public class SumofDigits {
	public static void main(String[] args) {
		System.out.println("Ans:"+solve(46));
	}
	 public static int solve(int A) {
		 
		 if(A==0) {
			 return 0;
		 }
		 return A%10 + solve(A/10);
	 }
}

package com.learn.modulo;

//Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
public class A_B_Modulo {
	
	public static void main(String[] args) {
		System.out.println(solve(5, 10));
	}
	  public static int solve(int A, int B) {
	if(A>B) {
		return A-B;
	}else {
		return B-A;
	}
		  
	  }
}

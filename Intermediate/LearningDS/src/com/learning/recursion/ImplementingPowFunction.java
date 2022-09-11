package com.learning.recursion;

/*Implement pow(A, B) % C.

In other words, given A, B and C, Find (AB % C).*/
public class ImplementingPowFunction {
	
	public static void main(String[] args) {
		System.out.println( pow(-1,1,20));
	}
	public static int pow(int A, int B, int C) {
		if(A==0&&B==0) {
			return 0;
		}
		if(B==0)
			return 1;
		long halfpow = pow(A,B/2,C);
		if(B%2==1) {
			return (int) (((halfpow%C*halfpow%C*A%C)+C)%C);
		}
		else {
			return  (int) (((halfpow%C*halfpow%C)+C)%C);
		}
    }
}

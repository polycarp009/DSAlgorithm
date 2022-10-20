package com.learning.recursion;

/*Implement pow(A, B) % C.

In other words, given A, B and C, Find (AB % C).*/
public class ImplementingPowFunction {
	
	public static void main(String[] args) {
		System.out.println( powRec(-1,1,20));
	}
	//Using Recursion
	public static int powRec(int A, int B, int C) {
		if(A==0&&B==0) {
			return 0;
		}
		if(B==0)
			return 1;
		long halfpow = powRec(A,B/2,C);
		if(B%2==1) {
			return (int) (((halfpow%C*halfpow%C*A%C)+C)%C);
		}
		else {
			return  (int) (((halfpow%C*halfpow%C)+C)%C);
		}
    }
	
	
	
	//Without Recursion
	public int pow(int x, int n, int d) {
	    long a = x;
	    long res = 1L;
	    while (n > 0) {
	        if (n % 2 == 1) {
	            res *= a;
	            res %= d;
	        }
	        a *= a;
	        a %= d;
	        n = n >> 1;
	    }
	    res = (res + d) % d;
	    return (int) res;
	}
}

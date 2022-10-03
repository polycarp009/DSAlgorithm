package com.learn.modulo;


// Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.
public class PrimeModuloInverse {
	
	public static void main(String[] args) {
		System.out.println(solve(3, 5));
	}
	  public static int solve(int A, int B) {
		  
		  int result=0;
		  int pow = (int) Math.pow(A, B-2);
		  System.out.println(pow%B);
		  result=(A^(B-2))%B;
		  
		return result;
	    }
}

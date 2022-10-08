package com.learn.dsa;

public class FindGCD {
	public static void main(String[] args) {
		System.out.println(gcd(6, 4));
	}
	public static int gcd(int A, int B) {
	
		System.out.println("A: "+A+"B: "+B);
		while(A>0) {
			int temp=A;
			A=B%A;
			B=temp;
		}
		return B;
    }
	
	 public int gcdrec(int A, int B) {
	        if (A == 0)
	            return B;
	        return gcdrec(B % A, A);
	    }
}

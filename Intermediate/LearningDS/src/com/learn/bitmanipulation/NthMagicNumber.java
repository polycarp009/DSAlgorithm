package com.learn.bitmanipulation;

public class NthMagicNumber {
	public static void main(String[] args) {
		System.out.println(solve(10));
	}

	public static int solve(int A) {
		
//		int pow = 1;
//		int ans = 0;
//		while (A > 0) {
//			int rem =A&1;
//			A = A >> 1;
//			pow *= 5;
//			if (rem == 1) {
//				ans += pow;
//			}
//
//		}
//		return ans;
		int n =A;
		int ans = 0, x = 1;
        while(n > 0) {
            x *= 5;
            if(n%2 == 1)    ans += x;
            n= n>>1;
        }
        return ans;

	}

}

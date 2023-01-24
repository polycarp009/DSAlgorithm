package com.learn.dynamicprogramming;

import java.util.Arrays;

public class countMinSquares {
	
	public static void main(String[] args) {
	System.out.println(countMinSquares1(1));
	}
	
	public static int countMinSquares1(int A) {
		int[] dpArray = new int[A+1];
		Arrays.fill(dpArray, -1);
		System.out.println(Arrays.toString(dpArray));
		return perfectSq(A, dpArray);
		
    }
	
	public static int perfectSq(int n,int dp[]) {
		System.out.println(n+"::"+Arrays.toString(dp));
		if(n==0) return 0;
		if(dp[n]!=-1) return dp[n];
		int ans=Integer.MAX_VALUE;
		for (int i = 1; (i*i) <= n; i++) {
			int psq=perfectSq(n-(i*i), dp);
			ans=ans>psq?psq:ans;
		}
		dp[n]=1+ans;
		return dp[n];
		
	}
}

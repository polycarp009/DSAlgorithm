package com.learn.dynamicprogramming;

import java.util.Arrays;

public class Knapsack01 {
	static int[][] dp;
	static int m,n;
	public static void main(String[] args) {

		 int A[] = {60, 100, 120};
				int[] B = {10, 20, 30};
int C=50;
		System.out.println(calculateMinimumHP(A,B,C));
	}
	public static int calculateMinimumHP(int[] A, int B[],int C) {
		int i=n=A.length; int j=m= C;
		dp = new int[i+1][j+1];
		for (final int[] line : dp) {
			Arrays.fill(line, -1);
		}

		return ways(i,j,A,B,C);

	}
	public static int ways(int i,int j,int[]A,int B[],int C) {
		if(i==0 || j==0) {
			dp[i][j]=0;
			return 0;
		}
//		if(i==n-1) return A[i];
		if(dp[i][j]!=-1) return dp[i][j];
		if(B[i-1]<=j) 
			dp[i][j] = Math.max(A[i-1]+ ways(i-1,j-B[i-1],A,B,C),ways(i-1,j,A,B,C));
		else
			dp[i][j] = ways(i-1,j,A,B,C);
//		System.out.println(Arrays.deepToString((dp)));
//		System.out.println(dp[i][j]);
		return dp[i][j];
	}

}

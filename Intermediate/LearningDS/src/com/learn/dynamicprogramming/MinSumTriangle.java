package com.learn.dynamicprogramming;

import java.util.Arrays;

public class MinSumTriangle {
	static int[][] dp;
	static int m,n;
	public static void main(String[] args) {

		int[][] A = {
				{2},
				{3, 4},
				{6, 5, 7},
				{4, 1, 8, 3}
		};
		System.out.println(calculateMinimumHP(A));
	}
	public static int calculateMinimumHP(int[][] A) {
		int i=n=A.length; int j=m= A[n-1].length;
		dp = new int[i][j];
		for (final int[] line : dp) {
			Arrays.fill(line, -1);
		}

		return ways(0,0,A);

	}
	public static int ways(int i,int j,int[][]A) {

		if(i==n-1) return A[i][j];
		if(dp[i][j]!=-1) return dp[i][j];
		dp[i][j]=A[i][j]+Math.min(ways(i+1,j,A),ways(i+1,j+1,A));
		return dp[i][j];
	}


}

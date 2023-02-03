package com.learn.dynamicprogramming;

import java.util.Arrays;

public class FlipArray {
	static int[][] dp;
	static int m,n;
	public static void main(String[] args) {

		 int A[] = {60, 100, 120};
				int[] B = {10, 20, 30};
int C=50;
		System.out.println(calculateMinimumHP(A));
	}
	public static int calculateMinimumHP(int[] A) {
		int n=A.length;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum+=A[i];
		}
		sum=sum/2;
		dp = new int[n][sum+1];
		for (final int[] line : dp) {
			Arrays.fill(line, -1);
		}

		for (int i = sum; i >= 1; --i) {
            int ans = (int) fliparry(A, n-1, i);
            if (ans <= A.length) return ans; //Break if we have an answer close to halfSum
        } 
		return -1;

	}
	public static int fliparry(int[]A,int i,int j) {
		if(j==0) {
			return 0;
		}
		if(i==-1) return A.length+1;
		if(dp[i][j]!=-1) return dp[i][j];
		int ans=0;
		
		if(j-A[i]>=0) 
			ans = Math.min(fliparry(A, i - 1, j - A[i]) + 1, fliparry(A, i - 1,j));
		else
			ans=fliparry(A, i - 1,j);
		
		dp[i][j]=ans;
//		System.out.println(Arrays.deepToString((dp)));
//		System.out.println(dp[i][j]);
		return dp[i][j];
	}


}

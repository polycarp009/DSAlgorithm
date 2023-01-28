package com.learn.dynamicprogramming;

import java.util.Arrays;

public class DungeonPrincess {

	static int[][] dp;
	static int m,n;
public static void main(String[] args) {
		
		int[][] A = {
				{-2, -3, 3},
			      {-5, -10, 1},
			       {10, 30, -5}
	};
	System.out.println(calculateMinimumHP(A));
	}
	 public static int calculateMinimumHP(int[][] A) {
		 int i=n=A.length; int j=m= A[0].length;
	    	dp = new int[i+1][j+1];
	    	 for (final int[] line : dp) {
	             Arrays.fill(line, -1);
	         }

			return ways(0,0,A);
	   
	    }
   public static int ways(int i,int j,int[][]A) {
		
		if(i==n-1&&j==m-1) return Math.max(1, 1-A[i][j]);
		System.out.println(Arrays.deepToString((dp)));
		System.out.println(dp[i][j]);
		if(dp[i][j]!=-1) return dp[i][j];
//		if( A[i][j] == 1)return dp[i][j]=0;
		dp[i][j]=Math.max(1, (Math.min(ways(i+1,j,A),ways(i,j+1,A)))-A[i][j]);
		return dp[i][j];
		
	}
	 
//	 
//		public static int ways(int n,int j,int[][]A) {
//			if(i<0 || j<0) return 0;
//			if(i==n-1&&j==m-1) return 1;
//			System.out.println(Arrays.deepToString((dp)));
//			if(dp[i][j]!=-1) return dp[i][j];
//			if( A[i][j] == 1)return dp[i][j]=0;
//			dp[i][j]=Math.max(1, Math.min(ways(i+1,j,A),ways(i,j+1,A)));
//			return dp[i][j];
//			
//		}
	 
	 
	 
	}
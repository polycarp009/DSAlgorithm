package com.learn.dynamicprogramming;

import java.util.Arrays;

public class UniquePaths {
	static int[][] dp;
	public static void main(String[] args) {
		
		int[][] A = {
		        {0, 0, 0},
		        {0, 1, 0},
		        {0, 0, 0}
	};
	System.out.println(uniquePathsWithObstacles(A));
	}
	
    public static int uniquePathsWithObstacles(int[][] A) {
    	int i=A.length; int j = A[0].length;
    	dp = new int[i][j];
    	 for (final int[] line : dp) {
             Arrays.fill(line, -1);
         }

		return ways(i-1,j-1,A);
   
    }
public static int ways(int i,int j,int[][]A) {
	if(i<0 || j<0) return 0;
	if(i==0&&j==0) return 1;
	System.out.println(Arrays.deepToString((dp)));
	if(dp[i][j]!=-1) return dp[i][j];
	if( A[i][j] == 1)return dp[i][j]=0;
	dp[i][j]=ways(i-1,j,A)+ways(i,j-1,A);
	return dp[i][j];
	
}
}

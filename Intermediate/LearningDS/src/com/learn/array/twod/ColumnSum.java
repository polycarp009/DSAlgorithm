package com.learn.array.twod;

import java.util.Arrays;

public class ColumnSum {
	public static void main(String[] args) {
		int A[][] = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
		
		int B[][] = {{5,6},
				{7,8}};
		
		solve(A);
	}
	
	public static int[] solve(int[][] A) {
		int sum[] =new int[A[0].length];
		
		for(int j=0;j<A[0].length;j++) {
			sum[j]=0;
			for (int i = 0; i <A.length; i++) {
			sum[j]+=A[i][j];
//				System.out.println("i:"+i+"A[i][j] : "+A[i][j]);
			}
		}
		System.out.println(Arrays.toString(sum));
				
		return sum;
    }
}

package com.learn.array.twod;

import java.util.Arrays;

public class MatrixTranspose {
	public static void main(String[] args) {
		int A[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		int B[][] = {{5,6},
				{7,8}};
		System.out.println(Arrays.deepToString(A));
		solve(A);
	}
	
	public static int[][] solve(int[][] A) {
	int B[][] = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j =0; j < A[0].length; j++) {
				
				B[i][j]=A[j][i];
			}
		}
		
		System.out.println(Arrays.deepToString(B));
		
		return B;
	}
}

package com.learn.array.twod;

import java.util.Arrays;

public class MatrixSubtraction {
	public static void main(String[] args) {
		int A[][] = {{1, 2, 3},
				{4, 5, 6},{7, 8, 9}};
		
		int B[][] = {{9, 8, 7},
				{6, 5, 4},{3, 2, 1}};
		
		solve(A,B);
	}
	
	public static int[][] solve(int[][] A, int[][] B) {
		for(int i=0;i<A.length;i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j]-=B[i][j];
			}
		}
		
		return A;
    }
}

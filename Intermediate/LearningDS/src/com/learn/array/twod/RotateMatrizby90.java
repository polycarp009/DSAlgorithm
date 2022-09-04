package com.learn.array.twod;

import java.util.Arrays;

public class RotateMatrizby90 {
	public static void main(String[] args) {
		int A[][] = {{1, 2},{3,4}};
		
		int B[][] = {{5,6},
				{7,8}};
		System.out.println(Arrays.deepToString(A));
		solve(A);
	}
	//Transpose and reverse columns
		public static void solve(int[][] A) {
//			Transpose
			for (int i = 0; i < A.length; i++) {
				for (int j =i+1; j < A[0].length; j++) {
					int temp = A[i][j];
					A[i][j]=A[j][i];
					A[j][i]=temp;
				}
			}
			
			System.out.println(Arrays.deepToString(A));
			
			//Reverse
			for (int i = 0; i < A.length; i++) {
				for (int j =0; j < A[0].length/2; j++) {
					int temp = A[i][j];
					A[i][j]=A[i][(A.length-1)-j];
					A[i][(A.length-1)-j]=temp;
				}
}
			System.out.println(Arrays.deepToString(A));
			
		}
	
}

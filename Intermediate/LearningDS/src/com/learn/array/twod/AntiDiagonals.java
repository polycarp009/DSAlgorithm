package com.learn.array.twod;

import java.util.Arrays;

public class AntiDiagonals {
	public static void main(String[] args) {
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int B[][] = {{5,6},
				{7,8}};
		
		solve(A);
	}
	
	public static int[][] solve(int[][] A) {
		//first row
		int[][] newArray = new int[2*(A.length-1)][A[0].length];
		for (int j = 0; j < A[0].length; j++) {
			newArray=printDiagonals(0, j, A.length, A[0].length, A);
		}
		
		//last column
		for (int i = 1; i < A.length; i++) {
			newArray=printDiagonals(i, A.length-1, A.length, A[0].length, A);
		}
		
		System.out.println(Arrays.deepToString(newArray));
		return A;
	}
	
	public static int[][] printDiagonals(int S_i,int S_j,int N,int M,int A[][]){
		int i=S_i;
		int j =S_j;
		int[][] B= new int[A.length][A[0].length];
		while(i<N && j>=0) {
			B[i][j]=A[i][j];
//			System.out.println(A[i][j]);
			i++;
			j--;
		}
		return B;
	}
}

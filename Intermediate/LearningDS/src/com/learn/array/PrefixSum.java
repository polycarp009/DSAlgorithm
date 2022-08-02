package com.learn.array;

import java.util.Arrays;

public class PrefixSum {
	public static void main(String[] args) {
	int	A[] = {1, 2, 3, 4, 5};
			int	B[][] = {{1, 4}, {2, 3}};
		rangeSum(A,B);
	}
	
	public static long[] rangeSum(int[] A, int[][] B) {
		
		//prefix sum 
		long prefix[]=new long[A.length];
		prefix[0]=A[0];
		for (int i = 1; i < A.length; i++) {
			prefix[i]= prefix[i-1]+A[i];
		}
		//[1, 3, 6, 10, 15]
		long output[] = new long[B.length];
		for (int i = 0; i < B.length; i++) {
			int left = B[i][0];
			int right = B[i][1];
			if(left==1) {
				output[i]=prefix[right-1];
			}else {
				output[i]=prefix[right-1]-prefix[left-2];
			}
		}
		return output;
    }
}

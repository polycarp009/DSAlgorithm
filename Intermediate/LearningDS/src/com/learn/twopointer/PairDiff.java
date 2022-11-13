package com.learn.twopointer;

import java.util.Arrays;

//Count all distinct pairs with difference equal to B.
public class PairDiff {
	public static void main(String[] args) {
//		int A[] = {1, 5, 3, 4, 2}; int B=3;

		int A[] = {8, 12, 16, 4, 0, 20}; int B=4;
//		B= 2 out: 5
//		int A[] = { 1, 1, 1, 2, 2 }; int B=0;
//		B= 6 out: 2
		System.out.println(solve(A, B));

	}

	public static int solve(int[] A, int B) {
		Arrays.sort(A);
		int i = 0, j = 1, count = 0,mod=1000000007;
		while (j<A.length) {
			int a=A[i];
			int b=A[j];
			int ans = A[j] - A[i];
			System.out.println("Ans:"+ans);
			if (ans == B) {
				count++;
				 while(i < A.length && A[i] == a) i++;// sliding window to avoid duplicate pairs
	                while(j < A.length && A[j] == b) j++; 
			} else if (ans < B) {
				j++;

			} else if (ans > B) {
				i++;
			}
			if(i==j) {
				j++;
			}
		}
		return count;

	}

}

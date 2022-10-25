package com.learn.sorting;


//TC: O(N) SC:O(1)
public class MaxModSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 3 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		int N = A.length - 1;

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			if (first <= A[i]) {
				second = first;
				first = A[i];
			} else if (second < A[i] && A[i] != first) {
				second = A[i];
			}
		}

		if (second != Integer.MIN_VALUE)
			return second;

		return 0;
	}

}

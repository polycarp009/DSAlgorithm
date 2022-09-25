package com.learn.array;

import java.util.Arrays;

public class FirstMissingInteger {
	public static void main(String[] args) {
		int[] A = {1};
		System.out.println(firstMissingPositive(A));
	}

	public static int firstMissingPositive(int[] A) {
		int i = 0;
		int n = A.length;
		while (i < n) {
			if (A[i] >= 1 && A[i] <= n) {
				int correctindex = A[i] - 1;
				if (A[correctindex] == A[i]) {
					i++;
				} else {
					int temp = A[i];
					A[i] = A[correctindex];
					A[correctindex] = temp;

				}
			} else
				i++;
		}
		System.out.println(Arrays.toString(A));
		for ( i = 0; i <n; i++) {
			if(i+1!=A[i]) {
				System.out.println("i:"+i);
				return i+1;
			}
		}
		System.out.println("n:"+n);
		return n+1;
	}
}

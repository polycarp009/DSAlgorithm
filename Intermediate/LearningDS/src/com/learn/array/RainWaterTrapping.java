package com.learn.array;

import java.util.Arrays;

public class RainWaterTrapping {
	public static void main(String[] args) {
		int[] A = { 4, 2, 5, 7, 4 };
		System.out.println(trap(A));
	}

	public static int trap(final int[] A) {
		int N = A.length;
		int waterTrapped = 0;

//		  find rightMAx prefix array
		int[] rightmax = new int[N];
		rightmax[N - 1] = A[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			rightmax[i] = Math.max(rightmax[i + 1], A[i]);
		}

//		  find leftMax prefix array
		int[] leftmax = new int[N];
		leftmax[0] = A[0];
		for (int i = 0; i < N; i++) {
			if (i > 0)
				leftmax[i] = Math.max(leftmax[i - 1], A[i]);
			waterTrapped = waterTrapped + (Math.min(leftmax[i], rightmax[i]) - A[i]);

		}

		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(leftmax));
		System.out.println(Arrays.toString(rightmax));
		return waterTrapped;

	}
}

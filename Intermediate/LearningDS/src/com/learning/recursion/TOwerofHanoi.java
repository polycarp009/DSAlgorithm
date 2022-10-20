package com.learning.recursion;

import java.util.Arrays;

public class TOwerofHanoi {
	int a[][];
	int move;

	public static void main(String[] args) {
		TOwerofHanoi t = new TOwerofHanoi();
		System.out.println(Arrays.toString(t.towerOfHanoi(2)));
	}

	public int[][] towerOfHanoi(int A) {
		int m = (1 << A) - 1;
		move=-1;
		System.out.println(m);
		a = new int[m][3];
		toh(A, 1, 3, 2);
		return a;
	}

	public void toh(int N, int src, int des, int mid) {
//		 int a[][]=new int[N][3]; 

		if (N == 1) {
			System.out.println("N: " + N + " SRC: " + src + " DES: " + des);
			move++;
			System.out.println("Move:" + move);
			a[move] = new int[] { N, src, des };
			return;
		}
		toh(N - 1, src, mid, des);
		System.out.println("N: " + N + " SRC: " + src + " DES: " + des);
		move++;
		System.out.println("Move:" + move);
		a[move] = new int[] { N, src, des };
	
		toh(N - 1, mid, des, src);

	}
}

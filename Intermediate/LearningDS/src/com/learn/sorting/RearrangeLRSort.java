package com.learn.sorting;

public class RearrangeLRSort {
	public static void main(String[] args) {
		int[] A = { 45, 10, 15, 25, 50,3,5,2 };
		int[] B = { 2 };
		System.out.println(reArrange(A, 2, 5));
	}

	public static int reArrange(int[] A, int l, int r) {
		int p1 = l + 1;
		int p2 = r;
		while (p1 < p2) {
			if (A[p1] <= A[l]) {

				p1++;
			} else if (A[p2] >= A[l]) {

				p2--;
			} else {
				int temp=A[p1];
				A[p1]=A[p2];
				A[p2]=temp;
				p1++;
				p2--;
			}
		}
		int temp=A[l];
		A[l]=A[p2];
		A[p2]=temp;
		return p2;
	}
}

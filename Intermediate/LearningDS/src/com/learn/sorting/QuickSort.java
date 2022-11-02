package com.learn.sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] A = {1, 4, 10, 2, 1, 5};
		int[] B = { 2 };
		System.out.println(Arrays.toString(solve(A)));
	}
	
	public static int[] solve(int[] A) {
		 quickSort(A,0,A.length-1);
		 return A;
    }

	
	public static void quickSort(int[] A,int l,int r) {
		if(l>=r) return;
	int index = reArrange(A,l,r);
	quickSort(A, l, index-1);
	 quickSort(A, index+1, r);
    }
	
	public static int reArrange(int[] A, int l, int r) {
		int p1 = l + 1;
		int p2 = r;
		while (p1 <= p2) {
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

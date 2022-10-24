package com.learn.sorting;

import java.util.Arrays;

public class MergeSortedArray {
public static void main(String[] args) {
	int[] A= {-4, -3, 0 };
	int[] B= {2};
	System.out.println(Arrays.toString(solve(A,B)));
}

public static int[] solve(final int[] A, final int[] B) {
	int p1=0,p2=0,p3=0;
	int n= A.length;
	int m=B.length;
	int[] c = new int[A.length+B.length];
	while(p1<n && p2<m) {
		if(A[p1]<=B[p2]) {
			c[p3]=A[p1];
			p1++;
		}else {
			c[p3]=B[p2];
			p2++;
			
		}
	p3++;
	}
	while(p1<n) {
		c[p3]=A[p1];
		p1++;p3++;
	}while(p2<m) {
		c[p3]=B[p2];
		p2++;p3++;
	}
	
	
	
	return c;
}
}

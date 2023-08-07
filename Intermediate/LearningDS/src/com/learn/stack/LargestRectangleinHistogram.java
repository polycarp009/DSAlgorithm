package com.learn.stack;

import java.util.Arrays;
import java.util.Stack;

//Find the area of the largest rectangle formed by the histogram.
public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		int[] A = {  47, 69, 67, 97, 86, 34, 98, 16, 65, 95, 66, 69, 18, 1, 99, 56, 35, 9, 48, 72, 49, 47, 1, 72, 87, 52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39, 84, 16, 15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31, 24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12, 66, 87, 86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11, 30, 72, 51, 61, 56, 41, 30, 71, 12, 44, 81, 43, 43, 27  };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		
		long curans, ans = 0;
		int len = A.length;
		
		if(len==1) {
			return A[0];
		}
		int[] lsmall = new int[len];
		int[] rsmall = new int[len];
		Stack<Integer> st1 = new Stack<>();
		for (int i = 0; i < A.length; i++) {
			
			while (!st1.isEmpty() && A[st1.peek()] >= A[i]) {
				st1.pop();
			}
			if(st1.isEmpty()) {
				lsmall[i]=-1;
			}else {
				lsmall[i]=st1.peek();
			}
			
			st1.push(i);
		}
		
		st1.clear();
//		System.out.println("LSmall: "+Arrays.toString(lsmall));
		for (int i = len-1; i >=0 ; i--) {
		
			while (!st1.isEmpty() && A[st1.peek()] >= A[i]) {
				st1.pop();
			}
			if(st1.isEmpty()) {
				rsmall[i]=len;
			}else {
				rsmall[i]=st1.peek();
			}
			
			st1.push(i);
		}
//		System.out.println("RSmall: "+Arrays.toString(rsmall));
		for (int i = 0; i < A.length; i++) {
			curans = A[i] * (rsmall[i] - lsmall[i] - 1);
			ans = Math.max(ans, curans);

		}
		
		return (int)ans;
	}
}

package com.learn.stack;

import java.util.Arrays;
import java.util.Stack;

//Return the integar array G such that G[i] contains the nearest smaller number than A[i]. If no such element occurs G[i] should be -1.
public class NearestSmallerElement {
	public static void main(String[] args) {
		int[] A = { 4, 5, 2, 10, 8 };
		System.out.println(solve(A));
	}

	public static int[] solve(int[] A) {
		Stack<Integer> st1 = new Stack<>();
		int[] ans = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			ans[i]=-1;
			while (!st1.isEmpty() && (st1.peek() >= A[i])) {
				st1.pop();
				
			}
			if (!st1.isEmpty()) {
				ans[i] = st1.peek();
			}
			st1.push(A[i]);
		}
//		System.out.println(Arrays.toString(ans));
		return ans;
	}
}

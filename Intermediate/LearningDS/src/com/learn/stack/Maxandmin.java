package com.learn.stack;

import java.util.Arrays;
import java.util.Stack;

public class Maxandmin {
	public static void main(String[] args) {
		int[] A = {4, 7, 3, 8};
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		int mod = 1000000007;
		long curans = 0;
		int len = A.length;

		if (len == 1) {
			return A[0];
		}

		int[] lsmall = new int[len];
		int[] rsmall = new int[len];
		int[] llarge = new int[len];
		int[] rlarge = new int[len];
//		System.out.println(Arrays.toString(A));
//		System.out.println("---------------");
		lsmall = leftsmallval(A, len, -1);

		rsmall = rightsmallval(A, len, len);
		llarge = leftlargeval(A, len, -1);
		rlarge = rightlargeval(A, len, len);

//		System.out.println("LeftSmall" + Arrays.toString(lsmall));
//		System.out.println("RightSmall" + Arrays.toString(rsmall));
//		System.out.println("Left Large" + Arrays.toString(llarge));
//		System.out.println("Right Large" + Arrays.toString(rlarge));
		long max = 0;
		long min = 0;
		for (int i = 0; i < len; i++) {
			max = (i - llarge[i]) * (rlarge[i] - i) % mod;
//			System.out.println("Max:"+max);
		
			min = (i - lsmall[i]) * (rsmall[i] - i) % mod;
//			System.out.println("Min:"+min);
			long lmax = (max * A[i]) % mod;
			long lmin = (min * A[i]) % mod;
//			System.out.println("A:" + A[i] + "lmax:" + lmax + "rmax:" + lmin);
			curans = (curans % mod) + (lmax - lmin) % mod;
			System.out.println(curans);
		}
		curans = (curans + mod) % mod;
		return (int) (curans % mod);
	}

	public static int[] leftsmallval(int[] A, int len, int initilizer) {
		Stack<Integer> st1 = new Stack<>();
		int[] out = new int[len];
		for (int i = 0; i < len; i++) {

			while (!st1.isEmpty() && A[st1.peek()] >= A[i]) {
				st1.pop();
			}
			if (st1.isEmpty()) {
				out[i] = initilizer;
			} else {
				out[i] = st1.peek();
			}

			st1.push(i);
		}
//		st1.clear();
		return out;

	}
	
	public static int[] rightsmallval(int[] A, int len, int initilizer) {
		Stack<Integer> st1 = new Stack<>();
		int[] out = new int[len];
		for (int i = len-1; i >=0 ; i--) {

			while (!st1.isEmpty() && A[st1.peek()] >= A[i]) {
				st1.pop();
			}
			if (st1.isEmpty()) {
				out[i] = initilizer;
			} else {
				out[i] = st1.peek();
			}

			st1.push(i);
		}
//		st1.clear();
		return out;

	}

	public static int[] leftlargeval(int[] A, int len, int initilizer) {
		Stack<Integer> st1 = new Stack<>();
		int[] out = new int[len];
		for (int i = 0; i < len; i++) {

			while (!st1.isEmpty() && A[st1.peek()] <= A[i]) {
				st1.pop();
			}
			if (st1.isEmpty()) {
				out[i] = initilizer;
			} else {
				out[i] = st1.peek();
			}

			st1.push(i);
		}
		st1.clear();
		return out;

	}
	
	public static int[] rightlargeval(int[] A, int len, int initilizer) {
		Stack<Integer> st1 = new Stack<>();
		int[] out = new int[len];
		for (int i = len-1; i >=0 ; i--) {
			while (!st1.isEmpty() && A[st1.peek()] <= A[i]) {
				st1.pop();
			}
			if (st1.isEmpty()) {
				out[i] = initilizer;
			} else {
				out[i] = st1.peek();
			}

			st1.push(i);
		}
		st1.clear();
		return out;

	}
}

package com.learn.string;

public class CharToLower {
	public static void main(String[] args) {
		char[] A = { 'S', 'c', 'A', 'l', 'e', '#', 'A', 'c', 'a', 'D', 'e', 'm', 'y','1','0' };
//		System.out.println(to_lower(A));
//		System.out.println(to_upper(A));
		System.out.println(isalphanum(A));
	}

	public static char[] to_lower(char[] A) {
		System.out.println(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 'A' && A[i] <= 'Z') {
				A[i] += 'a' - 'A';
			}
		}

		return A;

	}

	public static char[] to_upper(char[] A) {
		System.out.println(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 'a' && A[i] <= 'z') {
				A[i] -= 'a' - 'A';
			}
		}

		return A;

	}
	
//	public static int isalphanum(char[] A) {
//		System.out.println(A);
//		for (int i = 0; i < A.length; i++) {
//			if (!((A[i] >= 'a' && A[i] <= 'z')||(A[i] >= 'A' && A[i] <= 'Z')|| (A[i] >= '0' && A[i] <= '1'))) {
//			return 0;
//			}
//		}
//
//		return 1;
//
//	}
	
	public static int isalphanum(char[] A) {
		System.out.println(A);
		for (int i = 0; i < A.length; i++) {
			if (!((A[i] >= 'a' && A[i] <= 'z')||(A[i] >= 'A' && A[i] <= 'Z')|| (A[i] >= '0' && A[i] <= '1'))) {
			return 0;
			}
		}

		return 1;

	}
}

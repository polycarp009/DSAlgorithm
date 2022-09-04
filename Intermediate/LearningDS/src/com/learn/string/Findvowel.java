package com.learn.string;

import java.util.Arrays;

public class Findvowel {
	public static void main(String[] args) {
		int[][] A = { { 0, 2 }, { 2, 4 } };
		System.out.println(Arrays.toString(solve("scaler", A)));
	}

	public static int[] solve(String A, int[][] B) {
		int[] out = new int[B.length];
		int[] vowel = new int[A.length() + 1];
		vowel[0] = 0;
		// do carry forward
		for (int i = 0; i < A.length(); i++) {
			if ((A.charAt(i) == 'a') || (A.charAt(i) == 'e') || (A.charAt(i) == 'i') || (A.charAt(i) == 'o')
					|| (A.charAt(i) == 'u')) {
				vowel[i + 1] = vowel[i] + 1;
			} else {
				vowel[i + 1] = vowel[i];
			}
		}
		for (int i = 0; i < B.length; i++) {
			out[i] = vowel[B[i][1] + 1] - vowel[B[i][0]];
		}
		return out;

	}
}

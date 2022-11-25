package com.learn.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given a string A of length N consisting of lowercase alphabets.
//Find the period of the string.
public class StringPatternMatching {

	public static void main(String[] args) {

		String A = "abababab";
		// 2
		String B = "abababab";
		System.out.println(solve(A,B));
	}

	public static int solve(String A,String B) {
		
		B = B+B;
        String str = A+'$'+B.substring(0, B.length()-1);
        
		int l = 0, r = 0; // Already in segment
		int n = A.length();
		int Z[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (i > r) { // No info
				int j = i, k = 0;
				while (j < n && (A.charAt(j) == A.charAt(k))) {
					j++;
					k++;

				}
				Z[i] = k;
				l = i;
				r = j - 1;
			} else {
				if (Z[i - l] < r - i + 1) {
					// Copy
					Z[i] = Z[i - l];

				} else {
					int j = r + 1;
					int k = r - i + 1; // j-i
					while (j < n && (A.charAt(j) == A.charAt(k))) {
						Z[i] = k;
						l = i;
						r = j - 1;
					}
				}
			}
			if (Z[i] == n - i) {

				System.out.println(i);
				return i;
			}

		}
		return n;

	}
}

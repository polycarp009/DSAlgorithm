package com.learn.string;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(solve("scaler"));
	}

	public static String solve(String A) {
		/*
		 * Using String Builder 
		 * StringBuilder str= new StringBuilder(); 
		 * str.append(A);
		 * str.reverse(); return str.toString();
		 */

		char s[] = A.toCharArray();
		int N = A.length();
		for (int i = 0; i < N / 2; i++) {
			char temp = s[i];
			s[i] = s[N - 1 - i];
			s[N - 1 - i] = temp;
		}
		return new String(s);
	}
}

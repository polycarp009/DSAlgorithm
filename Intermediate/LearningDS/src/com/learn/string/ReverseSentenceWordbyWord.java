package com.learn.string;

import java.util.Arrays;

public class ReverseSentenceWordbyWord {
	public static void main(String[] args) {
		System.out.println(solve("i am poly"));
	}

	public static String solve(String A) {
		String[] words = A.split(" ");
		int N=words.length;
//		for (int i = 0; i < words.length; i++) {
//			String temp= words[i];
//			words[i]=words[words.length-1-i];
//			words[words.length-1-i]=temp;
//		}
//		return Arrays.toString(words);
		StringBuilder str = new StringBuilder();
		for (int i = N-1; i >=0; i--) {
			if(str.length()!=0) {
			str.append(" "+words[i]);
			}else {
				str.append(words[i]);
			}
		}
		return str.toString();
	}
}

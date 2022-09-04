package com.learn.string;

import javax.print.attribute.standard.RequestingUserName;

public class palindromecheck {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abb"));
	}

	public static String longestPalindrome(String A) {
		int oddans = 0,evenans=-1;
		int result[] = new int[3];
		String oddout =null,evenout=null;
//		odd length
		System.out.println("*********Odd******");
		for (int i = 0; i < A.length(); i++) {
			result = expand(A, i, i);
			if (result[0] > oddans) {
				System.out.println("***ODD string***");
				for (int j = result[1]; j <= result[2]; j++) {
					System.out.print(A.charAt(j));
				}
				System.out.println("\n***ODD string END***");
				oddans = result[0];
				oddout = A.substring(result[1], result[2]+1);
				System.out.println("ODD OUT: "+oddout);
			}
		}
		
//		even length
		System.out.println("*********Even******");
		for (int i = 0; i < A.length()-1; i++) {
			result = expand(A, i, i+1);
			
			if (result[0] > evenans) {
//				System.out.println("P1:" + result[1]+"  P2: "+result[2]);
				System.out.println("***EVEN string***");
				for (int j = result[1]; j <= result[2]; j++) {
					System.out.print(A.charAt(j));
				}
				System.out.println("\n***EVEN string end***");
				evenans = result[0];
				evenout = A.substring(result[1], result[2]+1);
				System.out.println("EVEN OUT: "+evenout);
			}
		}
		
		
		return evenans>oddans?evenout:oddout;
	}

//	p1,p2 point to two after the middle and expand till they are unequal;
	public static int[] expand(String s, int p1, int p2) {
		while (p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)) {
//			
			p1--;
			p2++;
		}
//		System.out.println(p1+1 + " " + (p2-1));
//		System.out.println("lenght: " + (p2 - p1 - 1));
		int output[] = { (p2 - p1 - 1), (p1 + 1), (p2-1) };
		return output;
	}

}

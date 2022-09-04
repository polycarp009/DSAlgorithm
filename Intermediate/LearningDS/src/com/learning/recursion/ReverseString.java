package com.learning.recursion;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		reverse(inputString,inputString.length()-1);
	}
	
	public static void reverse(String A,int E) {
		if(E<0) {
			return;
		}
		System.out.print(A.charAt(E));
		 reverse(A, --E);
		
	}

}

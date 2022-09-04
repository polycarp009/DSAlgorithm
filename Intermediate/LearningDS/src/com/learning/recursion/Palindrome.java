package com.learning.recursion;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Ans:"+solve("malayalam"));
	}
	 public static int solve(String A) {
		 
		 return checkpalindrome(A,0,A.length()-1);

	    }
	 
	 public static int checkpalindrome(String A,int s,int e) {
		 if(s>=e) {
			 return 1;
		 }
		 if(A.charAt(s)==A.charAt(e)) {
			 System.out.println("Start: "+s+" End: "+e+" Char S: "+A.charAt(s)+" Char E: "+A.charAt(s));
			 return checkpalindrome(A, ++s, --e);
		 }else {
			 return 0;
		 }
	 }
	 
	 
}

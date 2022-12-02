package com.learn.stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveRepeatedChar {
	public static void main(String[] args)
	{
		String A="abba";
		System.out.println(solve(A));
	}
	
	public static String solve(String A) {
		Stack<Character> st1 = new Stack<>();
		for (int i = 0; i < A.length(); i++) {
			if(!st1.isEmpty()&&st1.peek().equals(A.charAt(i))) {
				st1.pop();
			}else {
				st1.push(A.charAt(i));
			}
		}
		
		
		String ans= Arrays.toString(st1.toArray());
		if(st1.isEmpty()) {
			return "";
		}else {
		return	Arrays.toString(st1.toArray());
		}
//		return ans ;
	}
}

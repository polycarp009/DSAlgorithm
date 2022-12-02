package com.learn.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidateParanthesis {
	public static void main(String[] args)
	{
		String A="))))))))";
		System.out.println(solve(A));
	}
	
	public static int solve(String A) {
		int ans=0;
		Stack<Character> st1 = new Stack<>();
		for (int i = 0; i < A.length(); i++) {
//			System.out.println(A.charAt(i));
			HashMap<Character, Character> hm = new HashMap<>();
			hm.put(')', '(');
			hm.put('}', '{');
			hm.put(']', '[');
			char x=A.charAt(i);
			if(hm.containsValue(x)) {
				st1.push(x);
			}else {
				if(!st1.isEmpty()&&hm.get(x).equals((st1).peek())) {
					st1.pop();
				}else {
					return 0;
				}
			}
			
		}
		if(st1.isEmpty()) {
			return 1;
		}else 
		return 0;
		
	}
}

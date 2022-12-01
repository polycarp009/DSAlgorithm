package com.learn.stack;

import java.util.Arrays;
import java.util.Stack;

public class SortStack {
	public static void main(String[] args)
	{
		int[] A= {5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(solve(A)));
	}
	
	public static int[] solve(int[] A) {
		int n=A.length;
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		for (int i = 0; i < A.length; i++) {
			st1.push(A[i]);
		}
		
		while(!st1.empty()) {
			int temp=st1.peek();
			st1.pop();
			while(!st2.isEmpty()&&st2.peek()<temp) {
				int x=st2.peek();
				st1.push(x);
				st2.pop();
			}
			st2.push(temp);
		}
		
		int i = 0;
		int[] ans=new int[n];
		while (!st2.isEmpty()) {
			ans[i++] = st2.pop();
		}
		System.out.println("ans:"+Arrays.toString(ans));
		
		
		return ans;
    }
}

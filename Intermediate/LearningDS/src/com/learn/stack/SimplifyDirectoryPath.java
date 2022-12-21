package com.learn.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SimplifyDirectoryPath {
	public static void main(String[] args)
	{
		String A = "/../";
		System.out.println(solve(A));
	}

	public static String solve(String A) {
		Stack<String> st1 = new Stack<>();
		String[] name=A.split("/");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
//			if(name[i].length()==0)
//				continue;
			if(!st1.isEmpty()&&name[i].contains("..")) {
			st1.pop();	
			}else if(!name[i].equals(".") && !name[i].equals("..") && !name[i].equals("")) {
				st1.push(name[i]);
			}
			System.out.println((st1));
		}
		
		List < String > list = new ArrayList(st1);
		String ans = String.join("/", list);
		  return "/"+ans;
		

	}
}

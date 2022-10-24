package com.learning.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {
	
	public static void main(String[] args) {
		System.out.println(grayCode(2));
	}
	
	 public static ArrayList<Integer> grayCode(int A) {
		 ArrayList<Integer> ans = new ArrayList<>();
		 if(A==1)
			 return new ArrayList<Integer>(Arrays.asList(0,1));
	    
		 ArrayList<Integer> smallerAns = grayCode(A-1);
		 ans.addAll(smallerAns);
		 for (int i = smallerAns.size()-1; i >=0; i--) {
			ans.add((int) (smallerAns.get(i)+Math.pow(2, A-1)));
		}
	
		 return ans;
	 }
}

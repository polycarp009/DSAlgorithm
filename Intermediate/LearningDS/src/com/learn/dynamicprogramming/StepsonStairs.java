package com.learn.dynamicprogramming;

import java.util.Arrays;

public class StepsonStairs {
	 static int[] dpArray;
	 public int climbStairs(int A) {
		 dpArray = new int[A+1];
		 Arrays.fill(dpArray, -1);
	
		 return countStep(A);

	
	    }
	private int countStep(int n) {
		// TODO Auto-generated method stub
		 
		 if(n==1) return 1;
		 if(n==2) return 2;
		 //if already present return the stored value;
		 if(dpArray[n] != -1) return dpArray[n];
		 //Store it if not present
		 dpArray[n]=countStep(n-1)+countStep(n-2);

		 return dpArray[n];
	}
}

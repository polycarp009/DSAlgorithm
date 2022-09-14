package com.learning.recursion;

public class RecursionIsMagic {
	
//	A number is said to be a magic number if the sum of its digits is calculated till a 
//	single digit recursively by adding the sum of the digits after every addition. 
//	If the single digit comes out to be 1, then the number is a magic number.
	public static void main(String[] args) {
		System.out.println("Ans:"+solve(83557));
	}

	public static int solve(int A) {
		 if(sum(A) == 1)
	            return 1;
	        return 0;
	}
	
 public static int sum(int A) {
		if(A==1) {
			return 1;
		}
		if(A==0) {
			return 0;
		}
		int ans = sum(A/10) + A%10; 
		
		if(ans/10==0) {
			return ans;
		}else {
			return sum(ans);
		}
		
	}
}

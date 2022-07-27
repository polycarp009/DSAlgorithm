package com.learn.array;

public class FindPairMatchSum {

	public static void main(String[] args) {
		int A[]= {1,2,4};
		solve(A, 4);
	}

	/*
	 * Given an array A and an integer B. A pair(i, j) in the array is a good pair
	 * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
	 * 
	 * in this approach we included the if(i!=j) inside the loop itself
	 * as j=i+1 it will never be equal.
	 * 
	 * and we are considering only the upper triangle array to avoid 
	 * checking same pair again
	 * 
	 * Iterations: n(n-1)/2
	 * Time Complexity: O(N^2)
	 * Space Complexity: O(1)
	 */
	public static int solve(int[] A, int B) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] + A[j] == B) {
					System.out.println("Got Pair: "+A[i]+" + "+A[j]);
					return 1;
					
				}
			}
		}
		return 0;

	}
}

package com.learn.twopointer;

/*Given a sorted array of integers (not necessarily distinct) A and an integer B, 
find and return how many pair of integers ( A[i], A[j] ) 
such that i != j have sum equal to B.*/

public class PairsSum {
	public static void main(String[] args) {
//		int A[] = {1, 2, 3};

//		int A[] = {1, 1};
//		B= 2 out: 3 

		int A[] = { 2, 3, 5, 6, 10 };
//		B= 6 out: 0 
		System.out.println(solve(A, 6));

	}

	public static int solve(int[] A, int B) {
		int i = 0, j = A.length - 1, count = 0,mod=1000000007;
		while (i < j) {
			int ans = A[i] + A[j];
//			System.out.println("Ans:"+ans);
			if (ans == B) {

				int val = 0, prev = j;
				while (prev > i && A[j] == A[prev]) {// count duplicate values from right pointer
					val++;
					prev--;
				}
				i++;
				count = (count+val)%mod;
			} else if (ans < B) {
				i++;

			} else if (ans > B) {
				j--;
			}
		}
		return count;

	}

}

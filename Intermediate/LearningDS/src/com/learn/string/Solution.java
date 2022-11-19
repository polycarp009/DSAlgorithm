package com.learn.string;

public class Solution {

//	You are given a string A of length N consisting of lowercase alphabets. Find the period of the string.
//	Period of the string is the minimum value of k (k >= 1), that satisfies A[i] = A[i % k] for all valid i.
public static void main(String[] args) {
		
		String A="abababab";
		//2
		System.out.println(solve(A));
	}

    public static int solve(String A) {

        int n = A.length();
        if(n == 1)
            return 1;
        int[] Z = new int[n];
        Zstring(Z, A, n);
        for(int i=1; i<n; i++)
        {
            if(Z[i] == n-i) {
            	System.out.println("i:"+i);
                return i;
            }
            
        }
        System.out.println("n:"+n);
        return n;
    }

    // Z-String Algorithm
   static void  Zstring(int[] Z, String A, int n)
    {
        int left = 0, right = 0;
        for(int i=1; i<n; i++)
        {
            if(i > right)
            {
                left = right = i;
                while(right < n && A.charAt(right) == A.charAt(right-i))
                    right++;
                Z[i] = right-left;
                right--;
            }
            else
            {
                if(Z[i-left] < right-left+1)
                    Z[i] = Z[i-left];
                else
                {
                    left = i;
                    while(right < n && A.charAt(right) == A.charAt(right-i))
                        right++;
                    Z[i] = right-left;
                    right--;
                }
            }
        }
    }
}

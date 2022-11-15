package com.learn.twopointer;

import java.util.Arrays;

public class Subarraywithgivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {15, 2, 48, 19, 28, 22, 44, 2, 32, 46, 46, 24, 1, 23, 49, 26, 23, 17, 17, 46, 4, 30, 40, 36, 20, 5 };
System.out.println(Arrays.toString(solve(A,82)));
	}
	
	public static int[] solve(int[] A, int B) {
		int i = 0, j = 0,mod=1000000007;
//		int arr[] = new int[2];
		int ans = A[i];
		while (j<A.length && i<A.length) {
			int a=A[i];
			int b=A[j];
			
			System.out.println("Ans:"+ans);
			if (ans == B) {
				System.out.println(i+"::"+A[i]+"=="+j+"::"+A[j]);
		
			int arr[] = new int[j-i+1];
//				 while(i < A.length && A[i] == a) i++;// sliding window to avoid duplicate pairs
//	                while(j < A.length && A[j] == b) j++; 
			int count=0;
	               for (int k = i; k <= j; k++) {
					arr[count++]=A[k];
				}
	           
	               return arr;
			} else if (ans < B) {
				j++;
				if(j<A.length) {
					ans+=A[j];
				}

			} else if (ans > B) {
				if(i<A.length) {
				ans-=A[i];
				}
				i++;
			
			}
//			if(i==j) {
//				j++;
//			}
		}
		return new int[] {-1};
	}

}

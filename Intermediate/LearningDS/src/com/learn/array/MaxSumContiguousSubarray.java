package com.learn.array;

//Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
public class MaxSumContiguousSubarray {
	
	public static void main(String[] args) {
		int[] A= {1, 2, 3, 4, -10};
		System.out.println(maxSubArray(A));
	}
    public static int maxSubArray(final int[] A) {
	int start=0, end = 0;
		long sum=0;
		int beg=0;
		long ans=Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length; i++) {
			
			sum+=A[i];
			beg=i;
			if(sum>ans) {
				end=i;
				start=beg;
			}
			ans=ans>sum?ans:sum;
			
			if(sum<=0) {
				sum=0;
				start=i+1;
			}
			
			System.out.println("I: "+A[i]+" ANS : "+ans+" sum: "+sum);
			System.out.println("Start: "+start+" End: "+end);
		}
		return (int)ans;
    }
}

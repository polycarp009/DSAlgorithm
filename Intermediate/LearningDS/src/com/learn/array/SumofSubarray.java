package com.learn.array;

public class SumofSubarray {
	public static void main(String[] args) {
		int A[] = {-500};
		System.out.println(subarraySum(A));
	}

	// find the sum of all subarray sums of A.
	/*
	 * public static long subarraySum(int[] A) { int sum=0;
	 * 
	 * int start; int freq=0; for (int i = 0; i < A.length; i++) {
	 * 
	 * start = i+1; int end =A.length-i;
	 * System.out.println("Start: "+start+" End: "+end); freq=start*end;
	 * System.out.println("Freq: "+freq); sum=sum+A[i]*freq;
	 * 
	 * } return sum;
	 * 
	 * }
	 */

	/*
	 * //find subarray sum less than B public static long subarraySum(int[] A) { int
	 * sum=0; int B=12; int max=0;
	 * 
	 * for (int i = 0; i < A.length; i++) { sum=0; for (int j = i; j < A.length;
	 * j++) { sum+=A[j]; System.out.println("i:"+i+"j:"+j+" :"+sum); if(sum<=B) {
	 * max=sum>max?sum:max; } } } System.out.println("max:"+max); return max;
	 * 
	 * }
	 */

	// Subarray with least average
	public static int subarraySum(int[] A) {
		int avg = 0;
		int B = 12;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {

				avg += A[i];

				max = avg > max ? avg : max;
				if(avg<0) {
					avg=0;
				}

			}

		return max;

	}
}

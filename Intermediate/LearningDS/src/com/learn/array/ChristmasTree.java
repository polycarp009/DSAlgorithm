package com.learn.array;

public class ChristmasTree {
	public static void main(String[] args) {
		int A[] = {1,6,4,2,6,9};
		int B[] = {2,5,7,3,2,7};

		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int[] B) {
		int ans = Integer.MAX_VALUE;
		for (int j = 2; j < A.length; j++) {
			int temp_sum = B[j];
			int val_i = Integer.MAX_VALUE;
			int val_k = Integer.MAX_VALUE;
			for (int i = 0; i < j; i++) {
				if ((A[i] < A[j]) && (B[i] < val_i)) {
					val_i = B[i];
//					System.out.println(val_i);
				}
			}
			for (int k = j+1; k <A.length; k++) {
				if ((A[k] > A[j]) && (B[k] < val_k)) {
					val_k = B[k];
//					System.out.println(val_k);
				}
			}
			System.out.println("j: "+j+"k: "+val_k+"i : "+val_i);
			if ((val_i!=Integer.MAX_VALUE) &&(val_k!=Integer.MAX_VALUE)) {
				temp_sum=temp_sum+val_i+val_k;
				System.out.println("temp sum"+temp_sum);
				ans = Math.min(ans,temp_sum);
				System.out.println("final ans"+ans);
			}
		}
		if(ans==Integer.MAX_VALUE) {
			return -1;
		}else {
			return ans;
		}
		

	}
}

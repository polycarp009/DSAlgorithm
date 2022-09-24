package com.learn.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class SubArraywithGivenSum {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(Arrays.toString(solve(A, 5)));
	}

	public static int[] solve(int[] A, int B) {
		long[] pfsum = new long[A.length];
		HashMap<Long, Integer> hashMap = new HashMap<>();
		pfsum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			pfsum[i] = pfsum[i - 1] + A[i];
			if (!hashMap.containsKey(pfsum[i])) {
				hashMap.put(pfsum[i], i);
			}
		}
		
		
		System.out.println(Arrays.toString(pfsum));
		for (Entry<Long, Integer> entry : hashMap.entrySet()) {
		System.out.println(entry.getKey()+" : "+entry.getValue());
		
	}
		return A;
	}
}

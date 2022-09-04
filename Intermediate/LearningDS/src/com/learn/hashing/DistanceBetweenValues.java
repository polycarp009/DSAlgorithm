package com.learn.hashing;

import java.util.HashMap;
import java.util.Map;

public class DistanceBetweenValues {
	public static void main(String[] args) {
		int A[] = { 1,1 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (!hashMap.containsKey(A[i])) {
				hashMap.put(A[i], i);

			} else {
				int j = hashMap.get(A[i]);
				if (diff > (i - j)) {
					diff = i - j;

				}
			}

		}

		if (diff != Integer.MAX_VALUE) {
			return diff;
		} else {
			return -1;
		}

	}

}

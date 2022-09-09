package com.learn.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class FindTwoSumHashing {

	public static void main(String[] args) {
		int A[] = { 2, 7, 11, 15 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(Arrays.toString(twoSum(A, 9)));
	}

	public static int[] twoSum(final int[] A, int B) {

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		int value = 0;
		for (int i = 0; i < A.length; i++) {
			value = B - A[i];
			if (hashMap.containsKey(A[i])) {
				System.out.println("i:" + i + "A:" + A[i]);
				return new int[] { hashMap.get(A[i]), i + 1 };
			}

			if (!hashMap.containsKey(value)) {
				hashMap.put(value, i + 1);
			}
		}

		return new int[] {};
	}

}

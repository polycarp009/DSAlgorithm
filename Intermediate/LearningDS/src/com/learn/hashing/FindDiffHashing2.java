package com.learn.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindDiffHashing2 {

	public static void main(String[] args) {
		int A[] = { 1,3,2 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(diffPossible(A, 0));
	}

	public static int diffPossible(final int[] A, int B) {
		HashSet<Integer> set = new HashSet<>();
//		if (A.length < 2 || B == 0) {
//			return 0;
//		}
		int value = 0;
		for (int i = 0; i < A.length; i++) {
			value = B + A[i];
			System.out.println(value + "  "+(A[i] - B));
			System.out.println("I:" + i + "Value:" + value);

			if (set.contains(value) || set.contains(A[i] - B)) {
				return 1;
			}else{
				set.add(A[i]);
			}
		}

		return 0;
	}

}

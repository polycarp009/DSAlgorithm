package com.learn.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepatingElement {

	public static void main(String[] args) {
		int A[] = { 10, 1, 3, 4, 7, 5, 6 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i : A) {
			if (!hashMap.containsKey(i)) {
				hashMap.put(i, 1);

			} else {
				hashMap.replace(i, hashMap.get(i) + 1);
			}
		}

		for (int i : A) {
			if (hashMap.containsKey(i)) {
				if (hashMap.get(i) > 1) {
					return i;
				}

			}
		}

//		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//			
//		}
		return 0;
	}
}

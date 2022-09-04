package com.learn.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SubArraywith0sum {
	public static void main(String[] args) {
		int A[] = { 1, -1 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
//		HashSet<Integer> set = new HashSet<>();

		int sum = 0;
		for (int i = 0; i < A.length; i++) {
//			System.out.println("i: " + i + "A: " + A[i]);
			sum+= A[i];
//			System.out.println("sum:"+sum);
			
			if(sum==0) {
				return 1;
			}
			if(!hashMap.containsKey(sum)) {
				hashMap.put(sum,i);
			}else {
				return 1;
			}
		}
		
//		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//		System.out.println(entry.getKey()+" : "+entry.getValue());
//		
//	}
//		System.out.println(set.toString());
//		if (set.size() < A.length || set.contains(0L)) {
//			return 1;
//		}
		
		return 0;
	}
}
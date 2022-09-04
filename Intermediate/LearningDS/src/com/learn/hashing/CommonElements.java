package com.learn.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {
	public static void main(String[] args) {
		int A[] = { 1, 2, 2, 1 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(solve(A, B));
	}

	public static int[] solve(int[] A, int[] B) {
		ArrayList<Integer> outputlist = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i : A) {
			if (!hashMap.containsKey(i)) {
				hashMap.put(i, 1);

			} else {
				hashMap.replace(i, hashMap.get(i) + 1);
			}
		}
		for (int i : B) {
			if (hashMap.containsKey(i) && hashMap.get(i)>0) {
				hashMap.replace(i, hashMap.get(i) - 1);
				outputlist.add(i);
			} 
		}
//		System.out.println(outputlist.toString());
		return outputlist.stream().mapToInt(i -> i).toArray(); 
		
	
	}
}

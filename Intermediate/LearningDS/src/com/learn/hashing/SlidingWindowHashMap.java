package com.learn.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowHashMap {
	public static void main(String[] args) {
		int A[] = {1, 2, 1, 3, 4, 3};
		int B[] = { 2, 3, 1, 2 };
		System.out.println(Arrays.toString(dNums(A,3)));
	}
	public static int[] dNums(int[] A, int B) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int[] distictResult = new int[A.length-B+1] ;
		//Insert first B elements
		
		for (int i = 0; i < B; i++) {
			if(hashMap.containsKey(A[i])) {
				hashMap.replace(A[i], hashMap.get(A[i]) + 1);
			}else {
				hashMap.put(A[i], 1);
			}
		}
		distictResult[0]=hashMap.size();
		int k=1;
		
		//Insert next B Elements till end
		for (int i = 1, j= B;i <= A.length-B; j++, i++) {
			hashMap.replace(A[i-1],hashMap.get(A[i-1])-1 );
			if(hashMap.get(A[i-1])==0) {
				hashMap.remove(A[i-1]);
			}
			if(hashMap.containsKey(A[j])) {
				hashMap.replace(A[j], hashMap.get(A[j]) + 1);
			}else {
				hashMap.put(A[j], 1);
			}
			distictResult[k++]=hashMap.size();
		}
		
		return distictResult;
	}
    
}

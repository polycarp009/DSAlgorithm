package com.learn.hashing;

import java.util.HashMap;

public class CountRightTriangles {
	
	public static void main(String[] args) {
		int A[] = {1, 1, 2, 3, 3};
		int B[] = { 1, 2, 1, 2, 1 };
		System.out.println(solve(A,B));
	}
    public static int solve(int[] A, int[] B) {
    HashMap<Integer,Integer> hm_X= new HashMap<>();
    HashMap<Integer,Integer> hm_Y= new HashMap<>();
    //Insert x cordinates to hashmap
    	for (int i = 0; i < A.length; i++) {
			if(hm_X.containsKey(A[i])) {
				hm_X.put(A[i], hm_X.get(A[i])+1);
			}else {
				hm_X.put(A[i], 1);
			}
		}
        //Insert y cordinates to hashmap
    	for (int i = 0; i < B.length; i++) {
			if(hm_Y.containsKey(B[i])) {
				hm_Y.put(B[i], hm_Y.get(B[i])+1);
			}else {
				hm_Y.put(B[i], 1);
			}
		}
    	
//    	System.out.println(hm_X);
//    	System.out.println(hm_Y);
    	int countx=0,county=0,ans=0;
    	for (int i = 0; i < B.length; i++) {
			countx=hm_X.get(A[i])-1;
			county=hm_Y.get(B[i])-1;
//			System.out.println(countx+"::"+county);
		ans+=countx*county;
//		System.out.println(ans);
    	}
		return ans;
    }
}

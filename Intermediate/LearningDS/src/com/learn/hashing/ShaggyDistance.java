package com.learn.hashing;

import java.util.HashMap;

public class ShaggyDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 7, 1, 3, 4, 1, 7};
		System.out.println(longest(A));
	}

	public static int longest(int[] A) {
int n= A.length;
int ans=0,dis=-1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for (int i=0;i<n;i++) {
			System.out.println("i:"+i);
			if(hm.containsKey(A[i])) {
				
			ans=ans>i-hm.get(A[i])?ans:hm.get(A[i]);
		dis=i-hm.get(A[i]);

		
			System.out.println("Ans:"+ans);
			hm.put(A[i], i);
			System.out.println(dis);
			}else {
				hm.put(A[i], i);
			}
		
			System.out.println(hm);
		}
		
		return dis;
	}
}

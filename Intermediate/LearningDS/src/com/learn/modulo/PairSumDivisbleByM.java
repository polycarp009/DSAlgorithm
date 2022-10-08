package com.learn.modulo;

import java.util.Arrays;
import java.util.HashMap;

public class PairSumDivisbleByM {
	public static void main(String[] args) {
//		int A[] = { 1, 2, 3, 4, 5 };
		int A[] = { 5, 17, 100, 11 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println((solve(A, 28)));
	}

	public static int solve(int[] A, int B) {
		int n = A.length;
		int zerocount=0;
		for (int i = 0; i < n; i++) {
			A[i]=A[i]%B;
			if(A[i]==0) {
				zerocount++;
			}
		}
		System.out.println("zeroCount: "+zerocount);
		System.out.println(Arrays.toString(A));
		
		int ans=0;
		ans=(zerocount*(zerocount-1))/2;
		
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < n; i++) {
		if(!freq.containsKey(A[i]) && A[i]!=0) {
			freq.put(A[i], 1);
		}else { if(A[i]!=0) {
			freq.put(A[i],freq.get(A[i])+1);
//			ans=ans+freq.get(A[i]);
			
		}}
		}
		
		for (int i = 0; i < n; i++) {
			int target = B-A[i];
			System.out.println("Target: "+target);
		
			if(freq.containsKey(target) && freq.get(target)>1) {
				ans+=1;
			}
//			}else 
//				freq.put(A[i],freq.get(A[i])+1);
//				ans=ans+freq.get(A[i]);
//				
//			}System.out.println("------------------------------");
			freq.entrySet().forEach(entry -> {
				
			    System.out.println(entry.getKey() + " " + entry.getValue());
			   
			});
			System.out.println("------------------------------");
//			
			System.out.println("ans: "+ans);
			
			} 
	
		return ans;
	}
			
}

package com.learn.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 1};
System.out.println(longest(A));
	}
	
	public static int longest(int[] A) {
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			hs.add(A[i]);
		}
		System.out.println(hs);
		int ans=0;
		
		for (int i = 0; i < A.length; i++) {
			int x = A[i];
			if(!hs.contains(x-1)) {
				int y = x+1,chain=1;
				System.out.println("Y:"+y);
				while(hs.contains(y)) {
					System.out.println("Y found for:"+x+"::::" +y);
					chain++;
					y++;
				}
				ans=ans>chain?ans:chain;
			}
		}
		return ans;
	}

}

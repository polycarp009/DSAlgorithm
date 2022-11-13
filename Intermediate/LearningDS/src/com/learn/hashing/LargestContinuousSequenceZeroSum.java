package com.learn.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {
	public static void main(String[] args) {
		int A[] = { 1,2,-3,3};
//		int A[] = {  1, 2, -2, 4, -4  };
		System.out.println(solve(A));
		
	}

	public static int[] solve(int[] A) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		ArrayList<Integer> rst = new ArrayList<Integer>();

		int lenght=0,l=-1,r=-1;
		int sum = 0;
		 hashMap.put(0, -1);
		for (int i = 0; i < A.length; i++) {
//			System.out.println("i: " + i + "A: " + A[i]);
			sum+= A[i];
			if(!hashMap.containsKey(sum)) {
				hashMap.put(sum,i);
			}else {
				if(i-hashMap.get(sum)>lenght) {
					l=hashMap.get(sum)+1;
					r=i;
					System.out.println("l:"+l+" r:"+r);
					lenght=i-hashMap.get(sum);
			}
			
		}
		}
		System.out.println(hashMap.toString());
//		if (hashMap.size() < A.length || hashMap.containsValue(0)) {
//			return 1;
//		}
//		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//		System.out.println(entry.getKey()+" : "+entry.getValue());
//		
//	}
		if(l >=0 && r >= 0){
            for(int i = l; i <= r; i++){
                rst.add(A[i]);
            }
        }
		rst.stream().forEach(System.out::println);
		return rst.stream().mapToInt(i -> i).toArray();
	}
}

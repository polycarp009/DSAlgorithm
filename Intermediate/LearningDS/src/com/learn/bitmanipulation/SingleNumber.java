package com.learn.bitmanipulation;

//find Number without pair
public class SingleNumber {
	
	public static void main(String[] args) {
		
		int[] A= {1, 2, 2, 3, 1};
		System.out.println(singleNumber(A));
	}
	
public static int singleNumber(final int[] A) {
	int xor=A[0];
	for (int i = 1; i < A.length; i++) {
		xor^=A[i];
	}
//	System.out.println(xor);
	return xor;
        
    }

}

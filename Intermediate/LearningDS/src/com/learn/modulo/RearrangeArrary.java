package com.learn.modulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
public class RearrangeArrary {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(0);
		System.out.println(Arrays.toString(A.toArray()));
		arrange(A);
		System.out.println(Arrays.toString(A.toArray()));
	}

	public static void arrange(ArrayList<Integer> A) {
//        int[] newResult = new int[A.size()];
		int n = A.size();
		for (int i = 0; i < n; i++) {
			A.set(i, A.get(i) * n);
		}
		for (int i = 0; i < n; i++) {
			int index = A.get(i) / n;
			int newValue = A.get(index) / n;
			A.set(i, A.get(i) + newValue);
		}
		
		for (int i = 0; i < n; i++) {
			A.set(i, A.get(i) % n);
		}
		
	}

}

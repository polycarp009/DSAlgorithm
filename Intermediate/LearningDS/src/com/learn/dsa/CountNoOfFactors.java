package com.learn.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountNoOfFactors {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		List<Integer> anotherList = Arrays.asList(2, 3, 4, 5);
		A.addAll(anotherList);
		System.out.println(solve(A));
	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		System.out.println(A.size());
		//Get MAX number in the ArrayList
		int n=Collections.max(A);
		System.out.println(n);
		int[] countFactor = countfactors(n);
		ArrayList<Integer> resultFactors = new ArrayList<>();
		for(int i=0;i<A.size();i++) {
			resultFactors.add(countFactor[A.get(i)]);
		}
		return resultFactors;
    }
	
	public static int[] countfactors(int n) {
		int[] factors = new int[n+1];
		for(int i=1;i<=n;i++) {
			for (int j = i; j <=n; j=j+i) {
				factors[j]++;
			}
		}
		return factors;
	}
	
}

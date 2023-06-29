package com.learn.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class FindAllPrime {
public static void main(String[] args) {
	System.out.println((findPrime(6)));
}

//Prints to the List all Prime
public static ArrayList<Integer> findPrime(int A) {
	
	boolean[] primeArray = createArrayPrime(A);
	ArrayList<Integer> result = new ArrayList<Integer>();
	int cnt=0;
	for (int i = 2; i <= A; i++) {
		if(primeArray[i]==true) {
			result.add(i);
			cnt++;
		}
	}
	return result;
	
}
//creates the array of all Prime
	public static boolean[] createArrayPrime(int A) {
		boolean arrayPrime[] = new boolean[A+1];
		int n = (int) Math.sqrt(A);
		
		for (int i = 2; i <= A; i++) {
			arrayPrime[i]=true;
		}
		
		for (int i = 2; i <= n; i++) {
			if(arrayPrime[i]==true) {
		for (int j = i*i; j <= A; j=j+i) {
			arrayPrime[j]=false;
		}
			}
		}
		return arrayPrime;
    }
}

package com.learn.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class NoofOpenDoors {

	public static void main(String[] args) {
		System.out.println((findPrime(6)));
	}

	//Prints to the List all Prime
	public static int findPrime(int A) {
		
		boolean[] primeArray = createArrayPrime(A);
//		ArrayList<Integer> result = new ArrayList<Integer>();
		int cnt=0;
		for (int i = 1; i <= A; i++) {
			if(primeArray[i]==true) {
			
				cnt++;
			}
		}
		System.out.println(Arrays.toString(primeArray));
		return cnt;
		
	}
	//creates the array of all Prime
		public static boolean[] createArrayPrime(int A) {
			boolean arrayPrime[] = new boolean[A+1];
			int n = (int) Math.sqrt(A);
			
			for (int i = 1; i <= A; i++) {
				arrayPrime[i]=false;
			}
			
			for (int i = 1; i <= A; i++) {
			for (int j = i; j <= A; j=j+i) {
				System.out.println("j:"+j);
				if(arrayPrime[j]==false) {
				arrayPrime[j]=true;
				}else {
					arrayPrime[j]=false;
				}
			}
				}
			
			return arrayPrime;
	    }

}



//Easy solution is to return sqrt of the no.
//public class Solution {
//    public int solve(int A) {
//        return (int)Math.sqrt(A);
//    }
//}



//1  1 2 3 4 5 6
//   T T T T T T
//2  T F T F T F
//3  T F F F T T
//4  T F F T T T
//5  T F F T F T
//6  T F F T F F

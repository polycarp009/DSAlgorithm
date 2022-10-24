package com.learn.sorting;

import java.util.Arrays;

//You want to find the Bth element in the array.
//Selection sort is the best algorithm to use here to do it in less than equal B swaps.
/*The algorithm of selection sort should be used.
The selection sort algorithm sorts an array by repeatedly
finding the minimum element (considering ascending order)
from unsorted part and putting it at the beginning.
You need to get the minimum element to the beginning of the array
only B times as you require the Bth element*/
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1};
		System.out.println(kthsmallest(A, 1));

	}
	public static int kthsmallest(final int[] A, int B) {
		int swap=0;
		for (int i = 0; i < B; i++) {
			int min= A[i];
			int index=i;
			for(int j=i;j<A.length;j++) {
				if(min>A[j]) {
					min=A[j];
					index=j;
				}
			}
			A[index]=A[i];
			A[i]=min;
			swap++;
			System.out.println("Swap: "+swap+"min: "+min);
		}
		System.out.println(Arrays.toString(A));
		return A[B-1];
    }

}

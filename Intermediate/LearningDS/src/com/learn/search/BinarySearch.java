package com.learn.search;

/*
Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.*/

//You need to return the index of least element >= x.
//You can do this by binary search.
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,5,7};
System.out.println(search(A,8));
	}

	public static int search(int A[],int k) {
		int l=0,r=A.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(A[mid]==k) {
				return mid;
			}else if(A[mid]<k) {
				l=mid+1;
			
			}else {
				r=mid-1;
			}
		}
		System.out.println(l);
		return l;
	}
}

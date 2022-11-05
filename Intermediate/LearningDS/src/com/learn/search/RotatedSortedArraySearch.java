package com.learn.search;

public class RotatedSortedArraySearch {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {3,5,7,8,9,1,2};
System.out.println(search(A,1));
	}

	public static int search(int A[],int k) {
		int l=0,r=A.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(A[mid]==k) {
				return mid;
			}else if(A[mid]>=A[l]) {
				if(k<=A[mid]&&k>=A[l]) {
					r=mid-1;
				}else {
				l=mid+1;
				}
			}else {
				if(k>=A[mid]&&k<=A[r]) {
					l=mid+1;
				}else {
				r=mid-1;
				}
			}
		}
		return -1;
	}
}

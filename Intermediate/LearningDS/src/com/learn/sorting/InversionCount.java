package com.learn.sorting;

import java.util.Arrays;

public class InversionCount {
	public static void main(String[] args) {
		int[] A= {45, 10, 15, 25, 50 };
		int[] B= {2};
		System.out.println(solve(A));
	}
	
	 public static int solve(int[] A) {
		return invCount(A, 0, A.length-1);
	    }
	 
	 public static int invCount(int[] A,int l,int r) {
		
		 if(l==r) return 0;
		 int mid = (l+r)/2;
		 int x=invCount(A,l,mid);
		 int y=invCount(A,mid+1,r);
		 int z=merge(A,l,mid+1,r);
		 
		return x+y+z;
	    }
	public static int merge(int[] A,int l,int y,int r) {
		int p1=l,p2=y,p3=0;
		int invCount=0;
		int temp[]= new int[r-l+1];
		
		while(p1<y && p2<=r) {
			if(A[p1]<=A[p2]) {
				temp[p3]=A[p1];
				p1++;
			}else {
				temp[p3]=A[p2];
				p2++;
				invCount+=y-p1;
			}
		p3++;
		}
		while(p1<y) {
			temp[p3]=A[p1];
			p1++;p3++;
		}while(p2<=r) {
			temp[p3]=A[p2];
			p2++;p3++;
		}
		
		for(int i=l;i<=r;i++) {
			A[i]=temp[i-l];
		}
		
		return invCount;
	}
}

package com.learn.search;

public class FindthePeakBinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2, 3};
		System.out.println(solve(A));
	}

	public static int solve(int A[]) {
		int n = A.length;
		if (A.length == 1)
			return A[0];
		if (A.length<=2 && A[1] > A[0])
			return A[0];
//		if (A[n - 1] > A[n - 2]) {
//			return A[n - 1];
//		}

		int l = 0, r = A.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
//			System.out.println("Mid:"+mid);
			if ((mid==0||A[mid] >= A[mid - 1]) &&(mid==n-1|| A[mid]>= A[mid + 1])) {
				return A[mid];
			} else if (A[mid] >= A[mid - 1]) {
				l = mid + 1;
			} else {
				r = mid - 1;

			}
		}
		return -1;
	}
}

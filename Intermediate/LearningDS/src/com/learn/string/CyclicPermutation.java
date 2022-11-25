package com.learn.string;

import javax.swing.plaf.synth.SynthSpinnerUI;

//Given two binary strings A and B, count how many cyclic shift of B when taken XOR with A give 0.
public class CyclicPermutation {

	public static void main(String[] args) {

		String A = "111";
		// 2
		String B = "111";
		System.out.println("Res:" + solve(A, B));
	}

	public static int solve(String A, String B) {

		B = B + B;
//		int aLen = C.length();
		String str = A + '$' + B.substring(0, B.length() - 1);

		int l = 0, r = 0; // Already in segment
		int count = 0;
		System.out.println(str);
		int n = str.length();
		int Z[] = new int[n];
		for (int i = 1; i < n; i++) {
			if (i > r) { // No info
				int j = i, k = 0;
				while (j < n && (str.charAt(j) == str.charAt(k))) {
					j++;
					k++;

				}
				Z[i] = k;
				l = i;
				r = j - 1;
			} else {
				if (Z[i - l] < r - i + 1) {
					// Copy
					Z[i] = Z[i - l];

				} else {
					int j = r + 1;
					int k = r - i + 1; // j-i
					while (j < n && (str.charAt(j) == str.charAt(k))) {
						Z[i] = k;
						l = i;
						r = j - 1;
					}
				}
			}
//			  if(Z[i]==A.length()) {
//	                count++;
//	            System.out.println("Count:"+count);
//			  }
//			  
			if (Z[i] == n - i) {
				count++;
				System.out.println("count:" + count);
			}

		}

////		int count=0;
//        for(int i=A.length()+1;i<n;i++) {
//            if(Z[i]==A.length()){
//                count++;
//            System.out.println();
//	}
//        }
//        System.out.println(count);
		return count;
//			return n;

	}
}

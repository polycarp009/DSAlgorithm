package com.learn.array;

import java.util.Arrays;
import java.util.List;

public class N3RepeatNumber {
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1000441, 1000441, 1000994 );
		System.out.println(majorityElement(A));
	}

	public static int majorityElement(final List<Integer> A) {
		int count1 = 1,count2=0;
		int max1 = A.get(0),max2=0;

		for (int i : A) {
			if (count1 == 0) {
				max1 = i;
				count1++;
			}else if(count2==0) {
				max2=i;
				count2++;
			}

			if (max1 == i) {
				count1++;
			} else {
				count1--;
			}
			
			if (max2 == i) {
				count2++;
			} else {
				count2--;
			}
		
		}
		System.out.println(max2);
System.out.println(max1);
		count1 = 0;
		count2=0;
		for (int i : A) {
			if (i == max1) {
				count1++;
			}
		}
		for (int i : A) {
			if (i == max2) {
				count2++;
			}
		}
		if (count1 > A.size() / 3) {
			return max1;
		} else if(count2 > A.size() / 3) {
			return max2;
		}else {
			return -1;
		}
	}

}

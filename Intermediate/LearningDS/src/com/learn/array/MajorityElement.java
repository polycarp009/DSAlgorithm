package com.learn.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MajorityElement {
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 1, 2, 3, 5, 7 );
		System.out.println(majorityElement(A));
	}

	public static int majorityElement(final List<Integer> A) {
		int count = 0;
		int max = 0;

		for (int i : A) {
			if (count == 0) {
				max = i;
			}

			if (max == i) {
				count++;
			} else {
				count--;
			}

		}

		count = 0;
		for (int i : A) {
			if (i == max) {
				count++;
			}
		}
		if (count >= A.size() / 2) {
			return max;
		} else {
			return -1;
		}
	}

}

package com.learn.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ConsecutiveSortArray {
	public static void main(String[] args) {
		int[] A = { 1,4,5, 2, 3 };
		System.out.println(solve((ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList())));
	}

	public static int solve(ArrayList<Integer>A) {
		// sort the given array
        Collections.sort(A);
        int minn = A.get(0);
        // check if the elements are consecutive
        for (int x: A) {
            if (x != minn)
                return 0;
            minn++;
        }
        return 1;
	}
}

package com.learn.array;

import java.util.Scanner;

public class RotationGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		int arraySize = Integer.parseInt(arr[0]);
		int array[] = new int[arraySize];
		for (int i = 1; i < arr.length; i++) {
			array[i - 1] = Integer.parseInt(arr[i]);
		}
		int rotateBy = sc.nextInt();
		if (rotateBy > arraySize) {
			// Getting remainder as the cycle repeats
			rotateBy = rotateBy % arraySize;
		}

//		System.out.println(Arrays.toString(array));
		reversearray(array, 0, arraySize);
//		System.out.println(Arrays.toString(array));
		reversearray(array, 0, rotateBy);
//		System.out.println(Arrays.toString(array));
		reversearray(array, rotateBy, arraySize);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	// Reverse the full array- swap till half
//	iterating over the array from both the ends and will swap the elements of the array successively.
	public static void reversearray(int a[], int start, int end) {
		int r1 = start;
		int r2 = end - 1;
		while (r1 < r2) {
			int temp = a[r1];
			a[r1] = a[r2];
			a[r2] = temp;
			r1++;
			r2--;
		}

	}

}
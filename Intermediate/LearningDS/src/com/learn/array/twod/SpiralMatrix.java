package com.learn.array.twod;

import java.util.Arrays;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int B[][] = {{5,6},
				{7,8}};
		
		System.out.println(Arrays.deepToString(generateMatrix(5)));
	}
	
	public static int[][] generateMatrix(int A) {
		int[][] spiralArr = new int[A][A];
		int count = 1;
		int left = 0;
		int right = A - 1;
		int top = 0;
		int bottom = A - 1;
		while (count <= A * A) {
			// System.out.println("LR");
			for (int j = left; j <= right; j++) {// Left to right
				int x = top;
				int y = j;
				spiralArr[x][y] = count++;
				// System.out.println(spiralArr[x][y]+"-"+x+","+y);
			}
			top = top + 1;
			// System.out.println("TB");
			for (int i = top; i <= bottom; i++) {// Top to Bottom
				int x = i;
				int y = right;
				spiralArr[x][y] = count++;
				// System.out.println(spiralArr[x][y]+"-"+x+","+y);
			}
			right = right - 1;
			// System.out.println("RL");
			for (int j = right; j >= left; j--) {// Right to left
				int x = bottom;
				int y = j;
				spiralArr[x][y] = count++;
				// System.out.println(spiralArr[x][y]+"-"+x+","+y);
			}
			bottom = bottom - 1;
			// System.out.println("BT");
			for (int i = bottom; i >= top; i--) {// Bottom to top
				int x = i;
				int y = left;
				spiralArr[x][y] = count++;
				// System.out.println(spiralArr[x][y]+"-"+x+","+y);
			}
			left = left + 1;
		}
		return spiralArr;
	}

}

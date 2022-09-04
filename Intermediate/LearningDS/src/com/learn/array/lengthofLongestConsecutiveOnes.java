package com.learn.array;

import java.util.Arrays;

public class lengthofLongestConsecutiveOnes {
	public static void main(String[] args) {
//		String A = "000000000000000";
		String A = "11010110000000000";
		
		System.out.println(solve(A));
	}

	public static int solve(String A) {
		
		String[] binaryArray = A.split("");
	
		int answer=0;
		int noOfOnes=0;
		for (int i = 0; i < binaryArray.length; i++) {
			if(binaryArray[i].equals("1")) {
				noOfOnes++;
			}
		}
		if(noOfOnes==0) {
			System.out.println("noOfOnes : "+noOfOnes);
			return 0;
		}else {
		for (int i = 0; i < binaryArray.length; i++) {
			if (binaryArray[i].equals("0")) {
				// no of conscutive 1's on left
				int left = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (binaryArray[j].equals("1")) {
						left++;
					} else {
						break;
					}
				}

				// no of conscutive 1's on right
				int right = 0;
				for (int j = i + 1; j < binaryArray.length; j++) {
					if (binaryArray[j].equals("1")) {
						right++;
					} else {
						break;
					}
				}
				
				if((left+right)==noOfOnes){
					System.out.println("noOfOnes : "+noOfOnes);
					right--;
				}
				System.out.println("Ans1 : "+answer);
				answer = answer > (left + 1 + right) ? answer : (left + 1 + right);
			}
			
		}
		if (answer == 0) {
			answer = binaryArray.length;
		}
		System.out.println("Ans: "+answer);
		return answer;
		}
	}
}

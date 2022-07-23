package com.learn.dsa;

import java.util.Scanner;

public class amstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i<=n; i++) {
			int sum=0;
			int num=i;
			while(num>0) {
				int rem = num%10;
				sum=(int) (sum+Math.pow(rem, 3));
				num=num/10;
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	sc.close();
	}
	
}

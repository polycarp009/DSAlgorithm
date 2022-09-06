package com.learn.hashing;

import java.util.HashSet;

public class ColurfulNumbers {
public static void main(String[] args) {
	System.out.println(solve(3245));
}
public static int solve(int A) {
	HashSet<Integer> products = new HashSet<>();
	String number=""+A;
	for (int i = 0; i < number.length(); i++) {
		int product=1;
		for(int j=i;j<number.length();j++) {
			product=product*(number.charAt(i)-'0');
		if(products.contains(product)) 
			return 0;
		products.add(product);
		}
	}
	return 1;
}
}

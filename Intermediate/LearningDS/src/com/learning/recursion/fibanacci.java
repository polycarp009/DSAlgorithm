package com.learning.recursion;

public class fibanacci {
	static int i=0;
	public static void main(String[] args) {
		System.out.println("Ans:"+findAthFibonacci(4));
	}
	public static int findAthFibonacci(int A) {
		
        if(A==0||A==1){
            System.out.println(i+" : "+A);
            return A;
        }

        System.out.println(i+" : "+A);
        i++;
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }

}

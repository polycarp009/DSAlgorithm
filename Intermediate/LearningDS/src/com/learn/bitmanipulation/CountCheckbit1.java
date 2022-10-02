package com.learn.bitmanipulation;

public class CountCheckbit1 {
	public static void main(String[] args) {

		int A=11;
		System.out.println(numSetBits(A));
	}
	
	public static int numSetBits(int A) {
         int count = 0;
        while(A>0){
           
        if((A&1)!=0){
            count++;
//            System.out.println("Count:"+count);
        }
        A=A>>1;
    }
    return count;
    }

}

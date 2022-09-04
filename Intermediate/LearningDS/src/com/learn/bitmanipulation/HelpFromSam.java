package com.learn.bitmanipulation;

/*Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.

Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.*/
public class HelpFromSam {
	public static void main(String[] args) {
		System.out.println("Score: "+solve(5));
	}
	 public static int solve(int A) {
		int score=0;
		int ans=A;
		while(A>0) {
			A=A>>1;
			 score+=A;
		}
		return ans-score;
	    }
}

package com.learn.array.twod;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int A[][] = {{1, 2},{3,4}};
		
		int B[][] = {{5,6},
				{7,8}};
		
		solve(A,B);
	}
	
	public static int[][] solve(int[][] A, int[][] B) {
		int Multi[][] =new int[A.length][B.length];
		for(int i=0;i<A.length;i++) {
			for (int j = 0; j <B[0].length; j++) {
				Multi[i][j]=0;
				for (int k = 0; k <A[0].length; k++) {
					System.out.println("i:"+i+" j:"+j+" k:"+k);
					System.out.println("A[j][k]:"+A[j][k]);
					System.out.println("B[j][k]:"+B[k][j]);
					
					Multi[i][j]+=A[i][k]*B[k][j];
					System.out.println(Multi[i][j]);
				}
				
			}
		}
		
		for (int i = 0; i < Multi.length; i++) {
			for (int j = 0; j < Multi[0].length; j++) {
				System.out.print(Multi[i][j]+" ");
			}
			System.out.println("");
		}
		
		return A;
    }
}



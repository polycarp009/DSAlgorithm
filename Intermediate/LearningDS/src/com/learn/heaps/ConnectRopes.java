package com.learn.heaps;

import java.util.PriorityQueue;

public class ConnectRopes {

	public static void main(String[] args) {
		int[] A= {5,22,3,4,6,1};
System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int totalCost=0;
		
		for (int i = 0; i < A.length; i++) {
			heap.add(A[i]);
		}
		
		while(heap.size()>1) {
			int a = heap.poll();
			int b = heap.poll();
			int cost = a+b;
			totalCost+=cost;
			heap.add(cost);
		}
		
		return totalCost;
		
	}

}

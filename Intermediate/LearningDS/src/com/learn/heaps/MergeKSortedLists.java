package com.learn.heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class MergeKSortedLists {
	public static void main(String[] args) {

	}

	class Pair{
		int num;
		ListNode head;
	}
	public ListNode mergeKLists(ArrayList<ListNode> a) {
		
		PriorityQueue<Pair> minheap = new PriorityQueue<>();
	ListNode result = new ListNode(-1);
		for(ListNode lnode: a) {
			Pair pair = new Pair();
			pair.num=lnode.val;
			pair.head=lnode.next;
			minheap.add(pair);
		}
		
		while(minheap.size()>1) {
			Pair curr = minheap.poll();
			Pair pair = new Pair();
			pair.head=curr.head.next;
			pair.num=curr.head.next.val;
			new ListNode(curr.num);
			minheap.add(pair);
			
		}
		
		
		
		return null;
	}
	

}

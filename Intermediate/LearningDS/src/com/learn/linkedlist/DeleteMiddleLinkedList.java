package com.learn.linkedlist;

//protected class ListNode {
//	public int val;
//	public ListNode next;

//
//	ListNode(int x) {
//		val = x;
//		next = null;
//	}
//}

public class DeleteMiddleLinkedList {

	public ListNode solve(ListNode A) {
		if (A == null) // if head is null edge case return null
			return A;

		ListNode slow = A, fast = A,prev=A;
		
		if(fast.next == null){ // only one node case
            return null;
        }
		
		//fast != null && fast.next != null  use for getting the second middle
		while (fast!= null && fast.next != null) {
			prev=slow;
			slow = slow.next;
			fast = fast.next.next;
			
		}
		prev.next=slow.next;
		slow.next=null;
		return A;
	}
	
	
}

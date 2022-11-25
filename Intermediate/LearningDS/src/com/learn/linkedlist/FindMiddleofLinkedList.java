package com.learn.linkedlist;

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
//If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.
public class FindMiddleofLinkedList {

	public int solve(ListNode A) {
		if (A == null) // if head is null edge case return null
			return 0;

		ListNode slow = A, fast = A;
		//fast != null && fast.next != null  use for getting the second middle
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}
}

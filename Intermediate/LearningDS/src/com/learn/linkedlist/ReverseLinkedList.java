package com.learn.linkedlist;

public class ReverseLinkedList {
	public ListNode solve(ListNode A) {
		
		ListNode temp=null,curr=A,prev=null;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		A=prev;
		return A;
		
	}
}

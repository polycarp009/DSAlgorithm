package com.learn.linkedlist;

public class LinkedListReverse2 {
	
	
	public ListNode reverseBetween(ListNode A, int B, int C) {
		if(B==C || (B==1 && C==1)) return A; // check if we don't need to reverse any element means B==C or there is only 1 element
        int count=1;
        ListNode start=A;
        ListNode preStart=A; // to store the previous and last elements of reversing list to replace then back with there address
        ListNode preEnd=A;
        ListNode end=A;
        while(count<=C){ // loop to find the actual elements to reverse
            if(count<B) {
                preStart=start; // storing the previous element
                start=start.next;
            }
            preEnd=end; // storing the last element
            end=end.next;
            count++;
        } 
        
        ListNode pre=null;
        pre=solve(start);
        
        preStart.next=pre;
        if(B==1) A=pre;
        start.next=end;
        return A;
    } 
    
	
	
	
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

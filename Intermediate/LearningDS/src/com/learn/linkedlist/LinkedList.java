package com.learn.linkedlist;

public class LinkedList {

	int data;
	LinkedList next;

	public LinkedList(int val) {

		this.data = val;
		this.next = null;
		// TODO Auto-generated constructor stub
	}

	public static LinkedList head = null;
	public static int size = 0;

	public static void main(String[] args) {
//		getLength(head);
		insert_node(1, 14);
		insert_node(2, 42);
		insert_node(3, 98);
		insert_node(4, 26);
		insert_node(5, 36);
		insert_node(6, 28);
		insert_node(7, 57);
		insert_node(8, 93);
//		getLength(head);
//		insert_node(2, 24);
		getLength(head);
//		System.out.println("-------Middle of LL-------");
//		System.out.println(findMiddle(head));
		print_ll();
		System.out.println("---------Reversed LL-----------");
		head=reverseLL(head);
		print_ll();
		System.out.println("---------Reversed LL-----------");
//		System.out.println("-------Middle of Deletion-------");
//		System.out.println(deleteMiddle(head));
//		print_ll();
		
//		delete_node(1);
		getLength(head);
		print_ll();
	}

	public static int getLength(LinkedList head) {
		int length = 0;
		LinkedList temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		System.out.println("length: "+length);
		return length;
	}

	public static void insert_node(int position, int value) {
		// @params position, integer
		// @params value, integer

		LinkedList newNode = new LinkedList(value);
		if (position == 1) {
			newNode.next = null;
			head = newNode;
//			System.out.println("Node 1:" + newNode.data);
		} else {
			LinkedList temp = head;
			int c = 0;
			while (c < position - 2) {
				c++;
				temp = temp.next;

			}
			newNode.next = temp.next;
//			System.out.println("pos" + position);
//			System.out.println("Node " + position + ":" + newNode.data);
			temp.next = newNode;
		}
		System.out.println(size);
		size++;
	}

	public static void delete_node(int position) {
		// @params position, integer
		if (position == 1) {
			head = head.next;
		} else {
			LinkedList temp = head;
			for (int i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		size--;
	}
	
	public static LinkedList deleteMiddle(LinkedList A) {
		if (A == null) // if head is null edge case return null
			return A;

		LinkedList slow = A, fast = A,prev=A;
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

	public static void print_ll() {
		// Output each element followed by a space
		LinkedList temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static int findMiddle(LinkedList A) {
		if (A == null) // if head is null edge case return null
			return 0;

		LinkedList slow = A, fast = A;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static LinkedList reverseLL(LinkedList A) {
		
		LinkedList temp=null,curr=A,prev=null;
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

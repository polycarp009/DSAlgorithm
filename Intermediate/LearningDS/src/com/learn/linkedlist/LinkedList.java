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
		getLength(head);
		insert_node(1, 23);
		getLength(head);
		insert_node(2, 24);
		getLength(head);
		print_ll();
		delete_node(1);
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
			System.out.println("Node 1:" + newNode.data);
		} else {
			LinkedList temp = head;
			int c = 0;
			while (c < position - 2) {
				c++;
				temp = temp.next;

			}
			newNode.next = temp.next;
			System.out.println("pos" + position);
			System.out.println("Node " + position + ":" + newNode.data);
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

	public static void print_ll() {
		// Output each element followed by a space
		LinkedList temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}

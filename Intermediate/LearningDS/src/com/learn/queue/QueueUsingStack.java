package com.learn.queue;

import java.util.Stack;

public  class QueueUsingStack {
	 /** Initialize your data structure here. */
	static Stack<Integer> st1,st2;
	QueueUsingStack() {
      st1  = new Stack<>();
      st2  = new Stack<>();
    }
    
    /** Push element X to the back of queue. */
    static void push(int X) {
        st1.push(X);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
    	while(st2.empty()) {
			while(!st1.empty()) {
				st2.push(st1.pop());
			}
		}
    	return st2.pop();
    }
    
    /** Get the front element of the queue. */
    static int peek() {
    	while(st2.empty()) {
			while(!st1.empty()) {
				st2.push(st1.pop());
			}
		}
    	return st2.peek();
    }
    
    /** Returns whether the queue is empty. */
    static boolean empty() {
        return st1.isEmpty()&&st2.isEmpty();
    }
}

/**
 * Your QueueUsingStack object will be instantiated and called as such:
 * QueueUsingStack obj = new QueueUsingStack();
 * obj.push(X);
 * int param2 = obj.pop();
 * int param3 = obj.peek();
 * boolean param4 = obj.empty();
 */



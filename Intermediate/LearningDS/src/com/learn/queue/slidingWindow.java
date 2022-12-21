package com.learn.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindow {
	public class Solution {
		// DO NOT MODIFY THE ARGUMENTS WITH “final” PREFIX. IT IS READ ONLY
		public int[] slidingMaximum(final int[] A, int B) {
			int aLen = A.length;
			int outLen = aLen - B + 1;
			int out[] = new int[outLen];
			int window_start = 0;
			Deque<Integer> deque = new ArrayDeque();

			for (int window_end = 0; window_end < A.length; window_end++) {
				while (!deque.isEmpty() && deque.peekLast() < A[window_end]) {
					deque.pollLast();
				}

				deque.offerLast(A[window_end]);

				if (window_end - window_start + 1 >= B) {
					out[window_start] = deque.peekFirst();

					if (A[window_start] == deque.peekFirst())
						deque.pollFirst();
					window_start++;
				}

			}

			return out;
		}
	}
}



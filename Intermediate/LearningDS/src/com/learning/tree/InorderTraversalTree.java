package com.learning.tree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalTree {
	public ArrayList<Integer> InorderTraversal(TreeNode A) {

		Stack<TreeNode> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();

		if (A == null) {
			return result;
		}

		TreeNode current = A;

		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			result.add(current.val);
			current = current.right;
		}
		return result;
	}
}

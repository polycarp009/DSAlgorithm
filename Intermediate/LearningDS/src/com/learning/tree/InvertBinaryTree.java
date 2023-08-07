package com.learning.tree;

//Definition for binary tree


public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode A) {
		if (A == null) {
			return A;
		}

		invertTree(A.left);
		invertTree(A.right);
		TreeNode temp = A.left;
		A.left = A.right;
		A.right = temp;
		return A;
	}
}

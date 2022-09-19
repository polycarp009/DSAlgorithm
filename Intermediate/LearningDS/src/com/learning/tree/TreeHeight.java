package com.learning.tree;

//You are given the root node of a binary tree A. You have to find the height of the given tree. 
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class TreeHeight {
	public static void main(String[] args) {
	
	}
	 public static int solve(TreeNode A) {
		 if(A==null){
	            return 0;
	        }
	        int leftHeight = solve(A.left);
	        int rightHeight = solve(A.right);
	        return 1 + (leftHeight>rightHeight?leftHeight:rightHeight);
	        }
}

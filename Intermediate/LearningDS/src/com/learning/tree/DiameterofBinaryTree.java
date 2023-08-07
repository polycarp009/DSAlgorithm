package com.learning.tree;

public class DiameterofBinaryTree {
	 int diameter = -1;
	 public int solve(TreeNode A) {
		 getHeight(A);
		 return diameter;
	 }
	 
	 public int getHeight(TreeNode A) {
		 if(A==null) {
				return -1;
			}
			 int leftheight=getHeight(A.left);
			 int rightheight=getHeight(A.right);
			 diameter=Math.max(diameter, leftheight+rightheight+2);
			 
			return Math.max(leftheight, rightheight)+1;
		    
	 }
}

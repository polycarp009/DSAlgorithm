package com.learning.tree;
/*Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
that adding up all the values along the path equals the given sum.*/
public class PathSumofBinaryTree {
	 public int hasPathSum(TreeNode A, int B) {
		 if(A==null) {
			 return 0;
		 }
		 if(A.left==null && A.right==null) {
			 if(A.val==B) {
				 return 1;
			 }
		 }
		 int l = hasPathSum(A.left, B-A.val);
		 if(l==1) return 1;
		 int r=hasPathSum(A.right, B-A.val);
		 
		return r;
	    }
}

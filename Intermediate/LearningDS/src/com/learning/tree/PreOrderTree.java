package com.learning.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PreOrderTree {
	public class Solution {
  public ArrayList<Integer> preorderTraversal(TreeNode A) {

   Stack<TreeNode> stack = new Stack<>();
   ArrayList<Integer> result = new ArrayList<>();

   if(A == null) {
       return result;
   }

   TreeNode current = A;

   while(current != null || !stack.isEmpty()) {
       while(current != null) {
           stack.push(current);
           result.add(current.val);
           current = current.left;
       }

       current = stack.pop();
       current = current.right;
   }
   return result;
}
}
}

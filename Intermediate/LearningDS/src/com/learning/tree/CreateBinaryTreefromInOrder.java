package com.learning.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTreefromInOrder {
	 public TreeNode solve(ArrayList<Integer> A) {
	        //Use queue to store new treenodes as they are created
	        //Pop them out one by one and assign left and right children
	       
	        Queue<TreeNode> q=new LinkedList<>();
	        TreeNode root=new TreeNode(A.get(0));
	        q.add(root);
	        TreeNode currNode;

	        for(int i=1;i<A.size();i=i+2)
	        {
	            currNode=q.remove();

	            if(A.get(i)!=-1)
	            {
	                currNode.left=new TreeNode(A.get(i));
	                q.add(currNode.left);
	            }
	            if(A.get(i+1)!=-1)
	            {
	                currNode.right=new TreeNode(A.get(i+1));
	                q.add(currNode.right);
	            }
	        }
	        return root;
	    }
	
}

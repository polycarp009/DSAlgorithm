package com.learning.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
		ArrayList<ArrayList<Integer>> OrderList= new ArrayList<>();
		ArrayList<Integer> levelList= new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(A);
		q.add(null);
		while(q.size()>1) {
			TreeNode x = q.peek();
			q.poll();
			
			if(x==null) {
				OrderList.add(levelList);
				 levelList= new ArrayList<>();
				q.add(null);
				continue;
			}
			levelList.add(x.val);
			if(x.left!=null)
				q.add(x.left);
			if(x.right!=null)
				q.add(x.right);
		}
		OrderList.add(levelList);
//		System.out.println(levelList);
		return OrderList;
    }
}

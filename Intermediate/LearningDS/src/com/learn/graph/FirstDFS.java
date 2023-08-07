package com.learn.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FirstDFS {
	static boolean visited[];
	
	public static void main(String[] args) {
		int[] A= {1, 1, 2};
		
		visited=new boolean[A.length];
		
		solve(A, 1, 2);
	}
	   public static void solve(int[] A, final int B, final int C) {
		   //adding to graph
		HashMap<Integer,Integer> graph = new HashMap<Integer,Integer>();
		   for (int j = 1; j< A.length; j++) {
			if(!graph.containsKey(A[j])) {
				graph.put(A[j],j+1);
			}
		}
		  System.out.println(graph);
		  System.out.println("Src: "+B+" Target:"+C);
		  System.out.println("Oupt:"+dfs(B,C,graph));
		
		  
	   }
	   
	   public static int dfs(int Source, int Destination, HashMap<Integer,Integer> graph) {
		int Result=0;
		   System.out.println("Sorce: "+Source+" -- "+"Destination: "+Destination);
		   //dfs
		   if((int)Source==(int)Destination)
			   Result=1;
	
		   System.out.println("Src:"+Source);
//		   if(visited[Source]==true) return true;


	if(graph.containsKey(Source)) {
		
		System.out.println("dfs:"+graph.get(Source));
			    dfs(graph.get(Source),Destination,graph);
			    System.out.println("-----------------------");
			    
	}
	System.out.println("Print false");
		   return Result;
		
	}
}

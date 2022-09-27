package com.learn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Interval {
   int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}



public class MergeIntervals {

	public static void main(String[] args) {
		ArrayList<Interval> list= new ArrayList<>();
		Interval interval = new Interval();
		interval.start=1;
		interval.end=3;
		list.add(interval);
		Interval interval2 = new Interval();
		interval2.start=6;
		interval2.end=9;
		list.add(interval2);
		Interval newInterval = new Interval();
		newInterval.start=2;
		newInterval.end=6;
		
		ArrayList<Interval> res =insert(list, newInterval);
		for (Interval interval4 : list) {
			System.out.println(interval4.start+" :"+interval4.end+" ");
		}		
		for (Interval interval3 : res) {
			System.out.println(interval3.start+" :"+interval3.end+" - - ");
		}
	}
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	
		 ArrayList<Interval> ans= new ArrayList<Interval>();
		 for (int i = 0; i < intervals.size(); i++) {
			 Interval curr = intervals.get(i);
			if(curr.end<newInterval.start) {
				ans.add(curr);
			}else if(curr.start>newInterval.end) {
				ans.add(newInterval);
				while(i<intervals.size()) {
					ans.add(intervals.get(i));
					i++;
					
				}
				return ans;
			}
			else {
				newInterval.start=Math.min(curr.start, newInterval.start);
				newInterval.end=Math.max(curr.end, newInterval.end);
			}
		}
		 ans.add(newInterval);
		return ans;

	    }
}

package com.learn.modulo;

public class FindExcelColumnBase26 {
	public static void main(String[] args) {
	System.out.println(titleToNumber("BB"));	
	}
	   public static int titleToNumber(String A) {
		   int ans=0;
		   int power=1;
		   System.out.println(A.length());
		   for(int i=A.length()-1;i>=0;i--) {
			   System.out.println(" i: "+A.charAt(i));
			   ans+=power*(A.charAt(i)-'A'+1);
			   power*=26;
			   System.out.println(ans);
		   }
		return ans;
	    }
}

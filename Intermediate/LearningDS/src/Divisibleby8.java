
public class Divisibleby8 {
/*	You are given a number A in the form of a string. Check if the number is divisible by eight or not.

	Return 1 if it is divisible by eight else, return 0.*/
	public static void main(String[] args) {
		int A[] = { 1, -1 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(solve("9"));
	}
	public static int solve(String A) {
		int N = A.length();
		int ans=0;
		int r=1;
		int p=8;
		for (int i = N-1; i >= 0; i--) {
			System.out.println("i: "+i+" Char: "+A.charAt(i));
			ans=((ans+A.charAt(i)%p*r)%p)%p;
			System.out.println(ans);
			r=(10*r)%p;
		}
		if(ans==0) {
			return 1;
		}
		return 0;
		
	}
}

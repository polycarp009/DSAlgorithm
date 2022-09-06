import java.util.Arrays;

public class SortbasedonFactor {
	public static void main(String[] args) {
		int[] A = {2,4,7};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		Integer[] B = new Integer[A.length];
		for (int i = 0; i < A.length; i++) {
			B[i]=A[i];
		}
		Arrays.sort(B, (a,b)->checkOrder(a,b));
		return 0;
		
	}
	private static int checkOrder(Integer a, Integer b) {
		// TODO Auto-generated method stub
		int c1=countFactors(a);
		int c2=countFactors(b);
		if(c1==c2) {
			return a<b?1:0;
		}
		return c1>c2?1:-1;
	}
	private static int countFactors(Integer b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

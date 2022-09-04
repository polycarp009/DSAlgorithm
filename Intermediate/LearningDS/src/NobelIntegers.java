import java.util.Arrays;

public class NobelIntegers {
	public static void main(String[] args) {
		int[] A = { 3, 2, 1,3};
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {
		Arrays.sort(A);
		int ans = 0;
		int count = 0;
		int temp=0;
		for (int i = 0; i < A.length/2; i++) {
			temp=A[i];
			A[i]=A[(A.length-1)-i];
			A[(A.length-1)-i]=temp;
		}
		
		for (int i = 0; i < A.length; i++) {
	
			

			if (i > 0 && A[i] == A[i-1]) {
				continue;
			} else if(i>0 && A[i]!=A[i-1]){
				count = i;
			}
			System.out.println("Count: " + count + " i: " + i+"A[i]: "+A[i]);
			if (A[i] == count) {
				ans++;
//				return 1;
			
			}
			System.out.println(ans);
			
		}

		return -1;
	}
}

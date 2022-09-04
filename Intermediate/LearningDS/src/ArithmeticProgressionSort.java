import java.util.Arrays;

public class ArithmeticProgressionSort {
	public static void main(String[] args) {
		int[] A= {3, 5, 1};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		Arrays.sort(A);
		int ap=A[1]-A[0];
		boolean status=false;
				for (int i = 0; i < A.length-1; i++) {
					
					int ap1=A[i+1]-A[i];
					System.out.println(ap1);
					if(ap1==ap) {
					status=true;
					}else {
						status=false;
					}
				}
				
		System.out.println(status);
		return (status)?1:0;
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class SortUsingCompartor {
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 0, 1, 2};
		System.out.println(Arrays.toString(sortColors(A)));
	}
	 public static int[] sortColors(int[] A) {
		 int[] B = new int[A.length];
		 int k=0;
		 for (int i = 0; i < 3; i++) {
			for (int j = 0; j < A.length; j++) {
				if(A[j]==i) {
					B[k++]=A[j];
				}
			}
		}
		return B;
	    }
	 
	 public int compareColors(int a,int b) {
		if(a>b) {
			return 1;
		}else if(a<b) {
			return -1;
		}
		return 0;
		 
	 }
}

import java.util.Scanner;

public class squareRootofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		boolean result=false;
		int sqroot=0;
		for (int i = 1; i<=Math.sqrt(n) ; i++) {
			if(i*i==n) {
				result=true;
				sqroot=i;
				break;
			}
		}
		System.out.println(result?sqroot:"-1");
	}
}


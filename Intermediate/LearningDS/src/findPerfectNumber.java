import java.util.Scanner;

public class findPerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Getting the input from User
		int totalInput = sc.nextInt();
		int inputNumber[] = new int[totalInput];
		for (int loopcount = 0; loopcount < totalInput; loopcount++) {
			inputNumber[loopcount] = (int) sc.nextInt();
		}
		for (int n : inputNumber) {
			int sum = 0;
//		 We can iterate from 1 to A/2 instead of till A? Because a number 
//		 does not have any proper positive divisor greater than A/2.
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}

			if (sum == n) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}
	}

}

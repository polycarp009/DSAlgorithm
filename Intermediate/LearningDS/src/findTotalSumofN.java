import java.util.Scanner;

public class findTotalSumofN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNumber = 10;
		int totalSum = 0;
		totalSum = (totalNumber * (totalNumber + 1)) / 2;
		System.out.println(totalSum);
	}
}

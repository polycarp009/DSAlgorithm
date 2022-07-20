import java.io.InputStream;
import java.lang.*;
import java.util.*;

public class findPrimeorNot {
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		try {
			Scanner sc = new Scanner(System.in);
			int factors = 0;
			//Getting the input from User
			int input = sc.nextInt();
			for (int i = 1; i <= Math.sqrt(input); i++) {
				if (input % i == 0) {
					if (i * i == input) {
						factors++;
					} else {
						factors += 2;
					}
					//Break loop if getting factors more than 2
					if (factors > 2) {
						break;
					}
				}
			}
			if (factors == 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
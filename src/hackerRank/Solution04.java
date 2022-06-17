package hackerRank;

import java.util.Scanner;

public class Solution04 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		/* Enter your code here. Print output to STDOUT. */

		System.out.println(A.length() + B.length());
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "
				+ B.substring(0, 1).toUpperCase() + B.substring(1));

		scanner.close();

	}
}

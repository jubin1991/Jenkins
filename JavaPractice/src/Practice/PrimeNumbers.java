package Practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..........");
		int n = sc.nextInt();
		int i = 0;
		int f = 0;

		for (i = 1; i <= n; i++) {

			if (n % i == 0) {
				f++;
			}
		}
		if (f == 2) {
			System.out.println("Prime ");
		} else {
			System.out.println("Not Prime ");
		}

	}

}


package session23;

import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 1;
		int fact = 0;

		while (i*i <= n) {

			if (n % i == 0) {
				fact++;
			}

			i++;
		}

		if (fact == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

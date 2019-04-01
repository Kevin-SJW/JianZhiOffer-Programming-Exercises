package JianZhiOffer;

import java.util.Scanner;

public class isPerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPerfectNumber(num));
	}

	public static boolean isPerfectNumber(int num) {
		boolean isperfectNumber = false;
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}

		}

		if (sum == num) {
			System.out.println(sum);
			isperfectNumber = true;
		}
		return isperfectNumber;
	}

}

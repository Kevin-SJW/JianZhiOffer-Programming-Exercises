package JianZhiOffer;

import java.util.Scanner;
/*请找出数组中的某个数，它的左侧数字相加之和等于右边。*/
public class FindMiddleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split("\\,");
		int[] num = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		System.out.println(FindMiddle(num));

	}

	public static int FindMiddle(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int leftSum = 0;
			for (int left = 0; left < i; left++) {
				leftSum += arr[left];
			}
			int rightSum = 0;
			for (int right = i + 1; right < arr.length; right++) {
				rightSum += arr[right];
			}
			if (leftSum == rightSum) {
				return arr[i];

			}

		}
		return -1;
	}

}

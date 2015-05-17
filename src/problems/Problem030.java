package problems;

import common.MathUtil;

public class Problem030 {

	// NOTE: The upper bound of the loop is Integer.MAX_VALUE, but as
	// you'll see, it finishes quickly on its own.
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i < Integer.MAX_VALUE; i++) {
			if (i == getSumFifth(MathUtil.getDigits(i))) {
				sum += i;
				System.out.println(i + ", sum=" + sum);
			}
		}
	}

	public static int getSumFifth(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += Math.pow(i, 5);
		}
		return sum;
	}

}

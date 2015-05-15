package problems;

import common.MathUtil;

public class Problem034 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i < Integer.MAX_VALUE; i++) {
			if (i == factorialDigitSum(i)) {
				sum += i;
				System.out.println(i + ", sum=" + sum);
			}
		}
	}
	
	public static int factorialDigitSum(int n) {
		int sum = 0;
		int[] digits = MathUtil.getDigits(n);
		for (int i : digits)
			sum += MathUtil.factorial(i);
		return sum;
	}

}

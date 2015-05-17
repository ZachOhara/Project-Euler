package problems;

import common.MathUtil;

public class Problem036 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000000; i++)
			if (isFullPalindrome(i))
				sum += i;
		System.out.println(sum);
	}

	public static boolean isFullPalindrome(int n) {
		return MathUtil.isPalindromic("" + n)
				&& MathUtil.isPalindromic(Integer.toBinaryString(n));
	}

}

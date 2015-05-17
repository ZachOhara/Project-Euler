package problems;

import common.MathUtil;

public class Problem037 {

	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		int current = 10;
		while (total < 200) {
			current++;
			if (isTruncatable(current)) {
				total++;
				sum += current;
				System.out.println(current);
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isTruncatable(int n) {
		return isTruncatableRtoL(n) && isTruncatableLtoR(n);
	}
	
	public static boolean isTruncatableRtoL(int n) {
		while (n > 0) {
			if (!MathUtil.isPrime(n))
				return false;
			n /= 10;
		}
		return true;
	}
	
	public static boolean isTruncatableLtoR(int n) {
		while (n > 0) {
			if (!MathUtil.isPrime(n))
				return false;
			n %= Math.pow(10, MathUtil.length(n) - 1);
		}
		return true;
	}

}

package problems;

import common.MathUtil;

public class Problem035 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 1000000; i++) {
			if (isCircularPrime(i))
				total++;
			if (i % 10000 == 0)
				System.out.println(i + " : " + total);
		}
		System.out.println(total);
	}

	public static boolean isCircularPrime(int n) {
		int len = MathUtil.length(n);
		for (int i = 0; i < len; i++) {
			if (!MathUtil.isPrime(n))
				return false;
			n = rotate(n);
		}
		return true;
	}

	public static int rotate(int n) {
		int last = n % 10;
		n /= 10;
		n += last * Math.pow(10, MathUtil.length(n));
		return n;
	}

}

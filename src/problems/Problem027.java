package problems;

import common.MathUtil;

public class Problem027 {

	public static void main(String[] args) {
		int maxA = 0;
		int maxB = 0;
		int maxPrimes = 0;
		for (int a = -999; a < 1000; a++) {
			for (int  b = -999; b < 1000; b++) {
				int primes = primesFor(a, b);
				if (primes > maxPrimes) {
					maxPrimes = primes;
					maxA = a;
					maxB = b;
					System.out.println(primes + ", " + a + ", " + b);
				}
			}
		}
		System.out.println(maxA * maxB);
	}

	//	public static void main(String[] args) {
	//		System.out.println(primesFor(1, 41));
	//		System.out.println(primesFor(-79, 1601));
	//	}

	public static int primesFor(int a, int b) {
		int n = 0;
		while (MathUtil.isPrime((n*n) + (n*a) + b)) {
			n++;
		}
		return n;
	}

}

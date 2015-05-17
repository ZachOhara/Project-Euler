package problems;

import common.MathUtil;

public class Problem007 {

	public Problem007() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int primes = 1;
		int n = 1;
		while (primes < 10001) {
			n++;
			if (MathUtil.isPrime(n))
				primes++;
		}
		System.out.println("" + n + MathUtil.isPrime(n));
	}

	public static void isPrime_test() {
		System.out.println(MathUtil.isPrime(3));
		System.out.println(MathUtil.isPrime(4));
		System.out.println(MathUtil.isPrime(5));
		System.out.println(MathUtil.isPrime(6));
		System.out.println(MathUtil.isPrime(7));
		System.out.println(MathUtil.isPrime(24));
		System.out.println(MathUtil.isPrime(31));
		System.out.println(MathUtil.isPrime(51));
	}

}

package common;

import java.math.BigInteger;

public class MathUtil {
	
	public static void main(String[] args) {
		int[] tests = {220, 284};
		for (int i : tests)
			System.out.println(i + " : " + sumDivisors(i));
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (n/2) + 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int length(int n) {
		n = Math.abs(n);
		int length = 0;
		while (n != 0) {
			n /= 10;
			length++;
		}
		return length;
	}
	
	public static int length(BigInteger bi) {
		int length = 0;
		while (bi.compareTo(BigInteger.ZERO) > 0) {
			bi = bi.divide(BigInteger.TEN);
			length++;
		}
		return length;
	}
	
	public static int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static BigInteger sumDigits(BigInteger bi) {
		BigInteger sum = BigInteger.ZERO;
		while (bi.compareTo(BigInteger.ZERO) > 0) {
			sum = sum.add(bi.mod(BigInteger.TEN));
			bi = bi.divide(BigInteger.TEN);
		}
		return sum;
	}

	public static int countFactors(int n) {
		n = Math.abs(n);
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count++;
		return count;
	}
	
	public static int sumDivisors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++)
			if (n % i == 0)
				sum += i;
		return sum;
	}

}

/* Copyright (C) 2015 Zach Ohara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package common;

import java.math.BigInteger;

public class MathUtil {

	public static void main(String[] args) {
		String[] tests = {"abcde", "abcba", "abba", "jfjfjjfjfj"};
		for (String i : tests)
			System.out.println(i + " : " + isPalindromic(i));

	}

	public static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		int gcd = 1;
		for (int i = 2; i <= Math.min(a, b); i++)
			if (a % i == 0 && b % i == 0)
				gcd = i;
		return gcd;
	}

	public static boolean isPrime(int n) {
		n = Math.abs(n);
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

	public static int[] getDigits(int n) {
		int[] digits = new int[length(n)];
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = n % 10;
			n /= 10;
		}
		return digits;
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

	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	@Deprecated
	public static boolean isPalindromic(int n) {
		return isPalindromic(new Integer(n).toString());
	}

	public static boolean isPalindromic(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (!s.substring(i, i + 1).equals(s.substring(s.length() - 1 - i, s.length() - i)))
				return false;
		return true;
	}

}

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

package problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import common.ProgramTimer;

public class Problem113 {

	public static void main(String[] args) {
		ProgramTimer.startTimer(); // just so eclipse is happy

		BigInteger sampleTime = new BigInteger("6463"); // seconds to calculate up to 10^10
		BigInteger multiplier = new BigInteger("10").pow(90);
		BigInteger finalTime = sampleTime.multiply(multiplier);

		final BigInteger sixty = new BigInteger("60");
		final BigInteger earthAge = new BigInteger("454").pow(7);
		final BigInteger universeAge = new BigInteger("13798").pow(6);

		System.out.println("Using this program to calculate the result would take:");
		System.out.println(finalTime + " seconds");
		finalTime = finalTime.divide(sixty);
		System.out.println(finalTime + " minutes");
		finalTime = finalTime.divide(sixty);
		System.out.println(finalTime + " hours");
		finalTime = finalTime.divide(new BigInteger("24"));
		System.out.println(finalTime + " days");
		finalTime = finalTime.divide(new BigInteger("7"));
		System.out.println(finalTime + " weeks");
		finalTime = finalTime.divide(new BigInteger("52"));
		System.out.println(finalTime + " years");
		finalTime = finalTime.divide(BigInteger.TEN);
		BigInteger years = new BigInteger(finalTime.toString());
		System.out.println(finalTime + " decades");
		finalTime = finalTime.divide(BigInteger.TEN);
		System.out.println(finalTime + " centuries");
		finalTime = finalTime.divide(BigInteger.TEN);
		System.out.println(finalTime + " millenia");

		System.out.println("\nSince the Earth is about " + earthAge + " years old,");
		System.out.println("And the universe is about " + universeAge + " years old,");
		System.out.println("This program would finish in about" + years.divide(earthAge) + " Earth's ages");
		System.out.println("Or about " + years.divide(universeAge) + " times the age of the universe");

		System.out.println();
		System.out.println("That's about 2.97 * 10^" + (years.divide(universeAge).toString().length()-1) + " universe ages");
	}

	/*
	public static void main(String[] args) {
		ProgramTimer.startTimer();

		BigInteger found = new BigInteger("0");
		final BigInteger googol = (new BigInteger("10")).pow(7);
		final BigInteger printinterval = (new BigInteger("10")).pow(6);
		//BigInteger[] remainder;

		for (BigInteger tried = new BigInteger("1"); tried.compareTo(googol) < 0; tried = tried.add(BigInteger.ONE)) {
			if (!isBouncy(tried))
				found = found.add(BigInteger.ONE);
			if (tried.divideAndRemainder(printinterval)[1] == BigInteger.ZERO)
				System.out.println(tried + ", " + found);
		}
		System.out.println("There are " + found + " non-bouncy numbers below a googol");
		ProgramTimer.displayTime();
	}
	 */

	public static double currentPercent(BigInteger a, BigInteger b) {
		return (new BigDecimal(a)).divide(new BigDecimal(b), 10, RoundingMode.DOWN).doubleValue();
	}

	public static boolean isBouncy(BigInteger n) {
		return !(isIncreasing(n) || isDecreasing(n));
	}

	public static boolean isIncreasing(BigInteger n) {
		int[] digits = getDigitArray(n);
		for (int i = 0; i < digits.length - 1; i++)
			if (digits[i] > digits[i+1])
				return false;
		return true;
	}

	public static boolean isDecreasing(BigInteger n) {
		int[] digits = getDigitArray(n);
		for (int i = 0; i < digits.length - 1; i++)
			if (digits[i] < digits[i+1])
				return false;
		return true;
	}

	public static int[] getDigitArray(BigInteger n) {
		String str = n.toString();
		int[] digits = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			digits[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		return digits;
	}

	public static int length(int n) {
		n = Math.abs(n);
		int len = 0;
		while (n != 0) {
			n /= 10;
			len++;
		}
		return len;
	}

}

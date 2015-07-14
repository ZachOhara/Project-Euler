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

package io.github.zachohara.euler.problems;

import io.github.zachohara.euler.common.MathUtil;
import io.github.zachohara.euler.common.ProgramTimer;
import io.github.zachohara.euler.common.WriteFile;

public class Problem112 {

	public static void main(String[] args) {
		ProgramTimer.startTimer();
		WriteFile.create("non-bouncy nums");
		int tried = 0;
		int found = 0;
		while ((double)found/tried != 0.99) {
			tried++;
			if (isBouncy(tried))
				found++;
		}
		System.out.println("99% of bouncy numbers under " + tried + " are bouncy");
		ProgramTimer.displayTime();

	}

	public static boolean isBouncy(int n) {
		return !(isIncreasing(n) || isDecreasing(n));
	}

	public static boolean isIncreasing(int n) {
		int[] digits = getDigitArray(n);
		for (int i = 0; i < digits.length - 1; i++)
			if (digits[i] > digits[i+1])
				return false;
		return true;
	}

	public static boolean isDecreasing(int n) {
		int[] digits = getDigitArray(n);
		for (int i = 0; i < digits.length - 1; i++)
			if (digits[i] < digits[i+1])
				return false;
		return true;
	}

	public static int[] getDigitArray(int n) {
		int len = MathUtil.length(n);
		int[] digits = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			digits[i] = n % 10;
			n /= 10;
		}
		return digits;
	}

}

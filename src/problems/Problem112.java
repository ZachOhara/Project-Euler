package problems;

import common.ProgramTimer;
import common.WriteFile;

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
		int len = length(n);
		int[] digits = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			digits[i] = n % 10;
			n /= 10;
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

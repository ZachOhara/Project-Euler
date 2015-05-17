package problems;

import common.MathUtil;

public class Problem021 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a < 10000; a++) {
			for (int b = a + 1; b < 10000; b++) {
				if (areAmicable(a, b))
					sum += a + b;
			}
			if (a % 100 == 0)
				System.out.println(a);
		}
		System.out.println(sum);
	}

	public static boolean areAmicable(int a, int b) {
		return MathUtil.sumDivisors(a) == b
				&& MathUtil.sumDivisors(b) == a;
	}

}

package problems;

import common.MathUtil;

public class Problem012 {
	
	public static void main(String[] args) {
		int cumul = 1;
		int curr = 1;
		while (MathUtil.countFactors(cumul) <= 500) {
			curr++;
			cumul += curr;
			if (curr % 100 == 0)
				System.out.println(curr + ", " + cumul + ", " + MathUtil.countFactors(cumul));
		}
		System.out.println(cumul);
	}

}

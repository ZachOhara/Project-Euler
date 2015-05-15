package problems;

import java.math.BigInteger;

import common.MathUtil;

public class Problem025 {

	public static void main(String[] args) {
		int index = 1;
		BigInteger fib = BigInteger.ONE;
		BigInteger fibLast = BigInteger.ZERO;
		while (MathUtil.length(fib) < 1000) {
			BigInteger temp = fib;
			fib = fib.add(fibLast);
			fibLast = temp;
			index++;
			if (index % 50 == 0)
				System.out.println(index + " : " + fib);
		}
		System.out.println("Done! Answer: " + index);

	}

}

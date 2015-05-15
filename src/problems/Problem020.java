package problems;

import java.math.BigInteger;

public class Problem020 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.ONE;
		for (int i = 1; i <= 100; i++)
			n = n.multiply(BigInteger.valueOf(i));
		BigInteger sum = Problem016.sumDigits(n);
		System.out.println(sum);
	}

}

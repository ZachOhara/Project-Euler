package problems;

import java.math.BigInteger;

public class Problem016 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(2).pow(1000);
		BigInteger digitSum = sumDigits(n);
		System.out.println(digitSum);
	}
	
	public static BigInteger sumDigits(BigInteger bi) {
		BigInteger sum = BigInteger.ZERO;
		while (bi.compareTo(BigInteger.ZERO) > 0) {
			sum = sum.add(bi.mod(BigInteger.TEN));
			bi = bi.divide(BigInteger.TEN);
		}
		return sum;
	}
	
	

}

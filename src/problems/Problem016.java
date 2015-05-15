package problems;

import java.math.BigInteger;

import common.MathUtil;

public class Problem016 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(2).pow(1000);
		BigInteger digitSum = MathUtil.sumDigits(n);
		System.out.println(digitSum);
	}
	
	

}

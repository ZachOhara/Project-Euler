package common;

public class OharaMath {
	
	public static int signum(int i) {
		return (int)Math.signum((double)i);
	}
	
	public static int gcd(int a, int b) { // greatest common divisor of two numbers
		a = Math.abs(a);
		b = Math.abs(b);
		int gcd = 1;
		for (int divisor = 1; divisor < Math.min(a, b); divisor++) {
			if (a % divisor == 0 && b % divisor == 0)
				gcd = divisor;
		}
		return gcd;
	}

}

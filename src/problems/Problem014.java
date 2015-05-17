package problems;

public class Problem014 {

	public static void main(String[] args) {
		int maxIndex = 0;
		int maxCollatz = 0;
		for (int i = 1; i <= 1000000; i++) {
			if (collatz(i) > maxCollatz) {
				maxIndex = i;
				maxCollatz = collatz(i);
			}
		}
		System.out.println("The collatz sequence of " + maxIndex + " has " + maxCollatz + " terms");
	}

	public static int collatz(int n0) {
		int l = 0;
		long n = (long)(n0);
		while (n > 1) {
			l += 1;
			if ((n%2) == 0) {
				n = n/2;
			} else {
				n = 3*n + 1;
			}
		}
		return l;
	}

}

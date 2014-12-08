package problems;

public class Problem007 {

	public Problem007() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int primes = 1;
		int n = 1;
		while (primes < 10001) {
			n++;
			if (isPrime(n))
				primes++;
		}
		System.out.println("" + n + isPrime(n));
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i <= (n/2) + 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void isPrime_test() {
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));
		System.out.println(isPrime(7));
		System.out.println(isPrime(24));
		System.out.println(isPrime(31));
		System.out.println(isPrime(51));
	}

}

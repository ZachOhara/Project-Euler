package problems;

public class Problem012 {

	public static void main(String[] args) {
		int num = 0;
		int tri = 0;
		while (factors(tri) <= 500) {
			num++;
			tri += num;
			//System.out.println(num);
		}

	}
	
	public static int triangleNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int factors(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				factors++;
		}
		return factors;
	}

}

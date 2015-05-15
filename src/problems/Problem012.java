package problems;

public class Problem012 {

	/*
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
	*/
	
//	public static void main(String[] args) {
//		int[] testcases = {1, 3, 6, 10, 15, 21, 28};
//		for (int i : testcases)
//			System.out.println(i + " : " + countFactors(i));
//	}
	
	public static void main(String[] args) {
		int cumul = 1;
		int curr = 1;
		while (countFactors(cumul) <= 500) {
			curr++;
			cumul += curr;
			if (curr % 100 == 0)
				System.out.println(curr + ", " + cumul + ", " + countFactors(cumul));
		}
		System.out.println(cumul);
	}
	
	public static int countFactors(int n) {
		n = Math.abs(n);
		int count = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				count++;
		return count;
	}

}

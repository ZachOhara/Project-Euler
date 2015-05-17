package common;

public class NumberWord {

	static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String[] multiples = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};

	int decimal;
	String written = "";
	int letterCount = 0;


	public NumberWord(int n) {
		this.decimal = n;
		int firstDigit = n/100;
		int secondDigit = (n/10)%10;
		int thirdDigit = n%10;

		if (firstDigit > 0) {
			this.written += digits[firstDigit] + "hundredand";
		}

		if (secondDigit > 1) {
			this.written += multiples[secondDigit];
		}
		if (secondDigit == 1) {
			this.written += teens[thirdDigit];
		} else if (thirdDigit > 0) {
			this.written += digits[thirdDigit];
		}
		if (n == 1000) {
			this.written = "onethousand";
		}

		this.letterCount = this.written.length();		
		System.out.println(this.written + ", " + this.letterCount);

	}

	public String toString() {
		return this.written;
	}

	public int letterCount() {
		return this.letterCount;
	}

}

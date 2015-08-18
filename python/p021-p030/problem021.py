from common import factors

def main():
	amicableSum = 0
	LIMIT = 10000
	for a in range(2, LIMIT):
		if amicable(a):
			amicableSum += a
	print(amicableSum)
	
def amicable(a):
	pdSumA = pdSum(a)
	return pdSumA != a and pdSum(pdSumA) == a
	
# Proper divisor sum
def pdSum(n):
	return sum(factors.properDivisorsOf(n))
	
if __name__ == "__main__":
	main()
import common.MathUtil as MathUtil

def largestPrimeFactorOf(n):
	primeList = MathUtil.primeFactorsOf(n)
	primeList.sort()
	return primeList[-1]

print(largestPrimeFactorOf(600851475143))
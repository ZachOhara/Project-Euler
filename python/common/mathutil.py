import primes

def factorsOf(n):
	if n == 1:
		return [1]
	factorList = []
	div = 1
	while not div in factorList:
		if n % div == 0:
			factorList.append(div)
			if div ** 2 != n:
				factorList.append(int(n / div))
		div += 1
	return factorList

def primeFactorsOf(n):
	primeFactorList = factorsOf(n)
	primeFactorList.remove(1)
	primeFactorList.remove(n)
	for i in primeFactorList[::-1]:
		if not primes.isPrime(i):
			primeFactorList.remove(i)
	return primeFactorList

def containsFactor(itr, n):
	for i in itr:
		if n % i == 0:
			return True
	return False

def isPalindrome(x):
	return str(x) == str(x)[::-1]

def generateTriangleNumbers():
	tri = 0
	i = 1
	while True:
		tri += i
		yield tri
		i += 1
		
def collatzSequence(n):
	seq = [n]
	while seq[-1] != 1:
		if seq[-1] % 2 == 0:
			seq.append(int(seq[-1] / 2))
		else:
			seq.append((seq[-1] * 3) + 1)
	return seq

def sumOfDigits(n):
	digitSum = 0
	for c in str(n):
		digitSum += int(c)
	return digitSum

if __name__ == "__main__":
	print(collatzSequence(13))
		

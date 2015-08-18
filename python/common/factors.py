from common import primes

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

def properDivisorsOf(n):
	factors = factorsOf(n)
	factors.remove(n)
	return factors

def gcd(a, b):
	factorsA = factorsOf(a)
	factorsB = factorsOf(b)
	factorsA.sort()
	for i in factorsA[::-1]:
		if i in factorsB:
			return i

def isPerfect(n):
	return sum(properDivisorsOf(n)) == n

def isDeficient(n):
	return sum(properDivisorsOf(n)) < n

def isAbundant(n):
	return sum(properDivisorsOf(n)) > n

def primeFactorsOf(n):
	if primes.isPrime(n):
		return [n]
	primeFactorList = factorsOf(n)
	primeFactorList.remove(1)
	primeFactorList.remove(n)
	for i in primeFactorList[::-1]:
		if not primes.isPrime(i):
			primeFactorList.remove(i)
	return primeFactorList

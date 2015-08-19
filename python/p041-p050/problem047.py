from common import factors

def main():
	print(firstWithConsecutive(4))

def firstWithConsecutive(factors):
	i = 2
	while True:
		if not i % 1000: print(i)
		if isConsecutiveFactors(i, factors):
			return i
		i += 1

def isConsecutiveFactors(n, amount):
	for i in range(n, n + amount):
		if len(factors.primeFactorsOf(i)) != amount:
			return False
	return True

if __name__ == "__main__":
	main()

from common import primes

def main():
	maxValues = 0
	bestA, bestB = 0, 0
	for a in range(-999, 1000):
		#if not a % 50: print(a)
		for b in range(-999, 1000):
			cv = consecutiveValues(a, b)
			if cv > maxValues:
				maxValues = cv
				bestA, bestB = a, b
	print(bestA * bestB)

def consecutiveValues(a, b):
	n = 0
	while True:
		if not primes.isPrime((n ** 2) + (a * n) + b):
			return n
		n += 1

if __name__ == "__main__":
	main()

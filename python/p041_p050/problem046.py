from common import primes

def main():
	primenums = primes.primesTo(10 ** 4) #primes.readPrimes()
	i = 11
	while True:
		#if not (i-1) % 100: print(i)
		if i not in primenums:
			if not any((i - (2*(j**2))) in primenums for j in range(1, int((i / 2) ** 0.5) + 1)):
				print(i)
				break
		i += 2

if __name__ == "__main__":
	main()

import math

def main():
	values = []
	for n in range(1, 101):
		for r in range(n + 1):
			if combination(n, r) > 1000000:
				values.append(n)
	print(len(values))

def combination(n, r):
	if r > n:
		raise Exception("R must be less than or equal to N")
	return int(math.factorial(n) / (math.factorial(r) * math.factorial(n - r)))

if __name__ == "__main__":
	main()

import math

def main():
	print("Stop the program manually when updates stop coming frequently...")
	factSum = 0
	i = 3
	while True:
		if isFactorialSum(i):
			factSum += i
			print("i=", i, "; sum=", factSum)
		i += 1

def isFactorialSum(n):
	return sum([math.factorial(int(c)) for c in str(n)]) == n

if __name__ == "__main__":
	main()

def main():
	print("Stop the program manually when updates stop coming frequently...")
	summableNums(5)
	
def summableNums(power):
	currentSum = 0
	i = 0
	while True:
		if isSumOfDigitPowers(i, power):
			currentSum += i
			print("i =", i, "; sum =", currentSum)
		i += 1
	
def isSumOfDigitPowers(n, power):
	return n > 1 and sumOfDigitPowers(n, power) == n
	
def sumOfDigitPowers(n, power):
	return sum([int(c) ** power for c in str(n)])

if __name__ == "__main__":
	main()
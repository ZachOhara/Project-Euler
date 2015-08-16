
def main():
	print(calculateDifference(100))

def calculateDifference(n):
	return squareOfSums(n) - sumOfSquares(n)

def sumOfSquares(n):
	sumSq = 0
	for i in range(1, n+1):
		sumSq += i ** 2
	return sumSq

def squareOfSums(n):
	return sum(range(1, n+1)) ** 2

if __name__ == "__main__":
	main()
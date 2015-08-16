from common import sequence

def main():
	print(fibonacciTo(100))
	print(fibonacciTerms(20))

def fibonacciSequence():
	a, b = 0, 1
	yield a
	yield b
	while True:
		a, b = b, a+b
		yield b

def fibonacciTo(limit):
	return sequence.sequenceTo(fibonacciSequence, limit)

def fibonacciTerms(terms):
	return sequence.sequenceTerms(fibonacciSequence, terms)

def isFibonacci(n):
	return sequence.sequenceContains(fibonacciSequence, n)
		
if __name__ == "__main__":
	main()
	
from common import fibonacci

def main():
	print(fibIndexOfLength(1000))
	
def fibIndexOfLength(length):
	for i, fib in enumerate(fibonacci.fibonacciSequence()):
		if len(str(fib)) >= length:
			return i
	
if __name__ == "__main__":
	main()